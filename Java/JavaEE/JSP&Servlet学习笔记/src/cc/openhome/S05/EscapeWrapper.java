package cc.openhome.S05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * package/file: cc.openhome/EscapeWrapper
 * author: pcwuyu
 * version: 2016/9/19 10:45
 */
public class EscapeWrapper extends HttpServletRequestWrapper {
    public EscapeWrapper(HttpServletRequest request) {
        super(request);  //必须调用父类构造器,传入 httpservletrequest 实例
    }

    @Override
    public String getParameter(String name) {  //重新定义 getParameter() 方法
        String value = getRequest().getParameter(name);
        return StringescapeUtils.escapeHtml(value);  //将取得请求参数值进行字符替换

    }
}
