<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>��ɫ����</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>


	<div class="btn-toolbar">
    <a href="showAddPart"><button class="btn btn-primary"><i class="icon-plus"></i> �½�ɫ</button></a>
    <button class="btn">������<s:property value="#request.partCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>#</th>
          <th>��ɫ����</th>
          <th>��ע</th>
          <th>��ɫ����</th>
          <th>Ȩ����</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="parts" status="index">

                <tr class="mythset">
                  <td><s:property value="partId"/></td>
                  <td><s:property value="partName"/></td>                
                  <td><s:property value="partScript"/></td>
                  <td><s:property value="userNumber"/></td>
                  <td><s:property value="rightsNumber"/></td>

                                   
          <td>
              <a href="showChangePart?part.partName=<s:property value="partName"/>"><i class="icon-pencil"></i></a>
              
          </td>
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>




	<%@include file="../../../footer.jsp"%>
</body>
</html>