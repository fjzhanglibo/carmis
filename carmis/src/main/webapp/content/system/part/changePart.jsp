<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>修改角色权限</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>
    
<div class="row-fluid">
    <div class="block span6">
        <a href="#tablewidget" class="block-heading" data-toggle="collapse">
        	<s:property value="part.partName"/><span class="label label-warning">
        	<s:property value="#request.rightsCount"/></span></a>
        <div id="tablewidget" class="block-body collapse in">
        <br/>
        <form id="tab" action="changePartRights?partName=<s:property value="part.partName"/>" method="post">
        <button class="btn btn-primary"><i class="icon-save"></i> 保存</button>
            <table class="table">
              
              <tbody>
              <s:iterator value="lists" status="stat" var="li">
             
                <tr <s:if test="b"> class="label label-warning" </s:if> >
                  <td><input type="checkbox" name="rightsName"  <s:if test="b">checked="checked"</s:if>
                  	value="<s:property value="rightsName"/>"/></td>
                  <td><s:property value="rightsId"/></td>
                  <td><s:property value="rightsName"/></td>
                  
                </tr>
               </s:iterator>
                
              </tbody>
            </table>
            </form>
        </div>
    </div>
    
    <div class="block span6">
        <a href="#user" class="block-heading" data-toggle="collapse">
        	拥有用户<span class="label label-warning">
        	<s:property value="#request.userCount"/></span></a>
        <div id="user" class="block-body collapse in">
        <br/>
            <table class="table">
              <tr>
              <th>姓名</th>
              <th>所属部门</th>
              </tr>
              <tbody>
              <s:iterator value="users" status="stat" var="li">
                <tr>
                  
                  <td><s:property value="userName"/></td>
                  <td><s:property value="userDepartment"/></td>
                  
                </tr>
               </s:iterator>
                
              </tbody>
            </table>
            
        </div>
    </div>
    
</div>


                    
    <%@include file="../../../footer.jsp"%>
    


</body>
</html>