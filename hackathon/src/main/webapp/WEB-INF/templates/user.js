window.onload = function () {


    var submitButton = document.getElementById('btn');
    submitButton.addEventListener("click", addUser, false);


};

function addUser(event) {

    var house = JSON.stringify({
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        password: document.getElementById('password').value
    });

    document.cookie = document.getElementById('phone').value;

    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 201) {
            // what to do after creating
            window.location.replace('http://localhost:8080/rrr/house/addhouse');

        }
    };
    document.cookie = document.getElementById('phone').value;
    // start the AJAX request
    ajax.open('POST', 'http://localhost:8080/rrr/api/user/', true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(house);
    event.preventDefault();
    event.stopPropagation();

}

