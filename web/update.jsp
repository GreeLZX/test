
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="update.action" method="post">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>
                姓名:
            </td>
            <td>
                <input type="text" name="studentEntity.name" value="${studentEntity.name}">
            </td>
        </tr>

        tr>
        <td>
            性别:
        </td>
        <td>
            <input type="text" name="studentEntity.sex" value="${studentEntity.sex}">
        </td>
        </tr>
        tr>
        <td>
            班级:
        </td>
        <td>
            <input type="text" name="studentEntity.cname" value="${studentEntity.cname}">
        </td>
        </tr>
        tr>
        <td>
            年龄:
        </td>
        <td>
            <input type="text" name="studentEntity.age" value="${studentEntity.age}">
        </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="studentEntity.id" value="${studentEntity.id}">
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
