<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'b.jsp' starting page</title>
    
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
  <!--  
  <%
	  String user=(String)session.getAttribute("user");
	  if(user==null){
	  	request.setAttribute("msg", "您还未登陆,请先登陆");
	  	request.getRequestDispatcher("/jsp1/c.jsp").forward(request, response);
	  }
   %>

   	欢迎用户:<%=user %>
   <table><tr><td>test </td></tr></table>-->
  </body>
</html>
