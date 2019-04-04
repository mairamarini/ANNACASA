window.onload = function () {

    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        ajax = new ActiveXObject('Microsoft.XMLHTTP');
    }

    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 200) {

            var house = JSON.parse(ajax.responseText);

            var submitButton = document.getElementById('btn');

            submitButton.click()(function () {
               addHouse();
            });

        }
    };

    // start the AJAX request
    ajax.open('GET', 'http://localhost:8080/rrr/api/house/', true);
    //ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send();
};

function addHouse() {

    var house = JSON.stringify({
        address: document.getElementById('address'),
        type: document.getElementById('type'),
        rooms: document.getElementById('rooms'),
        budget: document.getElementById('budget')
    });

    document.ajax({
        url: 'http://localhost:8080/rrr/api/house/',
        type: 'POST',
        data: house,
        async: true,
        contentType: 'application/json',
        success: successCallback,
        error: errorCallback
    });
}

function successCallback() {
    document.ajax({
        url: 'http://localhost:8080/rrr/api/',
        async: true,
        success: null,
        error: errorCallback
    });
}

function errorCallback(request, status, error) {
    console.log('Request: ' + request);
    console.log('Status: ' + status);
    console.log('Error: ' + error);

    var alert = '<div class="alert alert-danger alert-dismissible"><a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>' +
        '<strong>Error: </strong>Could not complete action.</div>';
    $(alert).prependTo('.container');
}
