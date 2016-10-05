<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  
<body>

<div class="sidebar-nav">
<s:if test="#session.system ==1"> 
        <a href="#system-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>ϵͳ���� <i class="icon-chevron-up"></i></a>
        <ul id="system-menu" class="nav nav-list collapse in">
            <li><a href="systemMain">�ſ�</a></li>
            <li ><a href="users">�˻�Ŀ¼</a></li>
            <li ><a href="departments">����Ŀ¼</a></li>
            <li ><a href="depUsers">������ԱĿ¼</a></li>
            <li ><a href="parts">��ɫĿ¼</a></li>
            <li ><a href="rights">Ȩ��Ŀ¼</a></li>            
        </ul>
</s:if>
<s:if test="#session.count == 1">
       <a href="#accounts-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-briefcase"></i>�˻�  <i class="icon-chevron-up"></i></a>
        <ul id="accounts-menu" class="nav nav-list collapse">
            <li ><a href="logout">�ǳ�</a></li>

            <li ><a href="showChangeAccount?user.userAccount=<s:property value="#session.account"/>" >�޸��˻�</a></li>
        </ul>
</s:if>
<s:if test="#session.car == 1">
        <a href="cars" class="nav-header collapsed" ><i class="icon-info-sign"></i>������Ϣ</a>
</s:if>
<s:if test="#session.customer == 1">        
        <a href="customers" class="nav-header collapsed" ><i class="icon-group"></i>�˿���Ϣ</a>
</s:if>        
<s:if test="#session.checkout == 1">
        <a href="cars?checkout='yes'" class="nav-header" ><i class="icon-legal"></i>����</a>
</s:if>  
<s:if test="#session.rank == 1">      
        <a href="ranks" class="nav-header collapsed" ><i class="icon-credit-card"></i>��Ա������</a>
</s:if>  
<s:if test="#session.service == 1">      
        <a href="services" class="nav-header collapsed" ><i class="icon-list-ul"></i>������Ŀ����</a>
</s:if> 
<s:if test="#session.search == 1">       
        <a href="#search-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-briefcase"></i>������ѯ  <i class="icon-chevron-up"></i></a>
        <ul id="search-menu" class="nav nav-list collapse">
            <li ><a href="showSearchByCar">��ѯ����</a></li>

            <li ><a href="showSearchByCustomer">��ѯ�˿�</a></li>
        </ul>
</s:if>        
    </div>
</body>
</html>