## This project is a collection of Java EE 7 api samples.


To build:
  gradlew build

This generates a war file in the build\libs folder that can be deployed to a Java EE 7 application server. It has been
tested on JBoss WildFly.

To generate an Intellij module:
  gradlew ideaModule ideaProject


The generated war file can be deployed directly to an application via an Intellij run configuration.
 1. Install WildFly
 2. Click Run/Edit Configurations
 3. Click the '+' on the upper left to add a new configuration.
 4. Select JBoss Server and Local.
 5. On the right side menu fill in the name - for example 'WildFly'
      On the server tab click the Configure tab to add your instance to the configured servers.
	       Browser url: http://localhost:8080/Hello/HelloServlet
	  On the deployment tab.
	       Add the external source: [Project Dir]\build\libs\Hello.war
