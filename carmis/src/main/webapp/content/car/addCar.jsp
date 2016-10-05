<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>修改车辆信息</title>
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
      <li class="active"><a href="#home" data-toggle="tab">车辆信息</a></li>
      
      <li><a href="#profile" data-toggle="tab">添加顾客信息</a></li>
      
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
<form id="tab" action="addCar" method="post"> 

		<label>车牌号</label>
        <input  name="car.carNumber" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        value="<s:property value="carBean.carNumber"/>" class="input-xlarge"/>
		          
        <label>品牌</label>
        <input  name="car.carBrand" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        value="<s:property value="carBean.carBrand"/>" class="input-xlarge"/>
              
        <label>颜色</label>
        <input  name="car.carColor" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        		value="<s:property value="carBean.carColor"/>" class="input-xlarge"/>        
   
    
        <label>里程</label>
        <input  name="car.carMileage" type="text" <s:if test="showBut==0"> readonly="readonly"</s:if>
        		value="<s:property value="carBean.carMileage"/>" class="input-xlarge"/>       
    <s:if test="showBut==0">
    <div> 
    <a href="showCheckout?carId=<s:property value="carBean.carId"/>" role="button" >不办理会员卡</a>
    </div>
    </s:if>
    <s:else>
    	<div>
            <button class="btn btn-primary">确定</button>
        </div>
    </s:else>
        
  </form>  
      </div>
      <div class="tab-pane fade" id="profile">
    <form id="tab2" 
    	action="addCustomer" method="post">
    	<input type="hidden" name="carId" value="<s:property value="carBean.carId"/>"></input>
    	<input type="hidden" name="checkout" value="1"></input>
        <label>姓名</label>
        <input name="customerBean.customerName" value="<s:property value="customerBean.customerName"/>"
        		type="text" class="input-xlarge">
        <label>身份证号</label>
        <input name="customerBean.customerIdCard" value="<s:property value="customerBean.customerIdCard"/>"
        		type="text" class="input-xlarge">
        <label>性别</label>
        <select name="customerBean.customerSex" class="input-xlarge">
    		<option value="男">男</option>
    		<option value="女">女</option>
  		</select>
        <label>电话</label>
        <input name="customerBean.customerTel" value="<s:property value="customerBean.customerTel"/>"
        		type="text" class="input-xlarge">
        		
        <label>地址</label>
        <input name="customerBean.customerAddress" value="<s:property value="customerBean.customerAddress"/>"
        		type="text" class="input-xlarge">
        		
        <label>备注</label>
        <input name="customerBean.customerScript" value="<s:property value="customerBean.customerScript"/>"
        		type="text" class="input-xlarge">
        <label>绑定车辆</label>
        <input name="customerBean.carNumber" value="<s:property value="carBean.carNumber"/>" readonly="readonly"
        		type="text" class="input-xlarge">	
        		
        <label>会员等级</label>
        <select name="customerBean.rank" 
        		id="DropDownTimezone" class="input-xlarge">                     
          <s:iterator value="ranks" status="index">
          <option value="<s:property value="rankName"/>" >     
          <s:property value="rankName"/>
          </option>
          </s:iterator>         
    	</select>		
        
        <div>
            <button class="btn btn-primary">确定</button>
        </div>
        
    </form>

      </div>
  </div>

</div>




                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>