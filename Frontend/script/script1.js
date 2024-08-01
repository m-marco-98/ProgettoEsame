const URL_endpoint = "http://localhost:9111/GestionaleTour/";

let listaTour = document.querySelector("#listaTour");

function findAllTour(){
    
    URL_ListaTour = URL_endpoint + "tour/find-all-tour";

    listaTour.innerHTML = "";

    fetch(URL_ListaTour)
    .then(data => {
        console.log(data);
        return data.json();
    })
    .then(response => {
       console.log(response); 
       response.forEach(tour => {
         console.log(tour);
         listaTour.appendChild(stampaTour(tour));
       });
    })
}

function stampaTour(tour){
    let stampa = document.createElement("li");
    stampa.innerHTML = `<span>${tour.nome} - ${tour.tipo} - ${tour.disponibilita} - ${tour.postiMax} </span>`;
    
    let btnPrenota = document.createElement("button");
    btnPrenota.innerHTML = "Prenota";
    // btnAdd.addEventListener("click", prenotaTour);
    btnPrenota.setAttribute("class", "buttonadd");

    stampa.appendChild(btnPrenota);
    return stampa;
}

function prenotaTour(prenotazione){

    URL_Prenota = URL_endpoint + "prenotazione/add-prenotazione";
    
    fetch(URL_Prenota, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(prenotazione)
         })
    .then(data => {
        return data.json();
    })

}

window.addEventListener("DOMContentLoaded", findAllTour)