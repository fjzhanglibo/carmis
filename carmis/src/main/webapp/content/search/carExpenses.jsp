<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>������Ϣ</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>


	<div class="btn-toolbar">

   <button class="btn">������<s:property value="count"/></button>
  
    
  <div class="btn-group"></div>
  
  
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>���ƺ�</th>
          <th>����</th>
          <th>������</th>
          <th>��������</th>
          <th>����</th>
          <th>�ۿ� ��</th>
          <th>ʵ�ʼ۸�</th>

        
        </tr>
      </thead>
      <tbody>
        <s:iterator value="expenses" status="index">

                <tr class="mythset">

                  <td><s:property value="carNumber"/></td>
                  
                  <td><s:property value="customerName"/></td>
                  <td><s:property value="serviceNumber"/></td>
                  <td><s:property value="serviceName"/></td>
                  <td><s:property value="servicePrice"/></td>
                  <td><s:property value="rankDiscount"/></td>
                  <td><s:property value="price"/></td>
                
                                   
          
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>


<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    
</div>


	<%@include file="../../footer.jsp"%>
</body>
</html>