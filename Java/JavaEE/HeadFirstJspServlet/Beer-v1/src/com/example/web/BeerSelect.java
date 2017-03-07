package com.example.web;

import com.example.model.BeerExpert;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * package/file: com.example.web/BeerSelect
 * author: pcwuyu
 * version: 2016/9/26 15:34
 */
//httpservlet扩展了GenericServlet,他实现了Servlet接口
public class BeerSelect extends HttpServlet {
    //我们使用doPost来处理HTTP请求,因为HTML表单指出method=Post
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        //这个方法来自ServletResponse接口
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br/>");
        //这个方法来自ServletRequest接口.注意,这个参数
        // 与HTML<select>标记中的属性值匹配
        String c = request.getParameter("color");
        //这里我们没有返回建议,只是把测试信息显示出来
        //out.println("<br/>Got beer color" + c);
        //实例化Expert累,并调用setBrands()
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        Iterator it = result.iterator();

        while (it.hasNext()) {
            out.println("<br/>try:" + it.next());
            /**
             * 打印建议(模型返回的ArrayList中的啤酒品牌项)
             * 在最后一个版本v3中,建议将会从JSP打印,而不是从Servlet打印
             */
        }
    }
}
