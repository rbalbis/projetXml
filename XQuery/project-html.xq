xquery version "1.0";
import module
    namespace raweb = "http://raweb.inria.fr/" at "raweb-module.xq";
import module
    namespace request = "http://exist-db.org/xquery/request";
let $proj := request:get-parameter("proj", "ZENITH")
return element {QName("http://www.w3.org/1999/xhtml", "html")} {
    <head><title>RAWEB teams summary</title></head>,
    <body><h1>RAWEB teams summary</h1>
        <p>{ raweb:count-projects() } projects</p>
        <p> Count persons for project {$proj} </p>
        <table border="2">
            <tr><th>Project</th><th>Persons</th><th>Firstname</th><th>Lastname</th></tr>
            {
                for $project in /raweb/identification
                let $persons := count($project//person)
                where string($project/shortname)=$proj
                return
                    for $p at $i in raweb:list-members(string($proj))
                    return <tr>
                        { if ($i=1) then
                            (<td valign="top" rowspan="{ $persons }">{ string($project/shortname) }</td>,
                            <td valign="top" rowspan="{ $persons }">{ count( $project/../team/person ) }</td>)
                            else (<td>{string ("")}</td>,<td>{string ("")}</td>)
                        }
                        <td>{ string($p/firstname) }</td><td>{ string($p/lastname) }</td>
                    </tr>
            }
        </table>
    </body>
}