<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>顾客信息</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>


	<div class="btn-toolbar">

   <button class="btn">总数：<s:property value="carCount"/></button>
  
	<form id="tab" action="searchByCustomer" method="post" style="float:right;">
	<table><tr>
	<td><input  name="str" type="text" placeholder="车牌号/姓名/电话/身份证号"
        		 class="input-xlarge"> </input>
    </td><td><button class="btn" style="margin-top:-10px;margin-left:5px;">搜索</button></td>
    </tr></table>
    </form>
    
  <div class="btn-group"></div>
  
  
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th style="width: 6em;">身份证号码</th>
          <th style="width: 6em;">姓名</th>
          <th style="width: 6em;">性别</th>
          <th style="width: 6em;">电话</th>
          <th style="width: 6em;">地址</th>
          <th style="width: 6em;">备注</th>
          <th style="width: 6em;">拥有车辆</th>
          <th style="width: 6em;">消费次数</th>
          <th style="width: 6em;">消费金额</th>
          <th style="width: 6em;">顾客等级</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="customers" status="index">

                <tr class="mythset">
                  <td><s:property value="customerIdCard"/></td>
                  
                  <td><s:property value="customerName"/></td>
                  <td><s:property value="customerSex"/></td>
                  <td><s:property value="customerTel"/></td>
                  <td><s:property value="customerAddress"/></td>
                  <td><s:property value="customerScript"/></td>
                  <td><s:property value="carNumber"/></td>
                  <td><s:property value="serviceCount"/></td>
                  <td><s:property value="expense"/></td>
                  <td><s:property value="rank"/></td>
                                   
          <td>
       
          <td>    <a href="carExpenses1?carNumber=<s:property value="carNumber"/>" role="button" ><i class="icon-info-sign"></i></a>
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