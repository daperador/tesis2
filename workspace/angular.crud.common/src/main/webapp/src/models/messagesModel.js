define([], function() {
    MessagesModel = function() {
        var model = {
            message: '',
            showMessage: false,
            dismissable: true
        };

        return model;
    };
    return MessagesModel;
});