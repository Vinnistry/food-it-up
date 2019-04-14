let server = 'https://food-it-up-develop.herokuapp.com/receipt';
let localServer = 'http://localhost:5000/receipt'

angular.module('food-it-up', [])
.controller('AllReceipts', function($scope, $http) {
    $http.get(server).
        then(function(response) {
            $scope.receipt = response.data;
        });
})