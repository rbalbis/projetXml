module namespace raweb = "http://raweb.inria.fr/";
declare function raweb:count-projects() as xs:integer {
    count(/raweb/identification/shortname)
};


declare function raweb:list-members($proj as xs:string) as element()* {

 for $project1 in /raweb
                let $m := $project1/team
                where string($project1/identification/shortname)=$proj
                return $m/person

};