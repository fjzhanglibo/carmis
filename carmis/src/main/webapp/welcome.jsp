<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>欢迎登入</title>
      
  </head>


  <body class=""> 
 
    
    <%@include file="navbar.jsp"%>
    <%@include file="sideNav.jsp"%>
    <%@include file="header.jsp"%>
    


   
    
    
    <br/>   <br/>  <br/>  <br/>              

   <h2 class="info">欢迎登陆   <s:property value="#session.name"/></h2>
	<br/>   <br/>  <br/> 
	<s:if test="actionMessages.size()>0">
		<s:actionmessage cssClass="page-title"/>
		</s:if> 
	<br/> <br/>   <br/>  <br/>  <br/> <br/>   <br/>  <br/>  <br/> <br/>   <br/>  <br/>  <br/> <br/>   <br/>  <br/>  <br/> 
</div></div>

	
		
    <%@include file="footer.jsp"%>
    
  </body>
</html>