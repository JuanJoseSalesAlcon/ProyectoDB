/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Conexion {
Connection conexion;
    public Connection Conectar(String user, String pass)
    {
        try
        {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());   
        String nombre_servidor = "164.234.74.80";
        String numero_puerto = "1521";
        String sid="umg";
        String url = "jdbc:oracle:thin:@" + nombre_servidor+":"+numero_puerto+":"+sid;
        conexion = DriverManager.getConnection(url,user,pass);
        JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        return conexion;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Fallo la conexion..."+ e.getMessage());
        }
        return conexion;
    }
}
