/* Fonction permettant de retourner un tableau HTML contenant le nombre de projets pour chaque Centres
Params : 
	idTable => id du tableau html à remplir
	dataNbProjByCR => Données json contenant les informations Siid et le nombre de projets
Return : table HTML
*/
function generateTableNbProjetsByCR(idTable, dataNbProjByCR)
{
	// Récupère et vide le tableau HTML
    var table = document.getElementById(idTable);
    table.innerHTML = "";

    //Créer les différentes parties du tableau
    var tBody = document.createElement("tbody");
    var tHead = document.createElement("thead");
    var trHead = document.createElement("tr");
    var thSiidHead = document.createElement("th");
    thSiidHead.innerHTML = "Siid";
    var thNbHead =  document.createElement("th");
    thNbHead.innerHTML = "Nombre";
    
    trHead.appendChild(thSiidHead);
    trHead.appendChild(thNbHead);
    tHead.appendChild(trHead);
    
    table.appendChild(tHead);
    table.appendChild(tBody);

    //Passe dans le JSON et remplir le tableau
    for (var i = 0; i < Object.keys(dataNbProjByCR).length; i++)
    {

        var tr = document.createElement("tr");
        tBody.appendChild(tr);


        var a = document.createElement("a");
        a.setAttribute('href', 'javascript:linkSiid("'+Object.keys(dataNbProjByCR)[i]+'")');

        var siid = document.createElement("td");
        siid.innerHTML = Object.keys(dataNbProjByCR)[i];

        var nbProject = document.createElement("td");
        nbProject.innerHTML = dataNbProjByCR[Object.keys(dataNbProjByCR)[i]];

        a.appendChild(siid);
        tr.appendChild(a);
        tr.appendChild(nbProject);
    }

    return table;            
}

/* Fonction permettant de retourner un tableau HTML contenant les responsables d'un centre de recherches
Params : 
	idTable => id du tableau html à remplir
	idTitleTable => id du titre du tableau html
	dataSiidCR => Données json contenant les informations id/nom/prenom/fonction de chaque responsable
Return : table HTML
*/
function generateTableRespoCR(idTable, idTitleTable, dataSiidCR)
{
    /* Récupère et vide le tableau */  
    var table = document.getElementById(idTable);
    table.innerHTML = "";

    //Maj du titre du tableau
    document.getElementById(idTitleTable).innerHTML = "Responsables du centre (siid : " + dataSiidCR.siid + ")";

    /*Generation du thead du tableau*/

    var tHead = document.createElement("thead");
    table.appendChild(tHead);

    var tr = document.createElement("tr");
    tHead.appendChild(tr);

    /*Les nom des colonnes sont en dur, a modifier*/
    var th1 = document.createElement("th");
    th1.innerHTML = "IdGef";

    var th2 = document.createElement("th");
    th2.innerHTML = "Nom";

    var th3 = document.createElement("th");
    th3.innerHTML = "Prenom";

    var th4 = document.createElement("th");
    th4.innerHTML = "Fonction";

    tr.appendChild(th1);
    tr.appendChild(th2);
    tr.appendChild(th3);
    tr.appendChild(th4);


    /* Génération du tbody du tableau */
    var tBody = document.createElement("tbody");
    table.appendChild(tBody);

    for (var i in dataSiidCR.responsable) 
    {
        tBody.appendChild(document.createElement("tr"));
        var tr = tBody.getElementsByTagName("tr")[i];

        var id = document.createElement("td");
        id.innerHTML = dataSiidCR.responsable[i].personne.gefid;

        var nom = document.createElement("td");
        nom.innerHTML = dataSiidCR.responsable[i].personne.nom;

        var prenom = document.createElement("td");
        prenom.innerHTML = dataSiidCR.responsable[i].personne.prenom;

        var fonction = document.createElement("td");
        fonction.innerHTML = dataSiidCR.responsable[i].fonction;

        tr.appendChild(id);
        tr.appendChild(nom);
        tr.appendChild(prenom);
        tr.appendChild(fonction);
    }

    return table;
}

/* Fonction permettant de retourner un tableau HTML contenant les responsables d'un centre de recherches
Params : 
	idTable => id du tableau html à remplir
	idTitleTable => id du titre du tableau html
	dataProject => Données json contenant les informations du projet
Return : table HTML
*/
function generateTableProject(idTitleTable, idTable, dataProject)
{
	/* Récupère et vide le tableau */  
    var table = document.getElementById(idTable);
    table.innerHTML = "";

    //Maj du titre du tableau
    document.getElementById(idTitleTable).innerHTML = "Projet " + dataProject.sigle + " (Siid :" + dataProject.siid + ")";

    /* Génération du tbody du tableau */
    var tBody = document.createElement("tbody");
    table.appendChild(tBody);

    //Libelle
    addRowTbody(tBody, "Libelle", dataProject.libellefr);

    //Type structure
    addRowTbody(tBody, "Type structure", dataProject.typestructure);

    //Domaine
    addRowTbody(tBody, "Domaine", dataProject.domaine[0].value + "<br> classification : " + dataProject.domaine[0].classification + "<br> siid : " + dataProject.domaine[0].siid );

    //Date fermeture
    addRowTbody(tBody, "Date fermeture", dataProject.dateFermeture);
    
    //Theme
    addRowTbody(tBody, "Theme", dataProject.theme[0].value);

    //Resume
    addRowTbody(tBody, "Résume", dataProject.resume[0].value);

    //Url
    addRowTbody(tBody, "URL", "<a href="+dataProject.urlTeam[1].value+">" +dataProject.urlTeam[1].value+ "</a>");

    return table;
}

function addRowTbody(tbody, nameRow, dataRow)
{

    var tr = document.createElement("tr");
    tbody.appendChild(tr);
    var tdName = document.createElement("td");
    tdName.innerHTML = nameRow;
    tr.appendChild(tdName);
    var td = document.createElement("td");
    td.innerHTML = dataRow;
    tr.appendChild(td);
}