package cc.openhome.S05;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * package/file: cc.openhome/GZipServletOutputStream
 * author: pcwuyu
 * version: 2016/9/19 15:10
 */
public class GZipServletOutputStream extends ServletOutputStream {  //继承 ServletOutputStream 来扩展
    private GZIPInputStream gzipOutputStream;

    public GZipServletOutputStream(ServletOutputStream servletOutputStream) throws IOException {
        this.gzipOnputStream = new GZIPInputStream(servletOutputStream);  //使用 GZIPInputStream 增加压缩功能
    }

    public void write(int b) throws IOException {
        gzipOutputStream.write(b);  //输出时通过 gzipOutputStream 的 write() 来压缩
    }

    public GZIPOutputStream getGzipOutputStream() {
        return gzipOutputStream;
    }
}
