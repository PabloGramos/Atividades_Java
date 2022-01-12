
package com.mycompany.prova;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConectionFactory {
    
    public Connection conexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/prova","root","Dragoes0@");   
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
