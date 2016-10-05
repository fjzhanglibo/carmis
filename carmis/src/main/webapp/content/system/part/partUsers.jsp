<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>部门人员管理</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>

<s:iterator value="map" var="a">

	<div class="row-fluid">
   <div class="block">
        <a href="#<s:property value="key"/>" class="block-heading" data-toggle="collapse">
        	<s:property value="key"/></a>
        <div id="<s:property value="key"/>" class="block-body collapse in">
        
		
		<table class="table">
              <thead>
                <tr>
                  <th>#</th>
                  <th>用户名</th>
                  <th>姓名</th>
                  <th>密码</th>
                  <th>部门</th>
                  <th>登陆次数</th>
                  <th>角色</th>
                  <th style="width: 26px;"></th>
                </tr>
              </thead>
              <tbody>
              <s:iterator value="#a.value" >
                <tr>
                  <td><s:property value="userId"/></td>
                  <td><s:property value="userAccount"/></td>               
                  <td><s:property value="userName"/></td>
                  <td><s:property value="userPassword"/></td>
                  <td><s:property value="userDepartment"/></td>
                  <td><s:property value="userEnterDegree"/></td>
                  <td><s:property value="userPart"/></td>
                  <td>
              		<a href="showChangeUser?user.userAccount=<s:property value="userAccount"/>"><i class="icon-pencil"></i></a>
              		<a href="delUser?userAccount=<s:property value="userAccount"/>" role="button" ><i class="icon-remove"></i></a>
          		  </td>
                </tr>
              </s:iterator>
              </tbody>
            </table>
            
        </div>
    </div>
</div>
</s:iterator>


	<%@include file="../../../footer.jsp"%>
</body>
</html>