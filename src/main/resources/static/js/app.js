var app = angular.module('app', [ 'ngRoute', 'ngResource' ]);
app.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : '/views/score.html',
		controller : 'scoreController'
	}).when('/login', {
		templateUrl : '/views/login.html',
		controller : 'loginController'
	}).when('/panel', {
		templateUrl : '/views/panel.html',
		controller : 'panelController'
	}).when('/liga1', {
		templateUrl : '/views/liga1.html',
		controller : 'panelController'
	}).when('/liga2', {
		templateUrl : '/views/liga2.html',
		controller : 'panelController'
	}).when('/liga3', {
		templateUrl : '/views/liga3.html',
		controller : 'panelController'
	}).otherwise({
		redirectTo : '/'
	});
});
