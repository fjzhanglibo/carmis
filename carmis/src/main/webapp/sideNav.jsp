<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  
<body>

<div class="sidebar-nav">
<s:if test="#session.system ==1"> 
        <a href="#system-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>系统管理 <i class="icon-chevron-up"></i></a>
        <ul id="system-menu" class="nav nav-list collapse in">
            <li><a href="systemMain">概况</a></li>
            <li ><a href="users">账户目录</a></li>
            <li ><a href="departments">部门目录</a></li>
            <li ><a href="depUsers">部门人员目录</a></li>
            <li ><a href="parts">角色目录</a></li>
            <li ><a href="rights">权限目录</a></li>            
        </ul>
</s:if>
<s:if test="#session.count == 1">
       <a href="#accounts-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-briefcase"></i>账户  <i class="icon-chevron-up"></i></a>
        <ul id="accounts-menu" class="nav nav-list collapse">
            <li ><a href="logout">登出</a></li>

            <li ><a href="showChangeAccount?user.userAccount=<s:property value="#session.account"/>" >修改账户</a></li>
        </ul>
</s:if>
<s:if test="#session.car == 1">
        <a href="cars" class="nav-header collapsed" ><i class="icon-info-sign"></i>车辆信息</a>
</s:if>
<s:if test="#session.customer == 1">        
        <a href="customers" class="nav-header collapsed" ><i class="icon-group"></i>顾客信息</a>
</s:if>        
<s:if test="#session.checkout == 1">
        <a href="cars?checkout='yes'" class="nav-header" ><i class="icon-legal"></i>结账</a>
</s:if>  
<s:if test="#session.rank == 1">      
        <a href="ranks" class="nav-header collapsed" ><i class="icon-credit-card"></i>会员卡管理</a>
</s:if>  
<s:if test="#session.service == 1">      
        <a href="services" class="nav-header collapsed" ><i class="icon-list-ul"></i>服务项目管理</a>
</s:if> 
<s:if test="#session.search == 1">       
        <a href="#search-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-briefcase"></i>自助查询  <i class="icon-chevron-up"></i></a>
        <ul id="search-menu" class="nav nav-list collapse">
            <li ><a href="showSearchByCar">查询车辆</a></li>

            <li ><a href="showSearchByCustomer">查询顾客</a></li>
        </ul>
</s:if>        
    </div>
</body>
</html>