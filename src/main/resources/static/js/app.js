var app = angular.module('app', [ 'ngRoute', 'ngResource' ]);
app.config(function($routeProvider) {
	$routeProvider.when('/login', {
		templateUrl : '/views/login.html',
		controller : 'loginController'
	}).when('/panel', {
		templateUrl : '/views/panel.html',
		controller : 'panelController'
	}).otherwise({
		redirectTo : '/'
	});
});
