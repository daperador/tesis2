define(['components/crudComponent'],
        function(crudComponent) {
            crudComponent.controller('toolbarController', ['$scope', '$rootScope','crudModel', 'toolbarModel',
                function($scope, $rootScope, crudModel, toolbarModel) {

                    $scope.toolbarModel = toolbarModel;
                    $scope.toolbarModel.componentId = crudModel.name;
                    $scope.toolbarModel.name = crudModel.displayName;

                    $scope.create = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-create');
                    };

                    $scope.save = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-save');
                    };

                    $scope.cancel = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-cancel');
                    };

                    $scope.refresh = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-refresh');
                    };

                    $scope.search = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-search');
                    };

                    $scope.print = function() {
                        $rootScope.$emit($scope.toolbarModel.componentId + '-toolbar-print');
                    };

                }]);
        });