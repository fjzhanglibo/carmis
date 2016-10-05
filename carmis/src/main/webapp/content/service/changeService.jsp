<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>修改会员卡信息</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="changeService" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> 保存</button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>服务项目ID</label>
        <input  name="service.serviceId" type="text" 
        		value="<s:property value="service.serviceId"/>" class="input-xlarge" readonly="readonly"/>
        
        <label>服务项目编号</label>
        <input  name="service.serviceNumber" type="text" 
        		value="<s:property value="service.serviceNumber"/>" class="input-xlarge" />
        
        <label>服务项目名称</label>
        <input  name="service.serviceName" type="text" 
        		value="<s:property value="service.serviceName"/>" class="input-xlarge" />
        
        <label>单位</label>
        <input  name="service.serviceUnit" type="text" 
        		value="<s:property value="service.serviceUnit"/>" class="input-xlarge" />
        
        <label>单价</label>
        <input  name="service.servicePrice" type="text" 
        		value="<s:property value="service.servicePrice"/>" class="input-xlarge" />
        
       				
         
      </div>
      
  </div>

</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">删除信息</h3>
  </div>
  <div class="modal-body">
    
    <p class="error-text"><i class="icon-warning-sign modal-icon"></i>你确定要删除吗?</p>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
    
    
    <a href="delUser?userAccount=<s:property value="userBean.userAccount"/>" 
    	class="btn btn-danger" >删除</a>
    
  </div>
</div>


                    
    <%@include file="../../footer.jsp"%>
    


    

</body>
</html>