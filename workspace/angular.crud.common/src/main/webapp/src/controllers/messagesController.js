define(['components/crudComponent', 'models/messagesModel'],
        function(crudComponent, MessagesModel) {
            crudComponent.controller('messagesController', ['$scope', '$rootScope', '$timeout',
                function($scope, $rootScope, $timeout) {

                    $scope.model = new MessagesModel();

                    $rootScope.$on("show-message", function(event, model) {
                        $scope.model.message = model.message;
                        $scope.model.showMessage = true;
                        $scope.model.type = model.type;
                        if (model.delay > -1){
                            $timeout(function() {
                                $scope.model.showMessage = false;
                            }, model.delay);
                        }
                    });

                }]);
        });