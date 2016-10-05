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

   <button class="btn">������<s:property value="carCount"/></button>
  
	<form id="tab" action="searchByCar" method="post" style="float:right;">
	<table><tr>
	<td><input  name="str" type="text" placeholder="���ƺ�/����/�绰"
        		 class="input-xlarge"> </input>
    </td><td><button class="btn" style="margin-top:-10px;margin-left:5px;">����</button></td>
    </tr></table>
    </form>
    
  <div class="btn-group"></div>
  
  
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th style="width: 6em;">#</th>
          <th style="width: 6em;">���ƺ�</th>
          <th style="width: 6em;">Ʒ��</th>
          <th style="width: 6em;">��ɫ</th>
          <th style="width: 6em;">���</th>
          <th style="width: 6em;">���Ѵ���</th>
          <th style="width: 6em;">���ѽ��</th>
          <th style="width: 6em;">�����˿�</th>
          <th style="width: 6em;">�˿͵绰</th>
          <th style="width: 6em;">�˿͵ȼ�</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="cars" status="index">

                <tr class="mythset">
                  <td><s:property value="carId"/></td>
                  <td><s:property value="carNumber"/></td>
                  
                  <td><s:property value="carBrand"/></td>
                  <td><s:property value="carColor"/></td>
                  <td><s:property value="carMileage"/></td>
                  <td><s:property value="serviceCount"/></td>
                  <td><s:property value="expense"/></td>
                  <td><s:property value="customer"/></td>
                  <td><s:property value="customerTel"/></td>
                  <td><s:property value="rankName"/></td>
                                   
          
          <td>    <a href="carExpenses1?carId=<s:property value="carId"/>" role="button" ><i class="icon-info-sign"></i></a>
          </td>
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