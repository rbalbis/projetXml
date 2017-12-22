xquery version "3.1";

module namespace proj = "http://raweb.inria.fr/";

declare function proj:count-projects($doc) as xs:integer {
 
        
        let $e := count(data($doc))
        
        return $e
            
(:            <tr><td>{$i}</td><td>{$e}</td></tr>:)

(:            if ($i = "ACACIA") then  "hello":)
        
            };


