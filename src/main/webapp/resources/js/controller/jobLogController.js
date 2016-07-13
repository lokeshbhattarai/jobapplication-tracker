var jobApp = angular.module('jobApp', []);

jobApp.controller('jobLogController', function($scope, $http){
    
    $scope.init = function(url){
        $scope.url = url;
    };
    
    $scope.addJobLog = function(jobLog){
        var msg = isValid(jobLog);
        if(msg != ''){
            alert(msg);
            return;
        }
        
        $http.post('applyjob/addlog', angular.toJson(user))
                .success(function(data){
                    alert('Job log added!');
        });
    };
    
    isValid = function(jobLog){
        var msg = '';
        
        if(jobLog == null || jobLog == 'undefined'){
            jobLog = new Object();
        }
        
        if(jobLog.title == null || jobLog.title == '')
            msg += 'Title cannot be empty.\n';
        if(jobLog.comment == null || jobLog.comment == '')
            msg += 'Please provide comment.\n';
       
        
        return msg;
    };
   
});