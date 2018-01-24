
function drawNbProjByCr(titleDrawing, idDrawing)
{
	var project = DataTest.getProject(inputValue);
	var title = document.getElementById(titleSelectBox);
	title.innerHTML = "Les projets pour la recherche : " + inputValue;
	/* Ajout dans la combobox des projets */
	var selectBox = document.getElementById(idSelectBoxProjs);
	selectBox.style.display='';
	selectBox.innerHTML = "<option disabled value> -- Selectionnez un projet -- </option>";
	
	for(var i in project)
	{
		var option = document.createElement("option selected");
		option.text = dataProjets[i].sigle + " || " + dataProjets[i].libellefr + "  " ;
        option.value = dataProjets[i].sigle;
        selectBox.add(option);
	} 

	generateTableProject('titleProjByCR', 'tableProjByCR', project);       
}