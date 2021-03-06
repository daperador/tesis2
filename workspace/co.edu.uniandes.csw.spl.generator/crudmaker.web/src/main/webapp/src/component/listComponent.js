/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

define(['controller/listController'], function(){
    App.Component.ListComponent = Backbone.View.extend({
	initialize: function(options){
	    if(options.componentId){
		this.componentId = options.componentId;
	    }
	    var model = new App.Model.ListModel({componentId: this.componentId, name: options.name});
	    this.listController = new App.Controller.ListController({
		model: model
	    });
	},
	addColumn: function(columnName, displayName, formula){
	    this.listController.addColumn(columnName, displayName, formula);
	},
	removeColumn: function(columnName){
	    this.listController.removeColumn(columnName);
	},
	addAction: function(params, callBack, context, args) {
	    this.listController.addAction(params,callBack, context, args);
        },
        removeAction: function(name) {
            this.listController.removeAction(name);
        },
	setTemplate: function(templateName){
	    this.listController.setTemplate(templateName);
	},
	changeElement: function(params){
	    this.listController.setElement(params);
	},
	render: function(){
	    this.listController.render();
	},
	setData: function(args){
	    this.listController.setData(args);
	},
	getSelectedItems: function(){
	    return this.listController.getSelectedItems();
	},
	setSelection: function(enabled){
	    this.listController.setSelection(enabled);
	},
	cleanSelected: function(){
	    this.listController.cleanSelected();
	}
    });
    
    return App.Component.ListComponent;
});