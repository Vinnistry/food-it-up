angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('localhost:5000/receipt').
        then(function(response) {
            $scope.greeting = response.data;
        });
});