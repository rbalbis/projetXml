xquery version "1.0";
import module
    namespace raweb = "http://raweb.inria.fr/" at "raweb-module.xq";
import module
    namespace request = "http://exist-db.org/xquery/request";

<div>
    {
for $oneProj in /raweb/identification/shortname
return

let $proj := request:get-parameter("proj", string( $oneProj ) )
return element {QName("http://www.w3.org/1999/xhtml", "html")} {
    <head><title>Project team summary</title></head>,
    <body><h1>{$proj} team summary</h1>
        <p>{
        for $projectName in /raweb/identification/projectName
        where string($projectName/../shortname)=$proj
        return <projectName>Project Name : { string( $projectName ) }</projectName>
        }
        </p>
        <p>{
        for $theme-de-recherche in /raweb/identification/theme-de-recherche
        where string($theme-de-recherche/../shortname)=$proj
        return <theme-de-recherche>Theme de recherche : { string( $theme-de-recherche ) }</theme-de-recherche>
        }
        </p>
        <p>{
        for $domaine-de-recherche in /raweb/identification/domaine-de-recherche
        where string($domaine-de-recherche/../shortname)=$proj
        return <domaine-de-recherche>Domaine de recherche : { string( $domaine-de-recherche ) }</domaine-de-recherche>
        }
        </p>
        <p>{
        for $urlTeam in /raweb/identification/urlTeam
        where string($urlTeam/../shortname)=$proj
        return <urlTeam>URL Team : { string( $urlTeam ) }</urlTeam>
        }
        </p>
        <p>{
        for $LeTypeProjet in /raweb/identification/LeTypeProjet
        where string($LeTypeProjet/../shortname)=$proj
        return <LeTypeProjet>Type de projet : { string( $LeTypeProjet ) }</LeTypeProjet>
        }
        </p>
        <p> Count persons for project {$proj} </p>
        <table border="2">
            <tr><th>Project</th><th>Persons</th><th>Firstname</th><th>Lastname</th><th>categoryPro</th><th>Research Centre</th></tr>
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
                        <td>{ string($p/firstname) }</td><td>{ string($p/lastname) }</td><td>{ string($p/categoryPro) }</td><td>{ string($p/research-centre) }</td>
                    </tr>
            }
        </table>
    </body>
}
}
</div>