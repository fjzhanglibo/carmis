<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath}/lib/jquery-1.7.2.min.js" type="text/javascript"></script>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>

 
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>


<body>
<div class="content">
       
        <div class="header">
            <div class="stats">
              <p class="stat">&nbsp;</p>
          </div>    
<s:if test="#request.type == 1">      
			<h1 class="page-title">系统管理</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">系统管理</li>
            <li class="active"></li>
        </ul>
 </s:if>
 
 <s:elseif test="#request.type == 2">      
			<h1 class="page-title">用户管理</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">账户目录</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 3">      
			<h1 class="page-title">账户</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li><a href="users">账户目录</a><span class="divider">/</span></li>
            <li class="active">账户</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 4">      
			<h1 class="page-title">部门管理</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">部门目录</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
  <s:elseif test="#request.type == 5">      
			<h1 class="page-title">部门</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li><a href="departments">部门目录</a><span class="divider">/</span></li>
            <li class="active">部门</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
  <s:elseif test="#request.type == 6">      
			<h1 class="page-title">部门人员</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">部门人员</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
   <s:elseif test="#request.type == 7">      
			<h1 class="page-title">角色目录</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">角色目录</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
   <s:elseif test="#request.type == 8">      
			<h1 class="page-title">修改角色权限</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li><a href="parts">角色目录</a><span class="divider">/</span></li>
            <li class="active">修改角色权限</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 

   <s:elseif test="#request.type == 9">      
			<h1 class="page-title">权限目录</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">概况</a><span class="divider">/</span></li>
            <li class="active">权限目录</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
   <s:elseif test="#request.type == 10">      
			<h1 class="page-title">更改账户</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">更改账户</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
   <s:elseif test="#request.type == 11">      
			<h1 class="page-title">车辆信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">车辆信息</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 12">      
			<h1 class="page-title">车辆消费记录</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="cars">车辆信息</a><span class="divider">/</span></li>
            <li class="active">车辆消费记录</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 13">      
			<h1 class="page-title">修改车辆信息及添加顾客信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="cars">车辆信息</a><span class="divider">/</span></li>
            <li class="active">修改车辆信息及添加顾客信息</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 14">      
			<h1 class="page-title">选择车辆</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">选择车辆</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 15">      
			<h1 class="page-title">选择服务项目</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="cars?checkout='yes'">车辆信息</a><span class="divider">/</span></li>
            <li class="active">选择服务项目</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 16">      
			<h1 class="page-title">添加车辆信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="cars?checkout='yes'">结账</a><span class="checkout">/</span></li>
            <li class="active">添加车辆信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
  <s:elseif test="#request.type == 17">      
			<h1 class="page-title">顾客信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>

            <li class="active">顾客信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 18">      
			<h1 class="page-title">修改顾客信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="customers">顾客信息</a><span class="checkout">/</span></li>
            <li class="active">修改顾客信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 19">      
			<h1 class="page-title">会员卡信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">会员卡信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 20">      
			<h1 class="page-title">修改会员卡信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="ranks">会员卡信息</a><span class="checkout">/</span></li>
            <li class="active">修改会员卡信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 21">      
			<h1 class="page-title">添加会员卡信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="ranks">会员卡信息</a><span class="checkout">/</span></li>
            <li class="active">添加会员卡信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 22">      
			<h1 class="page-title">服务项目信息</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">服务项目信息</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 23">      
			<h1 class="page-title">修改服务项目</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="services">服务项目信息</a><span class="checkout">/</span></li>
            <li class="active">修改服务项目</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 24">      
			<h1 class="page-title">添加服务项目</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li><a href="services">服务项目信息</a><span class="checkout">/</span></li>
            <li class="active">添加服务项目</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 25">      
			<h1 class="page-title">查询车辆</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">查询车辆</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 26">      
			<h1 class="page-title">查询顾客</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">查询顾客</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 27">      
			<h1 class="page-title">查询消费记录</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">首页</a><span class="divider">/</span></li>
            <li class="active">查询消费记录</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 
 
 
 
<s:else>
<h1 class="page-title">欢迎</h1>    
        </div>       
                <ul class="breadcrumb">

            <li class="active">欢迎</li>
            <li class="active"></li>
        </ul>
</s:else>


  
  
  
  
  
  
  
  
  
  
  
        
<div class="copyrights"></div>
        <div class="container-fluid">
            <div class="row-fluid">

</body>
</html>