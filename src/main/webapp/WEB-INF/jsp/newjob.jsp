<%-- 
    Document   : newjob
    Created on : Jul 12, 2016, 11:30:04 PM
    Author     : Dilip
--%>

<<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>


<h1 class="page-header"><i class="fa fa-cubes" aria-hidden="true"></i> Apply Job</h1>
<a href="../applyjob" class="btn btn-primary pull-right dashboardbtn">Back to Apply Job</a>
<div ng-app="jobApp">
    <div ng-controller="jobController" ng-init="init('localhost://')">
        <form>
            Job title: <input type="text" ng-model="job.jobTitle" required /><br />
            Company name: <input type="text" ng-model="job.companyName" required /><br />
            Company address: <input type="text" ng-model="job.companyAddress" required /><br />
            Position title: <input type="text" ng-model="job.positionTitle" required /><br />
            Job description: <input type="text" ng-model="job.jobDescription" required /><br />
            Apply date: <input type="text" ng-model="jobx.appliedDateTemp" /><br />
            Contact person: <input type="text" ng-model="job.contactPerson" required /><br />
            Contact no: <input type="text" ng-model="job.contactNumber" required /><br />

            <input type="button" ng-click="addJob(job, jobx.appliedDateTemp)" value="Save" />
        </form>
    </div>
</div>
<%@include  file="includes/footer.jsp" %>   
<script src="<c:url value='/resources/js/controller/jobController.js'></c:url>"></script>