angular.module('demo', [])
.controller('receipts', function($scope, $http) {
    $http.get('localhost:5000/receipt').
        then((response)-> {
            $scope.receipt = response.data;
        });
});