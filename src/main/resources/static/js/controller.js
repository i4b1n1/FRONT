app.controller('loginController', function($scope, $http, $location) {

	$scope.name = "  ";

	$scope.loguj = function() {
		var key = $scope.key;
		var login = $scope.login;
		var input = {
			key : key,
			login : login
		};
		$http.get(
				url = 'http://localhost:2990/logging/' + $scope.login + "/"
						+ $scope.key).success(function(data) {
			if (data.status == "true") {
				$location.path("/panel");
			} else {
				$scope.name = "Nie poprawny";
			}
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});

	}

});

app.controller('panelController', function($scope, $http, $location) {

	
	$scope.liga = function(id) {
		$scope.leagueId = id;
	
		$http.get(url = 'http://localhost:2990/positionTeam/'+$scope.leagueId).success(function(data) {
			$scope.positionTeam = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		
		$http.get(url = 'http://localhost:2990/scoreMatchs/'+$scope.leagueId).success(function(data) {
			$scope.scoreMatchs = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		
		$http.get(url = 'http://localhost:2990/futureMatchs/'+$scope.leagueId).success(function(data) {
			$scope.futureMatchs = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
	}
	
	$scope.liga("glowna");

});

app.controller('scoreController', function($scope, $http, $location) {
	
	$scope.liga = function(id) {
		$scope.leagueId = id;
	
		$http.get(url = 'http://localhost:2990/scoreAll/'+$scope.leagueId).success(function(data) {
			$scope.scoreTeam = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		
		$http.get(url = 'http://localhost:2990/lastMatchs/'+$scope.leagueId).success(function(data) {
			$scope.scoreTeam = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		
		$http.get(url = 'http://localhost:2990/futureMatchs/'+$scope.leagueId).success(function(data) {
			$scope.scoreTeam = data
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
	}
	
	$scope.liga("glowna");
	
});
