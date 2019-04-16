/*
Description: Example Java code using JDBC driver to test connection into cslab-db.cs.wichita.edu database.

NOTE: MariaDB Connector/J jar file will need to be locally accessible, i.e. within the same directory as this code. It can be downloaded from: https://downloads.mariadb.com/Connectors/java/connector-java-2.4.1/mariadb-java-client-2.4.1.jar

To compile and run this code:
$ javac test.java
$ java -cp "mariadb-java-client-2.4.1.jar:." test

For further information see: https://mariadb.com/kb/en/library/about-mariadb-connector-j/

Author: Ben Roose modified Diego Dupin's example found at https://mariadb.com/kb/en/library/jdbc-driver-configuration-error/
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class test {
    public static void main(String[] args) {	
	// database specific parameters
	String host = "cslab-db.cs.wichita.edu";
	int port = 3306;
	String database = "insert_dbuser_database_here";
	String user = "insert_dbuser_here";
	String password = "insert_dbuser_password_here";

	String db_connection = String.format("jdbc:mariadb://%s:%s/%s?user=%s&password=%s", host, port, database, user, password);
	// System.out.println("DEBUG: db_connection string = " + db_connection);

	System.out.println("Testing connection to database: " + database);
	try {
	    try (Connection con = DriverManager.getConnection(db_connection)){
		System.out.println("Successfully connected to database: " + database);
	    }
	} catch (Exception e){
	    e.printStackTrace();
	}
    }
}
