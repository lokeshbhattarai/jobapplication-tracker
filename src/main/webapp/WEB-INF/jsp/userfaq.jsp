<%-- 
    Document   : home
    Created on : Jul 11, 2016, 5:45:11 PM
    Author     : suraj
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>

<h1 class="page-header"><i class="fa fa-gears" aria-hidden="true"></i> Resources</h1>
<a href="filesupload" class="btn btn-primary pull-right dashboardbtn">Upload Resources</a>
<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque tincidunt metus convallis est suscipit, a facilisis lacus hendrerit. Donec tincidunt neque eget suscipit sagittis. Proin aliquet tellus ante, non lobortis leo luctus id. Duis nec ante hendrerit, gravida diam et, consequat quam. Vestibulum accumsan pretium velit, at vestibulum odio lobortis ut. Ut eget augue quam. Fusce sit amet porttitor tortor. Sed eu ipsum arcu. Donec lobortis tellus sit amet lorem ultricies volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

<c:forEach var="fileName" items="${fileList}">
    <a href="file:///C:/tmp/${fileName}">${fileName}></a><br/>
</c:forEach>
<%@include  file="includes/footer.jsp" %>                