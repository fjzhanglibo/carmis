<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>��ӭ����</title>
      
  </head>


  <body class=""> 
 
    
    <%@include file="navbar.jsp"%>
    <%@include file="sideNav.jsp"%>
    <%@include file="header.jsp"%>
    


   
    
    
                    

<div class="row-fluid">
  <div class="block">
    <a href="#page-stats" class="block-heading" data-toggle="collapse">��ǰ״��</a>
    <div id="page-stats" class="block-body collapse in">

            <div class="stat-widget-container">
                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.userCount"/></p>
                        <p class="detail">�û�����</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.partCount"/></p>
                        <p class="detail">��ɫ����</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.rightsCount"/></p>
                        <p class="detail">Ȩ����</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title"><s:property value="#request.departmentCount"/></p>
                        <p class="detail">���Ÿ���</p>
                    </div>
                </div>

            </div>
        </div>
  </div>
</div>

<div class="row-fluid">
    <div class="block span6">
        <a href="#user" class="block-heading" data-toggle="collapse">�˻�
        	<span class="label label-warning"><s:property value="#request.userCount"/></span></a>
        <div id="user" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>�˻���</th>
                  <th>����</th>
                  <th>��������</th>
                  <th>������ɫ</th>
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
            <p><a href="users">More...</a></p>
        </div>
    </div>
    <div class="block span6">
       <a href="#department" class="block-heading" data-toggle="collapse">����<span class="label label-warning">
       <s:property value="#request.departmentCount"/></span></a>
        <div id="department" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>����ID</th>
                  <th>����</th>
                  <th>��ע</th>
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
            <p><a href="departments">More...</a></p>
        </div>
    </div>
</div>

<div class="row-fluid">
    <div class="block span6">
        <a href="#part" class="block-heading" data-toggle="collapse">��ɫ<span class="label label-warning">
			<s:property value="#request.partCount"/></span></a>
        <div id="part" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>��ɫID</th>
                  <th>����</th>
                  <th>��ע</th>
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
            <p><a href="parts">More...</a></p>
        </div>
    </div>
    <div class="block span6">
        <a href="#rights" class="block-heading" data-toggle="collapse">Ȩ��<span class="label label-warning">
        <s:property value="#request.rightsCount"/></span></a>
        <div id="rights" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>Ȩ��ID</th>
                  <th>����</th>
                  <th>��ע</th>
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
            <p><a href="rights">More...</a></p>
        </div>
    </div>
</div>    


    <%@include file="footer.jsp"%>
    
  </body>
</html>