var jobApp = angular.module('jobApp', []);

jobApp.controller('jobController', function($scope, $http){
    
    $scope.init = function(url){
        $scope.url = url;
    };
    
    $scope.addJob = function(job){
        var msg = isValid(job);
        if(msg != ''){
            alert(msg);
            return;
        }
        
        $http.post('register', angular.toJson(user))
                .success(function(data){
                    alert('User registered successfully !!!');
        });
    };
    
    isValid = function(user){
        var msg = '';
        
        if(user == null || user == 'undefined'){
            user = new Object();
        }
        
        if(user.firstName == null || user.firstName == '')
            msg += 'First name cannot be empyt.\n';
        if(user.lastName == null || user.lastName == '')
            msg += 'Last name cannot be empyt.\n';
        if(user.email == null || user.email == '')
            msg += 'Email cannot be empyt.\n';
        if(user.usesrname == null || user.usesrnamer == '')
            msg += 'Username cannot be empyt.\n';
        if(user.password == null || user.password == '')
            msg += 'Password cannot be empyt.\n';
        if(user.repassword == null || user.repassword == '')
            msg += 'Re-password cannot be empyt.\n';
        if(user.phone == null || user.phone == '')
            msg += 'Phone cannot be empyt.\n';
        
        if(user.password != '' && user.repassword != '' && user.password != user.repassword){
            msg += 'Password and re-password are not same.';
        }
        
        return msg;
    };
});