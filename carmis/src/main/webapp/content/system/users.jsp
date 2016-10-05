<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>账户管理</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>


	<div class="btn-toolbar">
    <a href="showAddUser"><button class="btn btn-primary"><i class="icon-plus"></i> 新用户</button></a>
    <button class="btn">总数：<s:property value="#request.userCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th style="width: 6em;">#</th>
          <th style="width: 6em;">账户名</th>
          <th style="width: 6em;">姓名</th>
          <th style="width: 6em;">密码</th>
          <th style="width: 6em;">部门</th>
          <th style="width: 6em;">登陆次数</th>
          <th style="width: 6em;">角色</th>
          <th style="width: 26px;">修改</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="users" status="index">

                <tr class="mythset">
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


<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">删除信息</h3>
    </div>
    <div class="modal-body">
        <p class="error-text"><i class="icon-warning-sign modal-icon"></i>你确定要删除吗?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
    
    
    <a href="delUser?userAccount=<s:property value="userAccount"/>" 
    	class="btn btn-danger" >删除</a>
    </div>
</div>


	<%@include file="../../footer.jsp"%>
</body>
</html>