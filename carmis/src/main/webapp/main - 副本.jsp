<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>Bootstrap Admin</title>
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

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
    
    <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    <li><a href="#" class="hidden-phone visible-tablet visible-desktop" role="button">
                    
                    <s:bean var="now" name="java.util.Date"/>
					<s:date name="#now" format="dd/MM/yyyy" nice="false"/></a></li>
					
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> 
                            
                            <s:property value="#session.name"/>
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">My Account</a></li>
                            <li class="divider"></li>
                            <li><a tabindex="-1" class="visible-phone" href="#">Settings</a></li>
                            <li class="divider visible-phone"></li>
                            <li><a tabindex="-1" href="logout.action">登出</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="index.html"><span class="first">汽车</span> <span class="second">美容</span></a>
        </div>
    </div>
    


    
    <div class="sidebar-nav">
        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>系统管理</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="index.html">概况</a></li>
            <li ><a href="users.html">账户目录</a></li>
            <li ><a href="users.html">部门目录</a></li>
            <li ><a href="users.html">部门人员目录</a></li>
            <li ><a href="users.html">角色目录</a></li>
            <li ><a href="users.html">用户角色目录</a></li>
            <li ><a href="users.html">权限目录</a></li>
            <li ><a href="users.html">角色权限目录</a></li>
            <li ><a href="media.html">media</a></li>
            <li ><a href="calendar.html">Calendar</a></li>
            
        </ul>

        <a href="#accounts-menu" class="nav-header" data-toggle="collapse"><i class="icon-briefcase"></i>Account<span class="label label-info">+3</span></a>
        <ul id="accounts-menu" class="nav nav-list collapse">
            <li ><a href="sign-in.html">Sign In</a></li>
            <li ><a href="sign-up.html">Sign Up</a></li>
            <li ><a href="reset-password.html">Reset Password</a></li>
        </ul>

        <a href="#error-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-exclamation-sign"></i>Error Pages <i class="icon-chevron-up"></i></a>
        <ul id="error-menu" class="nav nav-list collapse">
            <li ><a href="403.html">403 page</a></li>
            <li ><a href="404.html">404 page</a></li>
            <li ><a href="500.html">500 page</a></li>
            <li ><a href="503.html">503 page</a></li>
        </ul>

        <a href="#legal-menu" class="nav-header" data-toggle="collapse"><i class="icon-legal"></i>Legal</a>
        <ul id="legal-menu" class="nav nav-list collapse">
            <li ><a href="privacy-policy.html">Privacy Policy</a></li>
            <li ><a href="terms-and-conditions.html">Terms and Conditions</a></li>
        </ul>

        <a href="help.html" class="nav-header" ><i class="icon-question-sign"></i>Help</a>
        <a href="faq.html" class="nav-header" ><i class="icon-comment"></i>Faq</a>
    </div>
    

    
    <div class="content">
        
        <div class="header">
            <div class="stats">
              <p class="stat">&nbsp;</p>
          </div>

            <h1 class="page-title">系统管理</h1>           
        </div>
        
                <ul class="breadcrumb">
            <li><a href="index.html">概况</a><span class="divider">/</span></li>
            <li class="active">系统管理</li>
            <li class="active"></li>
        </ul>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
        <div class="container-fluid">
            <div class="row-fluid">
                    

<div class="row-fluid">
  <div class="block">
    <a href="#page-stats" class="block-heading" data-toggle="collapse">当前状况</a>
    <div id="page-stats" class="block-body collapse in">

            <div class="stat-widget-container">
                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.userCount"/></p>
                        <p class="detail">用户人数</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.partCount"/></p>
                        <p class="detail">角色个数</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.rightsCount"/></p>
                        <p class="detail">权限数</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.departmentCount"/></p>
                        <p class="detail">部门个数</p>
                    </div>
                </div>

            </div>
        </div>
  </div>
</div>

<div class="row-fluid">
    <div class="block span6">
        <a href="#user" class="block-heading" data-toggle="collapse">账户
        	<span class="label label-warning"><s:property value="#request.userCount"/></span></a>
        <div id="user" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>账户名</th>
                  <th>姓名</th>
                  <th>所属部门</th>
                  <th>所属角色</th>
                </tr>
              </thead>
              <tbody>
              <s:iterator value="users" status="index">
              <s:if test="#index.count <= 6"> 
                <tr>
                  <td><s:property value="userAccount"/></td>
                  <td><s:property value="userName"/></td>
                  <td><s:property value="userDepartment"/></td>
                  <td><s:property value="userPart"/></td>
                </tr>
               </s:if>
              </s:iterator>
                
              </tbody>
            </table>
            <p><a href="users.html">More...</a></p>
        </div>
    </div>
    <div class="block span6">
       <a href="#department" class="block-heading" data-toggle="collapse">部门<span class="label label-warning">
       <s:property value="#request.departmentCount"/></span></a>
        <div id="department" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>部门ID</th>
                  <th>名称</th>
                  <th>备注</th>
                </tr>
              </thead>
              <tbody>
                <s:iterator value="departmentList" status="index">
              <s:if test="#index.count <= 6"> 
                <tr>
                  <td><s:property value="departmentId"/></td>
                  <td><s:property value="departmentName"/></td>
                  <td><s:property value="departmentScript"/></td>
                </tr>
               </s:if>
              </s:iterator>
              </tbody>
            </table>
            <p><a href="users.html">More...</a></p>
        </div>
    </div>
</div>

<div class="row-fluid">
    <div class="block span6">
        <a href="#part" class="block-heading" data-toggle="collapse">角色<span class="label label-warning">
			<s:property value="#request.partCount"/></span></a>
        <div id="part" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>角色ID</th>
                  <th>名称</th>
                  <th>备注</th>
                </tr>
              </thead>
              <tbody>
               <s:iterator value="partList" status="index">
                <s:if test="#index.count <= 6"> 
                <tr>
                  <td><s:property value="partId"/></td>
                  <td><s:property value="partName"/></td>
                  <td><s:property value="partScript"/></td>
                </tr>
               </s:if>
              </s:iterator>
              </tbody>
            </table>
            <p><a href="users.html">More...</a></p>
        </div>
    </div>
    <div class="block span6">
        <a href="#rights" class="block-heading" data-toggle="collapse">权限<span class="label label-warning">
        <s:property value="#request.rightsCount"/></span></a>
        <div id="rights" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>权限ID</th>
                  <th>名称</th>
                  <th>备注</th>
                </tr>
              </thead>
              <tbody>
                <s:iterator value="rightsList" status="index">
                <s:if test="#index.count <= 6"> 
                <tr>
                  <td><s:property value="rightsId"/></td>
                  <td><s:property value="rightsName"/></td>
                  <td><s:property value="rightsScript"/></td>
                </tr>
               </s:if>
              </s:iterator>
              </tbody>
            </table>
            <p><a href="users.html">More...</a></p>
        </div>
    </div>
    


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  </body>
</html>