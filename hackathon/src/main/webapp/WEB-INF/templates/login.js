window.onload = function () {

    window.localStorage.clear();
    var submitButton = document.getElementById('btn');
    submitButton.addEventListener("click", addUser, false);


};

function addUser(event) {

    var user = JSON.stringify({
        phone: document.getElementById('phone').value,
        password: document.getElementById('password').value

    });


    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4 && ajax.status === 200) {
            console.log(ajax.responseText)
            window.localStorage.setItem('userPhone', ajax.responseText)
            console.log('replacing')
            window.location.replace('http://localhost:8080/annacasa/house/addhouse')
        }
    };

    // start the AJAX request
    document.cookie = document.getElementById('phone').value;
    ajax.open('POST', 'http://localhost:8080/annacasa/api/user/login', true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(user);
    event.preventDefault();
}

