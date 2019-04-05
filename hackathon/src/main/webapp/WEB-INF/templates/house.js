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
        work: [
            document.getElementById('carpentry'),
            document.getElementById('decoration'),
            document.getElementById('rebuild'),
            document.getElementById('plumbing'),
            document.getElementById('electrical'),
            document.getElementById('cleaning'),
            document.getElementById('locksmith')
        ].filter(function (button) {
            console.log(button)
            return button.checked;
        }).map(function (button) {
            return button.value;
        })
    });

    console.log(house);

    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 201) {
            // what to do after creating
            var createdHouse = JSON.parse(ajax.responseText); //LIXO

            get(createdHouse);
        }
    };

    // start the AJAX request
    ajax.open('POST', 'http://localhost:8080/rrr/api/house/', true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(house);

    //event.preventDefault();
    //event.stopPropagation();

}

function get(house) {
    console.log(house);

   // var idsArray = house.work; //array ids
    sessionStorage.setItem('workIds', house.work);
    /*
    var ids = [];

    idsArray.forEach(function (id) {
       ids.push('id=' + id);
    });

    var idsString = ids.join('&');

    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }
*/

    window.location.replace('http://localhost:8080/rrr/house/companies');
    /*ajax.open('GET','http://localhost:8080/rrr/api/house/filtered?' + idsString, true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(); */
}


