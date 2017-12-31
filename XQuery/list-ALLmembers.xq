<AllMembers>
{
    for $members in /raweb/team/person
    return
        <member>
        <firstname>
        { 
            string( $members/firstname )
        }
        </firstname>
        <lastname>
        {
            string( $members/lastname )
        }
        </lastname>
        <categoryPro>
        {
            string( $members/categoryPro )
        }
        </categoryPro>
        <research-centre>
        {
        string( $members/research-centre )
        }
        </research-centre>
        </member>
}
</AllMembers>