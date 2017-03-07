package cc.openhome.S05;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

/**
 * package/file: cc.openhome/CompressionWrapper
 * author: pcwuyu
 * version: 2016/9/19 15:17
 */
public class CompressionWrapper extends HttpServletResponseWrapper {
    private GZipServletOutputStream gZServletOutputStream;
    private PrintWriter printWriter;

    public CompressionWrapper(HttpServletResponse resp) {
        super(resp);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (printWriter != null) {  //已调用过 getWriter(), 再调用getOutputStream() 就抛出异常
            throw new IllegalStateException();
        }

        if (gZServletOutputStream == null) {
            gZServletOutputStream = new GZipServletOutputStream(getResponse().getOutputStream());  //创建有压缩功能的 GZipServletOutputStream 对象
        }
        return gZServletOutputStream;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if (gZServletOutputStream != null) {  //已调用过GetOutputStream(), 再调用 getWrite() 就抛出异常
            throw new IllegalStateException();
        }

        if (printWriter == null) {
            gZServletOutputStream = new GZipServletOutputStream(getResponse().getOutputStream());  //创建 GZipServletOutputStream 对象, 工构造 printWriter 时使用
            OutputStreamWriter osw = new OutputStreamWriter(gZServletOutputStream, getResponse().getCharacterEncoding());
            printWriter = new PrintWriter(osw);
        }
        return PrintWriter;
    }

    @Override
    public void setContentLength(int len) {
        //不实现此方法的内容,因为真正的输出会被压缩
    }

    public GZIPOutputStream getGZIPOutputStream() {
        if (this.gZServletOutputStream == null) {
            return null;
        }
        return this.gZServletOutputStream.getGzipOutputStream();
    }
}
