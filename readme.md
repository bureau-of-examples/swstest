

1. Generate JPA entities from database with Eclipse.
2. Generate Schema from java source files with jaxb2-maven-plugin.
3. Generate Java classes from schema (DTO) with maven-jaxb2-plugin.
4. Generate WSDL from schema...










1. Deploying Maven web project to Tomcat

- In Tomcat conf/tomcat-users.xml, configure a user with enough permissions:

  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  <role rolename="admin"/>

  <user username="deployer" password="pwd12345" roles="admin,manager-gui,manager-script,manager-jmx,manager-status"/>

- In Maven conf/settings.xml configure a server element:

    <server>
      <id>localTomcat7</id>
      <username>deployer</username>
      <password>pwd12345</password>
    </server>

- In the pom file of web project, configure the following plugin:

    <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>tomcat-maven-plugin</artifactId>
        <configuration>
            <url>http://127.0.0.1:8080/manager/text</url>
            <server>localTomcat7</server>
            <path>/wsexample</path>
        </configuration>
    </plugin>





==================Dev Guidelines=======================
1. See stored proc as a means of optimization.
2. Prefer static file to dynamic page.
3. Dump some workload on the client side.
4. Prefer static content to script execution.

generate jpa entities