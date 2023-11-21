/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class Conexion {
    
    private static Connection con;
    //Declarar variables para realizar conexion
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    //Variables Barra Ventana
    int xMouse, yMouse;
    //Url de la base de datos (Revisar si el puerto corresponde)
    private static final String url = "jdbc:mysql://localhost:3306/worldofwarcraft";

    //Funcion conectar
    public void Conectar() {
        //Se vacia el objeto Connection
        con = null;
        //Try catch para capturar los errores
        try {
            Class.forName(driver);
            // Nos conectamos a la bd (Volver a escribir los atributos en caso de que arroje error)
            //Se importa DriverManager
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        //Se importa SQLException
        catch (ClassNotFoundException | SQLException e) {
            
        }
    }
}
