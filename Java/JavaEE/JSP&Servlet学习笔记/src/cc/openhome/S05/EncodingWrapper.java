package cc.openhome.S05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * package/file: cc.openhome/EncodingWrapper
 * author: pcwuyu
 * version: 2016/9/19 11:22
 */
public class EncodingWrapper extends HttpServletRequestWrapper {  //继承
    private String ENCODING;

    public EncodingWrapper(HttpServletRequest request, HttpServletResponse response) {
        super((request));  //必须调用父类构造器,传入 httpservletrequest实例
        this.ENCODING = ENCODING;
}

    @Override
    public String getParemeter(String name) {
        String value = getRequest().getParameter(name);
        if (value != null) {
            try {
                byte[] b = value.getBytes("ISO-8859-1");
                value = new String(b, ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
