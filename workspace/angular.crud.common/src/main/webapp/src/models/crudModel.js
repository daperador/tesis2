define([], function() {
    var CrudModel = {
        name: '',
        displayName:'',
        views: [
            {
                url: 'views/toolbarView.html',
                name: 'Toolbar'
            },
            {
                url: 'views/messagesView.html',
                name: 'Messages'
            }
        ]
    };
    return CrudModel;
});