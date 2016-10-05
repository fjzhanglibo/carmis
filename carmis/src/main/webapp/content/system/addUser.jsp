<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>添加账户</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="addUser" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> 保存</button>
    <a href="#myModal" data-toggle="modal" class="btn">放弃添加</a>
  <div class="btn-group">
  </div>
</div>
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">账户信息</a></li>
      
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
 
 

 
      
    <s:fielderror cssClass="errorinf"/>	
    <s:if test="actionMessages.size()>0">  

		<s:actionmessage cssClass="errorinf"/>
  
 		        
		
		</s:if>






		
        <label>账户名</label>
        <input  name="userBean.userAccount" type="text" 
        		 class="input-xlarge"/>
        <label>姓名</label>
        <input  name="userBean.userName" type="text" 
        		class="input-xlarge"/>
        <label>密码</label>
        <input  name="userBean.userPassword" type="text" 
        		 class="input-xlarge"/>
              
        <label>所属部门</label>
        <select name="userBean.userDepartment" 
        		id="DropDownTimezone" class="input-xlarge">                     
          <s:iterator value="department" status="index">
          <option value="<s:property value="departmentName"/>"  >     
          <s:property value="departmentName"/>
          </option>
          </s:iterator>         
    </select>
    
        <label>所属角色</label>
        <select name="userBean.userPart" 
        		id="DropDownTimezone" class="input-xlarge">                     
          <s:iterator value="part" status="index">
          <option value="<s:property value="partName"/>" >     
          <s:property value="partName"/>
          </option>
          </s:iterator>         
    </select>
    
    
      </div>
      <div class="tab-pane fade" id="profile">
    
      </div>
  </div>

</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">放弃添加</h3>
  </div>
  <div class="modal-body">
    
    <p class="error-text"><i class="icon-warning-sign modal-icon"></i>你确定要放弃吗?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
    
    
    <a href="users" 
    	class="btn btn-danger" >放弃</a>
    
  </div>
</div>


                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>