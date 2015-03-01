Nomster-Server
=
Nomster-Server represents the core server part of the Nomster Ecosystem. It provides a REST interface to work with the stored data.

What's Nomster?
==
Nomster is a simple approach to simplify the "what shall we eat at lunch time?" process. It provides a list of existing suggestions from colleagues.

Important to know
==
This version uses a H2 in memory database. To make this work with your JBoss / WildFly installation you'll have to extend your
configuration.xml file like this:

* look for the ExampleDS `<datasource>` entry
* replace the `<connection-url>` with: `<connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;INIT=create schema IF NOT
EXISTS nomster</connection-url>`