# Integration tests using Fabric8 Docker Maven Plugin Example

### How run integration tests with Fabric8

    mvn clean install -Pdocker   (activate docker profile)

You can run  integration tests by activating *docker* profile during Maven build. 


Fabric8 Docker Maven Plugin allows to  run a containers inside maven life cycle using
stop and start goals. This example configure Fabric8 Docker Maven Plugin inside maven integration
phase using maven-surefire-plugin




