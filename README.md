# EECS cslab-db MariaDB Connector Java Code Example

## Description

Example Java code using JDBC driver to test connection into cslab-db.cs.wichita.edu database.

## Compile and run example code from within a cslab-node

    $ git clone https://github.com/benroose/cslab_db_java_test.git
    $ cd cslab_db_java_test
    $ vi test.java
    [modify 'database', 'user', and 'password' variables for your specific database, then save and exit]
    $ javac test.java
    $ java -cp "mariadb-java-client-2.4.1.jar:." test

## Execution Note

MariaDB Connector/J mariadb-java-client-2.4.1.jar file will need to be locally accessible, i.e. within the same directory as this code. The mariadb-java-client-2.4.1.jar file is already in this repository or can be downloaded directly from the [MariaDB Knowledge Base](https://downloads.mariadb.com/Connectors/java/connector-java-2.4.1/mariadb-java-client-2.4.1.jar).

Further Information
[About MariaDB Connector/J](https://mariadb.com/kb/en/library/about-mariadb-connector-j)

## About the Author

Ben Roose modified Diego Dupin's example found in his [JDBC driver configuration error answer on mariabd.com](https://mariadb.com/kb/en/library/jdbc-driver-configuration-error/).