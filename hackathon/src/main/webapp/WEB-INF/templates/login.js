window.onload = function () {


    var submitButton = document.getElementById('btn');
    submitButton.addEventListener("click", addUser, false);


};

function addUser() {

    var user = JSON.stringify({
        phone: document.getElementById('phone').value,
        password: document.getElementById('password').value

    });



    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4 && ajax.status === 201) {

            next();
        }
    };

    // start the AJAX request
    document.cookie = document.getElementById('phone').value;
    ajax.open('POST', 'http://localhost:8080/rrr/api/user/login', true);
    ajax.setRequestHeader('Content-type', 'application/json');
   ajax.send(user);
}

function next() {

    window.location.replace('http://localhost:8080/rrr/house/houselist')

}