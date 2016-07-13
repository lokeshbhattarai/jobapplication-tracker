<%-- 
    Document   : newjob
    Created on : Jul 12, 2016, 11:30:04 PM
    Author     : Dilip
--%>

<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>


<h1 class="page-header"><i class="fa fa-cubes" aria-hidden="true"></i> Add log</h1>
<a href="../applyjob" class="btn btn-primary pull-right dashboardbtn">Back to Apply Job</a>
<div ng-app="jobApp">
    <div ng-controller="jobLogController" ng-init="init('localhost://')">
        <form>
             <input type="hidden" value="${param.jobId}"  name = "job_opening_id" ng-model="job.jobTitle" required /><br />
            Log Title <input type="text" ng-model="job.companyName" required /><br />
            Log comment: <input type="text" ng-model="job.companyAddress" required /><br />
           
            <input type="button" ng-click="addJob(job)" value="Save" />
        </form>
    </div>
</div>
<%@include  file="includes/footer.jsp" %>   
<script src="resources/js/controller/jobController.js"></script>