/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Registros_Mascotas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class conexion {
    
    public static Connection getconexion() {
        String conexionUrl ="jdbc:sqlserver://localhost:1433;"
                +"database= Registro_De_Mascotas;"
                +"user=Fernando;"
                + "password=Ejemplo123@;"
                +"loginfTimeout=30;"
                + "TrustServerCertificate=True;"
                ;
        try {
            
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return null;
    
    
}
}
