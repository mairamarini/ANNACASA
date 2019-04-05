window.onload = function () {


    var submitButton = document.getElementById('btn');
    submitButton.addEventListener("click", addHouse, false);


};

function addHouse() {

    var house = {
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
            return button.checked;
        }).map(function (button) {
            return button.value;
        })
    };

    console.log('HOUSE', house);

    var ajax;

    if (window.XMLHttpRequest) {
        ajax = new XMLHttpRequest();
    }

    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 201) {
            // what to do after creating
            console.log('CB HOUSE', house);
            console.log(house.work);
            window.localStorage.setItem('works', JSON.stringify(house.work));
            console.log(window.localStorage);
            window.location.replace('http://localhost:8080/rrr/house/companies');
        }
    };

    // start the AJAX request
    ajax.open('POST', 'http://localhost:8080/rrr/api/house/', true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send(JSON.stringify(house));
    event.preventDefault();
    event.stopPropagation();
}




