angular.module('ConsumeRest', [])
.controller('ConsRest', function($scope, $http) {
    $http.get('http://localhost:8181/trax').
        then(function(response) {
            $scope.traxs = response.data;
        });
});