<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>��ӷ�����Ŀ</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="addService" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> ����</button>
    <a href="#myModal" data-toggle="modal" class="btn">�������</a>
  <div class="btn-group">
  </div>
</div>
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">�˻���Ϣ</a></li>
      
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>������Ŀ���</label>
        <input  name="service.serviceNumber" type="text" 
        		 class="input-xlarge" />
        
        <label>������Ŀ����</label>
        <input  name="service.serviceName" type="text" 
        		 class="input-xlarge" />
        
        <label>��λ</label>
        <input  name="service.serviceUnit" type="text" 
        		 class="input-xlarge" />
        
        <label>����</label>
        <input  name="service.servicePrice" type="text" 
        		 class="input-xlarge" />
        
    
      </div>
      <div class="tab-pane fade" id="profile">
    
      </div>
  </div>

</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">��</button>
    <h3 id="myModalLabel">�������</h3>
  </div>
  <div class="modal-body">
    
    <p class="error-text"><i class="icon-warning-sign modal-icon"></i>��ȷ��Ҫ������?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">ȡ��</button>
    
    
    <a href="services" 
    	class="btn btn-danger" >����</a>
    
  </div>
</div>



                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>