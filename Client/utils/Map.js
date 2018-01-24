

function fillMap(idSelectBoxCR, dataCRs)
{
    /* Permet de recuperer l'id du popup et d'afficher les réponsables */
    var onMarkerClick = function(e){
        linkSiid(this.options.idMarker);
    }

    for (var i in dataCRs) {

        /* Ajout de points centre de recherche sur la map */
        var longitude = dataCRs[i].adressegeographique.longitude;
        var latitude = dataCRs[i].adressegeographique.latitude;
        var adresseComplete = dataCRs[i].libelle + " || " + dataCRs[i].adressegeographique.cp + " || " + dataCRs[i].adressegeographique.adresse;
        var adressePopup = replaceAll(adresseComplete, "||", "</br>");

        /* Ajout dans la combobox des centres de recherche */
        var comboBoxCR = document.getElementById(idSelectBoxCR);
        var option = document.createElement("option");
        option.text = adresseComplete;
        option.value = i;
        comboBoxCR.add(option);

        if (longitude !== 0 && latitude !== 0)  {

            marker = new L.marker([latitude,longitude], {idMarker: dataCRs[i].siid})
            .bindPopup(adressePopup).on('click', onMarkerClick).addTo(map); 

        }else{
            /* Si la position du centre de recherche est inconnu, on utilise l'API google */
            /* On garde en mémoire l'adresse du popup dans une variable (probleme de scope) */
            var p = adressePopup;
            var siid = dataCRs[i].siid;
            getJsonFromURL('http://maps.googleapis.com/maps/api/geocode/json?address='+dataCRs[i].adressegeographique.adresse+'&sensor=false',
            function(err, data) {
              if (err == null) {
                longitude = data.results[0].geometry.location.lng;
                latitude = data.results[0].geometry.location.lat;
                marker = new L.marker([latitude,longitude], {idMarker: siid})
                .bindPopup(p)
                .addTo(map).on('click', onMarkerClick); 
              }
            });

        }
        
    }
}
