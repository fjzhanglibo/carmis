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
<form id="tab" action="changeRank" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> ����</button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>��Ա�ȼ�ID</label>
        <input  name="rankBean.rankId" type="text" 
        		value="<s:property value="rankBean.rankId"/>" class="input-xlarge" readonly="readonly"/>
        
        <label>�ȼ�����</label>
        <input  name="rankBean.rankName" type="text" 
        		value="<s:property value="rankBean.rankName"/>" class="input-xlarge" />
        
        <label>�ۿ۶�</label>
        <input  name="rankBean.rankDiscount" type="text" 
        		value="<s:property value="rankBean.rankDiscount"/>" class="input-xlarge" />
        
        <label>�쿨����</label>
        <input  name="rankBean.rankCost" type="text" 
        		value="<s:property value="rankBean.rankCost"/>" class="input-xlarge" />
        
        <label>��ע</label>
        <input  name="rankBean.rankScript" type="text" 
        		value="<s:property value="rankBean.rankScript"/>" class="input-xlarge" />
        
              				
         
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