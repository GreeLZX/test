
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="insert.action" method="post">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>
                学号：
            </td>
            <td>
                <input type="text" name="studentEntity.id" value="">
            </td>
        </tr>
        <tr>
            <td>
                姓名：
            </td>
            <td>
                <input type="text" name="studentEntity.name" value="">
            </td>
        </tr>
        <tr>
            <td>
                性别:
            </td>
            <td>
                <input type="text" name="studentEntity.sex" value="">
            </td>
        </tr>
        <tr>
            <td>
                班级:
            </td>
            <td>
                <input type="text" name="studentEntity.cname" value="">
            </td>
        </tr>
        <tr>
            <td>
                年龄:
            </td>
            <td>
                <input type="text" name="studentEntity.age" value="">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="确认">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
