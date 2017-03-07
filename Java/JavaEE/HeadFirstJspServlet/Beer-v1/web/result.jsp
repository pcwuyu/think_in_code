<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/26
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center"> Beer Recommendations </h1>
<p>
    <%
        //这里从请求对象得到一个属性,
        List style = (List) request.getAttribute("styles");
        Iterator it = style.iterator();

        while (it.hasNext()) {
            out.println("<br/>try:" + it.next());
        }
    %>
</p>

</body>
</html>
