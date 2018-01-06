class DataTest {

  static doRequest(url){
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false ); // false for synchronous request
    xmlHttp.send( null );
    return JSON.parse(xmlHttp.responseText);
  }

  //http://localhost:8080/xml.rest/cr/listcr
  static getCR()
  {
   return DataTest.doRequest("http://localhost:8080/xml.rest/cr/listcr");
  }

 //http://localhost:8080/xml.rest/sr/teamParCentre
  static getNbrProjectByCR()
  {
    return DataTest.doRequest("http://localhost:8080/xml.rest/sr/teamParCentre");}

 
 static getProject(sigleProject){
    return DataTest.doRequest("http://localhost:8080/xml.rest/cr/listcr");
  }
 

  //http://localhost:8080/xml.rest/cr/getCr-CR0008i
  static getAllProjectsForCR(siid)
  {return DataTest.doRequest("http://localhost:8080/xml.rest/sr/getProjectFromCr-"+siid);
  }
}