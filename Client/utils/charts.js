function drawChart() {


    var tab = makeTab();
    // Create and populate the data table.
    var data = google.visualization.arrayToDataTable(tab);

    // Create and draw the visualization.
    var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
    google.visualization.events.addListener(chart, 'ready', allReady); // ADD LISTENER
    chart.draw(data, {title:""});
}

function makeTab(){
    dataNbProjByCR = DataTest.getNbrProjectByCR();
    var tab = [['Centre','Nombre de projets']];
    for (var i = 0; i < Object.keys(dataNbProjByCR).length; i++)
    {
        
        
        var lib = DataTest.getSpeCR(Object.keys(dataNbProjByCR)[i]).libelle;
        console.log(lib);
        var newCell = [lib];
        newCell.push(dataNbProjByCR[Object.keys(dataNbProjByCR)[i]]);
        tab.push(newCell);
   
    }
    console.log(tab);
   return tab;
}