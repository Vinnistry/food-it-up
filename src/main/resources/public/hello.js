angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:5000/receipt').
        then(function(response) {
            $scope.greeting = response.data;
        });
})