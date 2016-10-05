<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>�޸ĳ�����Ϣ</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">


  <div class="btn-group">
  </div>
</div>
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">������Ϣ</a></li>
      <s:if test="hasCustomer==2">
      <li><a href="#profile" data-toggle="tab">��ӹ˿���Ϣ</a></li>
      </s:if>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
<form id="tab" action="changeCar?carBean.carId=<s:property value="carBean.carId"/>" method="post">    
        
        <label>Ʒ��</label>
        <input  name="carBean.carBrand" type="text" 
        		value="<s:property value="carBean.carBrand"/>" class="input-xlarge"/>
              
        <label>��ɫ</label>
        <input  name="carBean.carColor" type="text" 
        		value="<s:property value="carBean.carColor"/>" class="input-xlarge"/>        
   
    
        <label>���</label>
        <input  name="carBean.carMileage" type="text" 
        		value="<s:property value="carBean.carMileage"/>" class="input-xlarge"/>       
    
    <div>
            <button class="btn btn-primary">ȷ��</button>
        </div>
  </form>  
      </div>
      <div class="tab-pane fade" id="profile">
    <form id="tab2" 
    	action="addCustomer?carId=<s:property value="carBean.carId"/>" method="post">
        <label>����</label>
        <input name="customerBean.customerName" value="<s:property value="customerBean.customerName"/>"
        		type="text" class="input-xlarge">
        <label>���֤��</label>
        <input name="customerBean.customerIdCard" value="<s:property value="customerBean.customerIdCard"/>"
        		type="text" class="input-xlarge">
        <label>�Ա�</label>
        <select name="customerBean.customerSex" class="input-xlarge">
    		<option value="��">��</option>
    		<option value="Ů">Ů</option>
  		</select>
        
        <label>�绰</label>
        <input name="customerBean.customerTel" value="<s:property value="customerBean.customerTel"/>"
        		type="text" class="input-xlarge">
        		
        <label>��ַ</label>
        <input name="customerBean.customerAddress" value="<s:property value="customerBean.customerAddress"/>"
        		type="text" class="input-xlarge">
        		
        <label>��ע</label>
        <input name="customerBean.customerScript" value="<s:property value="customerBean.customerScript"/>"
        		type="text" class="input-xlarge">
        <label>�󶨳���</label>
        <input name="customerBean.carNumber" value="<s:property value="carBean.carNumber"/>" readonly="readonly"
        		type="text" class="input-xlarge">	
        		
        <label>��Ա�ȼ�</label>
        <select name="customerBean.rank" 
        		id="DropDownTimezone" class="input-xlarge">                     
          <s:iterator value="ranks" status="index">
          <option value="<s:property value="rankName"/>" >     
          <s:property value="rankName"/>
          </option>
          </s:iterator>         
    	</select>		
        
        <div>
            <button class="btn btn-primary">ȷ��</button>
        </div>
    </form>

      </div>
  </div>

</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">��</button>
    <h3 id="myModalLabel">ɾ����Ϣ</h3>
  </div>
  <div class="modal-body">
    
    <p class="error-text"><i class="icon-warning-sign modal-icon"></i>��ȷ��Ҫɾ����?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">ȡ��</button>
    
    
    <a href="delcustomer?customerAccount=<s:property value="customerBean.customerAccount"/>" 
    	class="btn btn-danger" >ɾ��</a>
    
  </div>
</div>


                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>