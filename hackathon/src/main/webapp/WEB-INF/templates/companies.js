window.onload = function () {
    if (!window.localStorage.getItem('userPhone')) {
        window.location.replace('http://localhost:8080/rrr/house/login')
        return
    }

    var ajax = new XMLHttpRequest();

    var wantedIds = JSON.parse(window.localStorage.getItem('works'));

    // run this when the ajax request completes
    ajax.onreadystatechange = function () {

        if (ajax.readyState === 4 && ajax.status === 200) {


            var companiesData = JSON.parse(ajax.responseText);


            var companiesToShow = companiesData.filter(function (element) {
                console.log('COMPANY', element);
                console.log(wantedIds)
                console.log(element.workId)
                console.log()
                return wantedIds.includes(String(element.workId));
            });


            var table = document.getElementById('companies-table');

            for (var i = 0; i < companiesToShow.length; i++) {
                var row = table.insertRow();

                row.insertCell(0).innerText = companiesToShow[i].name;
                row.insertCell(1).innerText = companiesToShow[i].email;
                row.insertCell(2).innerText = companiesToShow[i].phone;
            }

            sessionStorage.removeItem('works')
        }

    };

    // start the AJAX request
    ajax.open('GET', 'http://localhost:8080/rrr/api/companies/', true);
    //ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send();
};