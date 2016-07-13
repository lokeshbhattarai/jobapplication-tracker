<%-- 
    Document   : home
    Created on : Jul 11, 2016, 5:45:11 PM
    Author     : suraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>


<h1 class="page-header"><i class="fa fa-cubes" aria-hidden="true"></i> Apply Job</h1>
<a href="applyjob/addjob" class="btn btn-primary pull-right dashboardbtn">New Job Record</a>
<div class="row">
<div ng-app="angularTable">
    <div>
        <form>
            <div class="col-lg-12">
                <div class="bs-component" ng-controller="listdata as data" ng-init="init('getappliedjoblist')">
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Job Title<br/><input type="text" placeholder="job title"></th>
                                <th>Company Name</th>
                                <th>Company Address</th>
                                <th>Position Title</th>
                                <th>Applied Date</th>
                                <th>Contact Person</th>
                                <th>Contact No</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-show="data.users.length <= 0"><td colspan="5" style="text-align:center;">Loading new data!!</td></tr>
                            <tr dir-paginate="user in data.users|itemsPerPage:data.itemsPerPage" total-items="data.total_count">
                                <td>{{user.jobTitle}}</td>
                                <td>{{user.companyName}}</td>
                                <td>{{user.companyAddress}}</td>
                                <td>{{user.positionTitle}}</td>
                                <td>{{user.appliedDate}}</td>
                                <td>{{user.contactName}}</td>
                                <td>{{user.contactNumber}}</td>
                                <td><a href="#">Edit</a>|<a href="#">Add log</a></td>
                            </tr>
                        </tbody>
                    </table> 
                    <dir-pagination-controls
                        max-size="8"
                        direction-links="true"
                        boundary-links="true" 
                        on-page-change="data.getData(newPageNumber)" >
                    </dir-pagination-controls>
                </div>
            </div>
        </form>
    </div>
</div>
</div>
<%@include  file="includes/footer.jsp" %>   
<script src="resources/js/controller/jobController.js"></script>