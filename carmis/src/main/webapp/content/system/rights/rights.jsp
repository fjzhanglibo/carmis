<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>Ȩ��</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>


	<div class="btn-toolbar">

    <button class="btn">������<s:property value="#request.rightsCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>#</th>
          <th>Ȩ������</th>
          <th>��ע</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="rights" status="index">

                <tr class="mythset">
                  <td><s:property value="rightsId"/></td>
                  <td><s:property value="rightsName"/></td>                
                  <td><s:property value="rightsScript"/></td>


                                   
         
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>




	<%@include file="../../../footer.jsp"%>
</body>
</html>