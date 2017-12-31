<projets>
{
    for $project in /raweb/identification/shortname
    return <projet>{ string( $project ) }</projet>
}
</projets>