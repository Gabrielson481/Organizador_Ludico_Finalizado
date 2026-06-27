package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    
    public Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:5432/organizador_ludico";
            String usuario = "postgres";
            String senha = "fera123ga";
            
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}