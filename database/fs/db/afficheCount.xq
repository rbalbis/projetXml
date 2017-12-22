xquery version "3.1";

import module namespace proj = "http://raweb.inria.fr/" at "countperso.xq"; 
 
import module namespace rqt = "http://exist-db.org/xquery/request";


 
 element {QName("http://www.w3.org/1999/xhtml","html")} {

    <head>
        <title>RAWEB teams summary</title>
    </head>,
    <body>
        <h1>RAWEB teams summary</h1>
        <p>7 projects</p>
        <table border="2">
        <tr>
                <th>Project</th>
                <th>Persons</th>
                <th>Parametre</th>
            </tr>
            
            
       { 
        for $id in /raweb
        let $i := data($id//shortname)
        let $e := proj:count-projects($id//person)
        let $proj := rqt:get-parameter("proj","hello")
       
        
        return  if($i=$proj) then (<tr><td>{$i}</td><td>{$e}</td><td>{rqt:get-parameter("proj","hello")}</td></tr>)
        else (<tr><td><b>{$i}</b></td><td>{$e}</td><td>{rqt:get-parameter("proj","hello")}</td></tr>)

       }
        
 
        </table>
    </body>
}