var app = angular.module('angularTable', ['angularUtils.directives.dirPagination']);

app.controller('listdata', function ($http) {
    var vm = this;
    vm.users = []; //declare an empty array
    vm.pageno = 1; // initialize page no to 1
    vm.total_count = 0;
    vm.itemsPerPage = 10; //this could be a dynamic value from a drop down

    vm.getData = function (pageno) { // This would fetch the data on page change.
        //In practice this should be in a factory.
        vm.users = [];
        var url = "getrecords/" + vm.itemsPerPage + "/" + pageno;
        $http.get(url).success(function (response) {
            vm.users = response;  //ajax request to fetch data into vm.data
            vm.total_count = 50;//response.total_count;
        });
    };
    vm.getData(vm.pageno); // Call the function to fetch initial data on page load.
});