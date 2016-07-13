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
    <div role="main" class="container theme-showcase" ng-app="angularTable" >
        <div class="" style="margin-top:90px;">
            <div class="col-lg-8">
                <div class="page-header">
                    <h2 id="tables">Job openings you have applied for</h2>
                </div>
                <div class="bs-component" ng-init="init('getappliedjoblist')" ng-controller="listdata as data">
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Company name</th>
                                <th>Description</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-show="data.users.length <= 0"><td colspan="5" style="text-align:center;">Loading new data!!</td></tr>
                            <tr dir-paginate="user in data.users|itemsPerPage:data.itemsPerPage" total-items="data.total_count">
                                <td>{{user.companyName}}</td>
                                <td>{{user.jobDescription}}</td>
                                <td><a href="applyjob/addlog?jobId={{user.id}}">Add Log</a></td>
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
        </div>
    </div>
    <script src="resources/js/controller/dirPagination.js"></script>
    <script src="resources/js/controller/app.js"></script>
</div>
<%@include  file="includes/footer.jsp" %>