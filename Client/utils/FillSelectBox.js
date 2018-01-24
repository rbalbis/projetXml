function generateSelectBoxAllProjetsByCR(titleSelectBox, idSelectBoxProjs, dataProjets, libelle)
{
	var title = document.getElementById(titleSelectBox);
	title.innerHTML = "Les projets pour le centre de recherche : " + libelle;
	/* Ajout dans la combobox des projets */
	var selectBox = document.getElementById(idSelectBoxProjs);
	selectBox.style.display='';
	selectBox.innerHTML = "<option disabled selected value> -- Selectionnez un projet -- </option>";
	
	for(var i in dataProjets)
	{
		var option = document.createElement("option");
		option.text = dataProjets[i].sigle + " || " + dataProjets[i].libellefr + "  " ;
        option.value = dataProjets[i].sigle;
        selectBox.add(option);
	}        
}

function generateSelectBoxAllProjetsBySearch(titleSelectBox, idSelectBoxProjs, inputValue)
{
	var project = DataTest.getProject(inputValue);
	console.log(project["raweb"]);
	if (project["raweb"]) {
		var title = document.getElementById(titleSelectBox);
		title.innerHTML = "Les projets pour la recherche : " + inputValue;
		/* Ajout dans la combobox des projets */
		var selectBox = document.getElementById(idSelectBoxProjs);
		selectBox.style.display='';
		
		generateTableFromSearch('titleProjByCR', 'tableProjByCR', project);   
	}else{
		
		var title = document.getElementById(titleSelectBox);
		title.innerHTML = "Aucun projet trouvé pour la recherche : ";
		
		document.getElementById(idSelectBoxProjs).innerHTML = "";
		document.getElementById("tableProjByCR").innerHTML = "";
		document.getElementById("titleProjByCR").innerHTML = "";
	}     
}