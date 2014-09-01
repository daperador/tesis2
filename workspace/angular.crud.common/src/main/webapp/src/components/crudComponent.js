define(['models/crudModel','models/toolbarModel'], function(crudModel, toolbarModel) {
    crud = angular.module('crud', []);

    var confiData;
    $.ajax({
        dataType: "json",
        url: './src/components/config/' + componentName + 'Config.json',
        async: false,
        success: function(data) {
            confiData = data;
        }
    });



    crudModel.views.push(confiData.view);
    crudModel.displayName = confiData.displayName;
    crudModel.name = componentName;

    crud.value('crudModel', crudModel);
    crud.value('toolbarModel', toolbarModel);
    return crud;
});