<%-- 
    Document   : home
    Created on : Jul 11, 2016, 5:45:11 PM
    Author     : suraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>

<h1 class="page-header"><i class="fa fa-cubes" aria-hidden="true"></i> Apply Job</h1>
<a href="applyjob/addjob" class="btn btn-primary pull-right dashboardbtn">New Job Record</a>
<div class="row">
    <form:form modelAttribute="job" class="form-horizontal">
    <div role="main" class="container theme-showcase"  >
        <div>
            <div class="col-lg-12">
                
                <div id = "jobTitle" class="page-header">
                    <h2 >${job.jobTitle}</h2>
                </div>
                
                <div id="jobDescription">
                    <h2 >${job.jobDescription}</h2>
                </div>
                
                <div id="companyName">
                    <h2 >${job.companyName}</h2>
                </div>
               <div id="companyAddress">
                    <h2 >${job.companyAddress}</h2>
                </div>
                
                <div id="appliedDate">
                    <h2 >${job.appliedDate}</h2>
                </div>
                
                <div id="contactPerson">
                    <h2 >${job.contactPerson}</h2>
                </div>
                
                <div id="contactNumber">
                    <h2 >${job.contactNumber}</h2>
                </div>
                
                    <c:forEach items="${job.logs}" var = "jobLog">
                        <div id="jobLogItem">
                            
                            <p>${jobLog.title}</p>
                            <p>${jobLog.comment}</p>
                        </div>>
                    </c:forEach>                
            </div>
        </div>
    </div>
<!--    <script src="resources/js/controller/dirPagination.js"></script>
    <script src="resources/js/controller/app.js"></script>-->
    </form:form>
</div>
<%@include  file="includes/footer.jsp" %>