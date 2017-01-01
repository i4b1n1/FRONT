app.controller('usersController', function($scope) {
	$scope.headingTitle = "User List";
	
	$scope.loguj = function () {
        $scope.headingTitle = 'zmiannaaaaaaaa';
    };
});


app.controller('rolesController', function($scope, $http) {
	$http.get("http://localhost:2990/controler/get").
			then(function(data) {
				$scope.headingTitle = data.data.name;
			});
} )

app.controller('loginController', function($scope, $http) {
	var name = $scope.name;

});
