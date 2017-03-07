package cc.openhome.S05;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * package/file: cc.openhome/CompressionFilter
 * author: pcwuyu
 * version: 2016/9/19 15:42
 */
@WebFilter(filterName = "CompressionFilter", urlPatterns = {"/*"})
public class CompressionFilter implements Filter {
    public void init(FilterConfig filterConfig) {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String encodings = req.getHeader("accept-encoding");
        if ((encodings != null) && (encodings.indexOf("gzip") > -1)) {
            CompressionWrapper responseWrapper = new CompressionWrapper(res);
            responseWrapper.setHeader("content-encoding", "gzip");

            chain.doFilter(request, responseWrapper);

            GZIPOutputStream gzipOutputStream = responseWrapper.getGZIPOutputStream();

            if (gzipOutputStream != null) {
                gzipOutputStream.finish();
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destory() {

    }
}
