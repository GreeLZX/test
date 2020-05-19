<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<title>首页</title>
</head>
<table border="1"  align="center" >
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>班级</th>
        <th>年龄</th>

        <th colspan="2">操作</th>
    </tr>

    <s:iterator value="studentEntityList" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.sex}</td>
            <td>${p.cname}</td>
            <td>${p.sex}</td>
            <td><a href="detail.action?studentEntity.id=${p.id}">修改</a></td>
            <td><a href="delete.action?studentEntity.id=${p.id}">删除</a></td>
        </tr>
    </s:iterator>
    <tr>
        <td colspan="5" align="center"><a href="add.jsp">添加</a></td>
    </tr>

</table>
</body>
</html>