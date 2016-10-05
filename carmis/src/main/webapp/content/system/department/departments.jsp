<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>���Ź���</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>


	<div class="btn-toolbar">
    <a href="showAddDepartment"><button class="btn btn-primary"><i class="icon-plus"></i> �²���</button></a>
    <button class="btn">������<s:property value="#request.departmentCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>#</th>
          <th>��������</th>
          <th>��ע</th>
          <th>��������</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="departments" status="index">

                <tr class="mythset">
                  <td><s:property value="departmentId"/></td>
                  <td><s:property value="departmentName"/></td>                
                  <td><s:property value="departmentScript"/></td>
                  <td><s:property value="userNumber"/></td>

                                   
          <td>
              <a href="showChangeDepartment?department.departmentName=<s:property value="departmentName"/>"><i class="icon-pencil"></i></a>
              <a href="delDepartment?depName=<s:property value="departmentName"/>" role="button" ><i class="icon-remove"></i></a>
          </td>
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>




	<%@include file="../../../footer.jsp"%>
</body>
</html>