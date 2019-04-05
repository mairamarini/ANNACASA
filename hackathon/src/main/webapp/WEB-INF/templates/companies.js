window.onload = function () {
    var ajax = new XMLHttpRequest();

    // run this when the ajax request completes
    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 200) {

            var wantedIds = sessionStorage.getItem('workIds');
            var companiesData = JSON.parse(ajax.responseText);

            console.log(companiesData);
            var table = document.getElementById('companies-table');

            for (var i = 0; i < companiesData.length; i++) {
                var row = table.insertRow();

                row.insertCell(0).innerText = companiesData[i].name;
                row.insertCell(1).innerText = companiesData[i].email;
                row.insertCell(2).innerText = companiesData[i].phone;
                row.insertCell(3).innerHTML = '<button type="button" class="btn btn-success">View</button>';
            }
        }
    };

    // start the AJAX request
    ajax.open('GET', 'http://localhost:8080/rrr/api/companies/', true);
    //ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send();
};