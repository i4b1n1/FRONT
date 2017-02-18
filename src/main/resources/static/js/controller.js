var test = "1";

app.controller('loginController',
		function($scope, $http, $location, appService) {

			$scope.name = "  ";

			$scope.loguj = function() {
				var key = $scope.key;
				var login = $scope.login;
				var input = {
					key : key,
					login : login
				};
				$http.get(
						url = 'http://localhost:2990/logging/' + $scope.login
								+ "/" + $scope.key).success(function(data) {
					if (data.status == "true") {
						$location.path("#/panel");
						appService.zalogowany = "YES";
					} else {
						$scope.name = "Nie poprawny";
					}
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
				test = "adam";

			}

		});

app.controller('panelController',
		function($scope, $http, $location, appService) {

			var infoMatch;
			$scope.showData = function(data) {
				var infoMatch = data;
				var team1Name = data.team1.name;
				var team2Name = data.team2.name;
				var listTeam1 = data.team1.listFootballer;
				var listTeam2 = data.team2.listFootballer;
				var team1Pos = data.team1.positionInLeague;
				var team2Pos = data.team2.positionInLeague;
				$scope.nameTeam1 = data.team1.name;
				$scope.nameTeam2 = data.team2.name;
				$scope.listFootballer1 = data.team1.listFootballer;
				$scope.listFootballer2 = data.team2.listFootballer;
				$scope.teamPos1 = data.team1.positionInLeague;
				$scope.teamPos2 = data.team2.positionInLeague;
			}

			$scope.liga = function(data) {
				appService.idLeague = data;

			}

			$scope.getData = function(id) {
				$scope.leagueId = id;

				$http.get(
						url = 'http://localhost:2990/scoreMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreMatchs = data;
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/futureMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.futureMatchs = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
			}

			$scope.getData(appService.idLeague);

		});

app.controller('scoreController',
		function($scope, $http, $location, appService) {

			$scope.liga = function(id) {
				$scope.leagueId = id;

				$http.get(
						url = 'http://localhost:2990/scoreAll/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/lastMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});

				$http.get(
						url = 'http://localhost:2990/futureMatchs/'
								+ $scope.leagueId).success(function(data) {
					$scope.scoreTeam = data
				}).error(function(data) {
					$scope.name = "Problem z bazka";
				});
			}

		});

app.controller('createController', function($scope, $http, $location,
		appService) {


	$scope.submitTeam = function() {

		$http.post(
				url = 'http://localhost:2990/insert/team' + $scope.nazwaTeam + "/"+ $scope.ligaTeam + "/"+ $scope.pozycjaTeam).
				success(function(data) {
					$scope.info = "Dodano team";
		}).error(function(data) {
			$scope.info = " Nie Dodano teamu";
		});
	}
	
	$scope.submitPrzyszly = function() {

		$http.post(
				url = 'http://localhost:2990/insert/przyszly' + $scope.team1Przyszly + "/"+ $scope.team2Przyszly + "/"+ $scope.dataPrzyszly + "/"+ $scope.ligaPrzyszly).
				success(function(data) {
					$scope.info = "Dodano";
		}).error(function(data) {
			$scope.info = " Nie Dodano";
		});
	}
	
	$scope.submitWynik = function() {

		$http.post(
				url = 'http://localhost:2990/insert/wynik' + $scope.team1Wynik + "/"+ $scope.team2Wynik + "/"+ $scope.dataWynik + "/"+ $scope.wynikWynik + "/"+ $scope.ligaWynik).
				success(function(data) {
					$scope.info = "Dodano Wynik";
		}).error(function(data) {
			$scope.info = " Nie Dodano wyniku";
		});
	}
	
	$scope.submitTeam = function() {

		$http.post(
				url = 'http://localhost:2990/insert/pilkarz'  + $scope.imiePilkarz + "/"+ $scope.nazwiskoPilkarz + "/"+ $scope.pozycjaPilkarz + "/"+ $scope.karyPilkarz + "/"+ $scope.ligaPilkarz ).
				success(function(data) {
					$scope.info = "Dodano team";
		}).error(function(data) {
			$scope.info = " Nie Dodano teamu";
		});
	}

});