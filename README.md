# Wildfly Bootable Jar Experiments

## Start application

The easiest way:
run `mvn wildfly-jar:dev-watch`
It keeps track of changes and restarts the application on changes. It works right of the bat.

## Simple microprofile config endpoint

Goto: `http://localhost:8080`. It will return a value defined in the file `src/main/resources/microprofile-config.properties`
