var test ="1";


app.controller('loginController', function($scope, $http, $location, appService) {

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
				$location.path("#/panel");
				appService.zalogowany="YES";
			} else {
				$scope.name = "Nie poprawny";
			}
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		test ="adam";

	}

});

	 
app.controller('panelController', function($scope, $http, $location, appService) {

	$('#myModal').on('show.bs.modal', function(e) {
		var data= e;
	    alert("udalo");
	});
	
	$scope.liga= function(data){
		appService.idLeague=data;
		
	}
	
	$scope.getData = function(id) {
		$scope.leagueId = id;
	
//		$http.get(url = 'http://localhost:2990/positionTeam/'+$scope.leagueId).success(function(data) {
//			$scope.positionTeam = data
//		}).error(function(data) {
//			$scope.name = "Problem z bazka";
//		});
		
		$http.get(url = 'http://localhost:2990/scoreMatchs/'+$scope.leagueId).success(function(data) {
			$scope.scoreMatchs = data;
//			$scope.scoreMatchs.team1 = data.team1.name;
//			$scope.scoreMatchs.team2 = data.id;
//			$scope.scoreMatchs.date = data.date;
//			$scope.scoreMatchs.score = data.score1 + ":" + data.score2;
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
		
		$http.get(url = 'http://localhost:2990/futureMatchs/'+$scope.leagueId).success(function(data) {
			$scope.futureMatchs = data
//			$scope.futureMatchs.id = data.id;
//			$scope.futureMatchs.team1 = data.team1.name;
//			$scope.futureMatchs.team2 = data.id;
//			$scope.futureMatchs.date = data.date;
		}).error(function(data) {
			$scope.name = "Problem z bazka";
		});
	}
	
	$scope.getData(appService.idLeague);

});

app.controller('scoreController', function($scope, $http, $location , appService) {
	
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
	
//	$scope.liga(test);
	
});
