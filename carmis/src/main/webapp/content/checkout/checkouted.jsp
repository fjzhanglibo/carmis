<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
  <head>
    <meta charset="gb2312">
    <title>�ύ�˵�</title>
  </head>
<body>
	<%@include file="../../../navbar.jsp"%>
    <%@include file="../../../sideNav.jsp"%>
    <%@include file="../../../header.jsp"%>
    
<div class="row-fluid">
    <div class="block span6">
        <a href="#tablewidget" class="block-heading" data-toggle="collapse">
        	<s:property value="carNumber"/><span class="label label-warning">
        	<s:property value="serviceCount"/></span></a>
        <div id="tablewidget" class="block-body collapse in">
        <br/>
        <a href="welcome"><button class="btn btn-primary"> ȷ��</button></a>
            <table class="table">
            <tr>
            <th>������Ŀ���</th>
            <th>������Ŀ����</th>
            <th>����</th>
            <th>�˿͵ȼ�</th>
            <th>�ۿ۶�</th>
            <th>�ۿۺ�۸�</th>
            </tr>
            
              
              <tbody>
              <s:iterator value="services" status="stat" var="li">
             
                <tr >
                  <td><s:property value="serviceNumber"/></td>
                  <td><s:property value="serviceName"/></td>
                  <td><s:property value="servicePrice"/></td>
                  <td><s:property value="rankName"/></td>
                  <td><s:property value="rankDiscount"/></td>
                  <td><s:property value="price"/></td>        
                  
                </tr>
               </s:iterator>
               
                <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>�ܽ��:</td>
                <td><s:property value="sum"/></td>
                </tr>
                
              </tbody>
            </table>

        </div>
    </div>
    
   
    
</div>


                    
    <%@include file="../../../footer.jsp"%>
    


</body>
</html>