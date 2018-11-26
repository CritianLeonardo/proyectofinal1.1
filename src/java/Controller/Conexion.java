/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class Conexion {
    private String USERNAME = "ROOT ";
    private String PASSWORD = "12345 ";
    private String HOST = "localHost";
    private String PORT = "3306";
    private String DATABASE = "loginjsp";
    private String CLASSNAME ="com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;

public Conexion() throws SQLException{
    
    try {
        Class.forName(CLASSNAME);
        con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (ClassNotFoundException e) {
        System.err.println("Error "+e);
    }catch (SQLException e){
        System.err.println("Error "+e);
    }
    
    }
    
      public Connection getConexion(){
        return con;
}

    
    
}
