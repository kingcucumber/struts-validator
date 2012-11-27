<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>validator</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <s:fielderror/>
  
    <form action="${pageContext.request.contextPath}/person/manage_save.action" method="post" >
    	username:<input type="text" name="username" />不能为空<br/>
    	phoneNO:<input type="text" name="phoneNumber" />不能为空，并且要符合手机号码格式1,3/5/8<br/>
    	<input type="submit" value="submit" />
    </form>
  </body>
</html>
