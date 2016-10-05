<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>��Ա������</title>
  </head>
<body>
	<%@include file="../../navbar.jsp"%>
    <%@include file="../../sideNav.jsp"%>
    <%@include file="../../header.jsp"%>


	<div class="btn-toolbar">
    <a href="showChangeRank"><button class="btn btn-primary"><i class="icon-plus"></i> �»�Ա��</button></a>
    <button class="btn">������<s:property value="rankCount"/></button>

  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr class="mythset">
          <th>#</th>
          <th>�ȼ�����</th>
          <th>�ۿ۶�</th>
          <th>�쿨����</th>
          <th>��ע</th>
          <th>�˿�����</th>
        </tr>
      </thead>
      <tbody>
        <s:iterator value="ranks" status="index">

                <tr class="mythset">
                  <td><s:property value="rankId"/></td>
                  <td><s:property value="rankName"/></td>
                  <td><s:property value="rankDiscount"/></td>
                  <td><s:property value="rankCost"/></td>
                  <td><s:property value="rankScript"/></td>
                  <td><s:property value="userCount"/></td>

                                   
          <td>
              <a href="showChangeRank?rankId=<s:property value="rankId"/>"><i class="icon-pencil"></i></a>
              
          </td>
        </tr>
        </s:iterator>
        
      </tbody>
    </table>
</div>




	<%@include file="../../footer.jsp"%>
</body>
</html>