<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>�޸Ļ�Ա����Ϣ</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="changeService" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> ����</button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>������ĿID</label>
        <input  name="service.serviceId" type="text" 
        		value="<s:property value="service.serviceId"/>" class="input-xlarge" readonly="readonly"/>
        
        <label>������Ŀ���</label>
        <input  name="service.serviceNumber" type="text" 
        		value="<s:property value="service.serviceNumber"/>" class="input-xlarge" />
        
        <label>������Ŀ����</label>
        <input  name="service.serviceName" type="text" 
        		value="<s:property value="service.serviceName"/>" class="input-xlarge" />
        
        <label>��λ</label>
        <input  name="service.serviceUnit" type="text" 
        		value="<s:property value="service.serviceUnit"/>" class="input-xlarge" />
        
        <label>����</label>
        <input  name="service.servicePrice" type="text" 
        		value="<s:property value="service.servicePrice"/>" class="input-xlarge" />
        
       				
         
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