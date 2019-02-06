package com.github.enriqueabsurdum.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection connection = null;
    private final String URL = "jdbc:derby://localhost:1527/usuarios_db";
    private final String USER = "root";
    private final String PASS = "root";
    
    public Connection conectar() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.printf("¡Conexión exitosa!\n");
        } catch (SQLException sqle) {
            System.out.printf("Error al conectar: %s\n", sqle.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.printf("Error driver: %s\n", cnfe.getMessage());
        }
        return connection;
    }

}
