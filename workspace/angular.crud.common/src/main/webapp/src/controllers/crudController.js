define(['components/crudComponent',], function(crudComponent){
    crudComponent.controller('crudController',['$scope','$rootScope','crudModel','toolbarModel',function ($scope, $rootScope,crudModel,toolbarModel){
            $scope.model = crudModel;
            
            $rootScope.$on($scope.model.name + '-toolbar-create', function (){
                toolbarModel.showSave = true;
                toolbarModel.showCancel = true;
                $rootScope.$emit($scope.model.name + '-create');
            });
            
            $rootScope.$on($scope.model.name + '-toolbar-save', function (){
                $rootScope.$emit($scope.model.name + '-save');
            });
            
            $rootScope.$on('post-' + $scope.model.name + '-save', function (){
                toolbarModel.showSave = false;
                toolbarModel.showCancel = false;
                $rootScope.$emit($scope.model.name + '-list');
                $rootScope.$emit('show-message', {message: 'The ' + $scope.model.name + ' has been successfully saved.', delay: 3000, type: 'info'});
            });
            
            $rootScope.$on($scope.model.name + '-toolbar-cancel', function (){
                toolbarModel.showSave = false;
                toolbarModel.showCancel = false;
                $rootScope.$emit($scope.model.name + '-list');
            });
            
            $rootScope.$on($scope.model.name + '-toolbar-refresh', function (){
                toolbarModel.showSave = false;
                toolbarModel.showCancel = false;
                $rootScope.$emit($scope.model.name + '-list');
            });
            
            $rootScope.$on('error', function (event, params){
                $rootScope.$emit('show-message', {message: 'Error executing ' + params.event + ". Message: " + params.error.responseText, delay: -1, type: 'danger'});
            });
            
            $rootScope.$on('pre-' + $scope.model.name + '-edit', function (){
                toolbarModel.showSave = true;
                toolbarModel.showCancel = true;
            });
    }]);
});