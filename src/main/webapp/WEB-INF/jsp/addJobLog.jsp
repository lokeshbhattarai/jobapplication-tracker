<%-- 
    Document   : newjob
    Created on : Jul 12, 2016, 11:30:04 PM
    Author     : Dilip
--%>

<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script src="<c:url value='/resources/js/angular.min.js'></c:url>"></script>

<h1 class="page-header"><i class="fa fa-cubes" aria-hidden="true"></i> Add log</h1>
<a href="../applyjob" class="btn btn-primary pull-right dashboardbtn">Back to Apply Job</a>
<body>
    <form:form modelAttribute="jobLog" class="form-horizontal">
            
         <div class="form-group">
                            <input class="form-control" placeholder="title" name="title" type="text" autofocus="">
         </div>
         <div class="form-group">
                            <input class="form-control" placeholder="comment" name="comment" type="text" value="">
         </div>
        
        <button type="submit" class="btn btn-primary">Add Log</button>
        
    </form:form>
</body>
<script src="<c:url value='/resources/js/controller/jobController.js'></c:url>"></script>
<%@include  file="includes/footer.jsp" %>
