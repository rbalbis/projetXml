function generateSelectBoxAllProjetsByCR(titleSelectBox, idSelectBoxProjs, dataProjets, siid)
{
	var title = document.getElementById(titleSelectBox);
	title.innerHTML = "Les projets pour le centre de recherche : " + siid;
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