# Wildfly Bootable Jar Experiments

## Start database and application

The easiest way:
* First start the database: run `docker compose -f src/main/docker/docker-compose.yml up -d`
* Then the application: run `mvn wildfly-jar:dev-watch`
  * It keeps track of changes and restarts the application on changes. It works right of the bat.

## Simple microprofile config endpoint

Goto: `http://localhost:8080`. It will return a value defined in the file `src/main/resources/microprofile-config.properties`

## Connect to a database

Added a `persistence.xml` referencing a datasource defined in the `datasource.cli` jboss CLI script.
In the `pom.xml` we configure the cli script to be run and we setup wildfly to be able to communicate with jpa.

## Writing an integration test

Start the database and run `mvn verify`. It will run the test `MicroProfileConfigEndpointIT.java`

The tests cannot be started from the IDE. The test needs a running database.