<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>�޸��˻�</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>
    
<div class="btn-toolbar">
<form id="tab" action="changeAccount?userBean.userAccount=<s:property value="userBean.userAccount"/>" method="post">
    <button class="btn btn-primary"><i class="icon-save"></i> ����</button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">�˻���Ϣ</a></li>
      <li><a href="#profile" data-toggle="tab">����</a></li>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    
        
        <label>����</label>
        <input  name="userBean.userName" type="text" 
        		value="<s:property value="userBean.userName"/>" class="input-xlarge"/>
              
        <label>��������</label>
        <input  readonly="readonly"  name="userBean.userDepartment" type="text" 
        		value="<s:property value="userBean.userDepartment"/>" class="input-xlarge"/>
    
        <label>������ɫ</label>
        <input  readonly="readonly"  name="userBean.userPart" type="text" 
        		value="<s:property value="userBean.userPart"/>" class="input-xlarge"/>
    
    
      </div>
      <div class="tab-pane fade" id="profile">
    <form id="tab2" 
    	action="changeUser?userBean.userAccount=<s:property value="userBean.userAccount"/>" method="post">
        <label>������</label>
        <input name="userBean.userPassword" value="<s:property value="userBean.userPassword"/>"
        		type="password" class="input-xlarge">
        <div>
            <button class="btn btn-primary">ȷ��</button>
        </div>
    </form>
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
    
    
    <a href="delUser?userAccount=<s:property value="userBean.userAccount"/>" 
    	class="btn btn-danger" >ɾ��</a>
    
  </div>
</div>


                    
    <%@include file="../../../footer.jsp"%>
    


    

</body>
</html>