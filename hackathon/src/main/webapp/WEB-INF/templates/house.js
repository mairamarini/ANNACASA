window.onload = function () {


    var submitButton = document.getElementById('btn');
    submitButton.addEventListener("click", addHouse, false);


};

function addHouse() {

    var house = JSON.stringify({
        address: document.getElementById('address').value,
        houseType: document.getElementById('houseType').value,
        rooms: document.getElementById('rooms').value,
        budget: document.getElementById('budget').value,
        work: document.getElementById('work').value
    });


    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 201) {
            // what to do after creating
            window.location.replace('http://localhost:8080/rrr/house/companies');
        }
    };

    // start the AJAX request
    ajax.open('POST', 'http://localhost:8080/rrr/api/house/', true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(house);


}


