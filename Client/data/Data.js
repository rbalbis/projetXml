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

    //http://localhost:8080/xml.rest/xquery/getProject-abs
    static getProject(sigleProject){
      return DataTest.doRequest("http://localhost:8080/xml.rest/xquery/getProject-"+sigleProject);
     }
 

  //http://localhost:8080/xml.rest/cr/getCr-CR0008i
  static getAllProjectsForCR(siid)
  {
    return DataTest.doRequest("http://localhost:8080/xml.rest/sr/getProjectFromCr-"+siid);
  }

  //http://localhost:8080/xml.rest/xquery/getMembers-andrea/tettamanzi
  static getMember(firstname,lastname){
    return DataTest.doRequest("http://localhost:8080/xml.rest/xquery/getMembers-"+firstname+"/"+lastname);
  }

  //http://localhost:8080/xml.rest/xquery/getMembers
  static getMembersList(){
    return DataTest.doRequest("http://localhost:8080/xml.rest/xquery/getMembers");
  }

  //http://localhost:8080/xml.rest/xquery/projectName
  static getProjectList(){
    return DataTest.doRequest("http://localhost:8080/xml.rest/xquery/projectName");
  }
}