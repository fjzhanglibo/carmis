<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>�޸Ĺ˿���Ϣ</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="changeCustomer" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> ����</button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>ID</label>
        <input  name="customerBean.customerId" type="text" 
        		value="<s:property value="customerBean.customerId"/>" class="input-xlarge" readonly="readonly"/>
        <label>���֤����</label>
        <input  name="customerBean.customerIdCard" type="text" 
        		value="<s:property value="customerBean.customerIdCard"/>" class="input-xlarge"/>
        <label>����</label>
        <input  name="customerBean.customerName" type="text" 
        		value="<s:property value="customerBean.customerName"/>" class="input-xlarge"/>
        <label>�Ա�</label>
        <input  name="customerBean.customerSex" type="text" 
        		value="<s:property value="customerBean.customerSex"/>" class="input-xlarge"/>
        		
        <label>�绰</label>
        <input  name="customerBean.customerTel" type="text" 
        		value="<s:property value="customerBean.customerTel"/>" class="input-xlarge"/>
        				
        <label>��ַ</label>
        <input  name="customerBean.customerAddress" type="text" 
        		value="<s:property value="customerBean.customerAddress"/>" class="input-xlarge"/>
        		
        <label>��Ա�ȼ�</label>
        <select name="customerBean.rank" 
        		id="DropDownTimezone" class="input-xlarge">                     
          <s:iterator value="ranks" status="index">
          <option value="<s:property value="rankName"/>" 
          		<s:if test="rankName == customerBean.rank">
          		selected="selected"
          		</s:if>  >     
          <s:property value="rankName"/>
          </option>
          </s:iterator>         
    </select>
    
    
    
        		
        <label>��ע</label>
        <input  name="customerBean.customerScript" type="text" 
        		value="<s:property value="customerBean.customerScript"/>" class="input-xlarge"/>
        				
         
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
    
    
    <a href="delUser?userAccount=<s:property value="userBean.userAccount"/>" 
    	class="btn btn-danger" >ɾ��</a>
    
  </div>
</div>


                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>