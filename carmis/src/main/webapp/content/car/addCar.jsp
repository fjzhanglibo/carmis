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
      
      <li><a href="#profile" data-toggle="tab">��ӹ˿���Ϣ</a></li>
      
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
<form id="tab" action="addCar" method="post"> 

		<label>���ƺ�</label>
        <input  name="car.carNumber" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        value="<s:property value="carBean.carNumber"/>" class="input-xlarge"/>
		          
        <label>Ʒ��</label>
        <input  name="car.carBrand" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        value="<s:property value="carBean.carBrand"/>" class="input-xlarge"/>
              
        <label>��ɫ</label>
        <input  name="car.carColor" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        		value="<s:property value="carBean.carColor"/>" class="input-xlarge"/>        
   
    
        <label>���</label>
        <input  name="car.carMileage" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        		value="<s:property value="carBean.carMileage"/>" class="input-xlarge"/>       
    <s:if test="showBut==0">
    <div> 
    <a href="showCheckout?carId=<s:property value="carBean.carId"/>" role="button" >�������Ա��</a>
    </div>
    </s:if>
    <s:else>
    	<div>
            <button class="btn btn-primary">ȷ��</button>
        </div>
    </s:else>
        
  </form>  
      </div>
      <div class="tab-pane fade" id="profile">
    <form id="tab2" 
    	action="addCustomer" method="post">
    	<input type="hidden" name="carId" value="<s:property value="carBean.carId"/>"></input>
    	<input type="hidden" name="checkout" value="1"></input>
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




                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>