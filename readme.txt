
A) service template :
    1. Busines core logic subprojects

    api : define business api interface
    domain : Define business domains
    impl: demain business api implementation

    2. Outside world contract defination
    rest-base: project will have resources folders having open api specification based defined yml .
                project build will generate rest api contract and rest api client
    common : All common utility . adapeter to transform rest domain objects to business domain objects.

    3. generated contract implementation and ways to expose to outside world

    rest : Rest controller implementinting rest api contract generated by rest-base. Rest server running contract implementation .
    embedded-service:  service class implementinting rest api contract generated by rest-base. contact imlementation without any server

    4.restapi test

    restapi-test : karate based testing of rest server hosting rest implementation .

B)Total this project will generate 3 jars and one war .
rest-base will generate rest api contract jar and rest clinet jar
rest will generate war
 embedded-service will generate war

if you want to publish to remote repo in parent  build.gradle replace publishing repo details. uncomment commented section publishing.
in gradle.property remoteurl replace with actual remote url.


