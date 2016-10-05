<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>��Ա������</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>


	<div class="btn-toolbar">
    <a href="showChangeService"><button class="btn btn-primary"><i class="icon-plus"></i> �·�����Ŀ</button></a>
    <button class="btn">������<s:property value="serviceCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>#</th>
          <th>������Ŀ���</th>
          <th>������Ŀ����</th>
          <th>��λ</th>
          <th>����</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="services" status="index">

                <tr class="mythset">
                  <td><s:property value="serviceId"/></td>
                  <td><s:property value="serviceNumber"/></td>
                  <td><s:property value="serviceName"/></td>
                  <td><s:property value="serviceUnit"/></td>
                  <td><s:property value="servicePrice"/></td>

                                   
          <td>
              <a href="showChangeService?serviceId=<s:property value="serviceId"/>"><i class="icon-pencil"></i></a>
              
          </td>
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>




	<%@include file="../../footer.jsp"%>
</body>
</html>