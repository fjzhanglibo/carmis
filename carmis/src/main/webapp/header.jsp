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
			<h1 class="page-title">ϵͳ����</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">ϵͳ����</li>
            <li class="active"></li>
        </ul>
 </s:if>
 
 <s:elseif test="#request.type == 2">      
			<h1 class="page-title">�û�����</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">�˻�Ŀ¼</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 3">      
			<h1 class="page-title">�˻�</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li><a href="users">�˻�Ŀ¼</a><span class="divider">/</span></li>
            <li class="active">�˻�</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 4">      
			<h1 class="page-title">���Ź���</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">����Ŀ¼</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
  <s:elseif test="#request.type == 5">      
			<h1 class="page-title">����</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li><a href="departments">����Ŀ¼</a><span class="divider">/</span></li>
            <li class="active">����</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
  <s:elseif test="#request.type == 6">      
			<h1 class="page-title">������Ա</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">������Ա</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
   <s:elseif test="#request.type == 7">      
			<h1 class="page-title">��ɫĿ¼</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">��ɫĿ¼</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
   <s:elseif test="#request.type == 8">      
			<h1 class="page-title">�޸Ľ�ɫȨ��</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li><a href="parts">��ɫĿ¼</a><span class="divider">/</span></li>
            <li class="active">�޸Ľ�ɫȨ��</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 

   <s:elseif test="#request.type == 9">      
			<h1 class="page-title">Ȩ��Ŀ¼</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="systemMain">�ſ�</a><span class="divider">/</span></li>
            <li class="active">Ȩ��Ŀ¼</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
   <s:elseif test="#request.type == 10">      
			<h1 class="page-title">�����˻�</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">�����˻�</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 
   <s:elseif test="#request.type == 11">      
			<h1 class="page-title">������Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">������Ϣ</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 12">      
			<h1 class="page-title">�������Ѽ�¼</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="cars">������Ϣ</a><span class="divider">/</span></li>
            <li class="active">�������Ѽ�¼</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 13">      
			<h1 class="page-title">�޸ĳ�����Ϣ����ӹ˿���Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="cars">������Ϣ</a><span class="divider">/</span></li>
            <li class="active">�޸ĳ�����Ϣ����ӹ˿���Ϣ</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 14">      
			<h1 class="page-title">ѡ����</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">ѡ����</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 15">      
			<h1 class="page-title">ѡ�������Ŀ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="cars?checkout='yes'">������Ϣ</a><span class="divider">/</span></li>
            <li class="active">ѡ�������Ŀ</li>
            <li class="active"></li>
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 16">      
			<h1 class="page-title">��ӳ�����Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="cars?checkout='yes'">����</a><span class="checkout">/</span></li>
            <li class="active">��ӳ�����Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
  <s:elseif test="#request.type == 17">      
			<h1 class="page-title">�˿���Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>

            <li class="active">�˿���Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 18">      
			<h1 class="page-title">�޸Ĺ˿���Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="customers">�˿���Ϣ</a><span class="checkout">/</span></li>
            <li class="active">�޸Ĺ˿���Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 19">      
			<h1 class="page-title">��Ա����Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">��Ա����Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 20">      
			<h1 class="page-title">�޸Ļ�Ա����Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="ranks">��Ա����Ϣ</a><span class="checkout">/</span></li>
            <li class="active">�޸Ļ�Ա����Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 21">      
			<h1 class="page-title">��ӻ�Ա����Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="ranks">��Ա����Ϣ</a><span class="checkout">/</span></li>
            <li class="active">��ӻ�Ա����Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 22">      
			<h1 class="page-title">������Ŀ��Ϣ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">������Ŀ��Ϣ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 23">      
			<h1 class="page-title">�޸ķ�����Ŀ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="services">������Ŀ��Ϣ</a><span class="checkout">/</span></li>
            <li class="active">�޸ķ�����Ŀ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 24">      
			<h1 class="page-title">��ӷ�����Ŀ</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li><a href="services">������Ŀ��Ϣ</a><span class="checkout">/</span></li>
            <li class="active">��ӷ�����Ŀ</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 25">      
			<h1 class="page-title">��ѯ����</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">��ѯ����</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 26">      
			<h1 class="page-title">��ѯ�˿�</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">��ѯ�˿�</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 <s:elseif test="#request.type == 27">      
			<h1 class="page-title">��ѯ���Ѽ�¼</h1>    
        </div>       
                <ul class="breadcrumb">
            <li><a href="welcome">��ҳ</a><span class="divider">/</span></li>
            <li class="active">��ѯ���Ѽ�¼</li>
            <li class="active"></li>            
        </ul>
 </s:elseif>
 
 
 
 
<s:else>
<h1 class="page-title">��ӭ</h1>    
        </div>       
                <ul class="breadcrumb">

            <li class="active">��ӭ</li>
            <li class="active"></li>
        </ul>
</s:else>


  
  
  
  
  
  
  
  
  
  
  
        
<div class="copyrights"></div>
        <div class="container-fluid">
            <div class="row-fluid">

</body>
</html>