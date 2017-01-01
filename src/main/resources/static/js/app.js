var app = angular.module('app', ['ngRoute','ngResource','ui.bootstrap']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/login',{
            templateUrl: '/views/login.html',
            controller: 'loginController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

	