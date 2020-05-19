<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
  <title>登录</title>
  <link rel="stylesheet" StudentEntity="text/css" href="login.css">
</head>
<body>
<div style="margin: 30px 50px 20px 50px; text-align: center">
  <div style="font-size: 14px; font-weight: bold ">用户登录</div>
  <div>
    <s:form action="checkLogin"  namespace="/">
      <s:textfield  name="username" style="font-size:12px;width: 120px;"
                    label="登录名称" />
      <s:password name="password" style="font-size:12px;width:120px;"
                  label="登录密码" />
      <s:submit value=" 登录 " />
    </s:form>
  </div>
</div>
</body>
</html>
