<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>登录系统</title>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/templatemo_style.css" rel="stylesheet" type="text/css">

</head>
<body class="templatemo-bg-gray">
<div class="container">
		<div class="col-md-12">
			<h1 class="margin-bottom-15">系统登陆</h1>
			<form class="form-horizontal templatemo-container templatemo-login-form-1 margin-bottom-30" role="form" action="processLogin" method="post">				
		        <div class="form-group">
		          <div class="col-xs-12">		            
		            <div class="control-wrapper">
		            	<label for="username" class="control-label fa-label"><img  src="${pageContext.request.contextPath}/images/userlog.jpg"></label>
		            	<s:textfield type="text" name="user.userAccount" cssClass="form-control"  placeholder="用户名"/>
		            </div>		            	            
		          </div>              
		        </div>
		        <div class="form-group">
		          <div class="col-md-12">
		          	<div class="control-wrapper">
		            	<label for="password" class="control-label fa-label"><img  src="${pageContext.request.contextPath}/images/passlog.jpg"></label>
		            	<s:textfield type="password" name="user.userPassword" cssClass="form-control"  placeholder="密码"/>
		            </div>
		          </div>
		        </div>
		        
		       
		        <div class="form-group">
		          <div class="col-md-12">
		          	<div class="control-wrapper">
		          		<input type="submit" value="登  陆" class="btn btn-info">
		          		
		          		<s:reset  theme="simple" value="重  填" cssClass="btn btn-info"/>
		          		
		          	</div>
		          </div>
		        </div>
		        <hr>
		        <div class="form-group">
		        <s:fielderror cssClass="errorinf"/>	
		        
		        <s:if test="actionMessages.size()>0">
				<s:actionmessage cssClass="errorinf"/>
				</s:if>
		        </div>
		      </form>
		      
		</div>
	</div>
</body>
</html>