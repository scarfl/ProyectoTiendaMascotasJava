package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorBD {
    public Connection mysqlConexion() 
    {
    Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/petshow","root","admin");
            System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println("No encontró el driver");
        }catch (SQLException ex){
            System.out.println("Usuario o contraseña errados");
            
            
        }
    return con;
    }
        public static void main(String[] args) {
        try {
            ControladorBD conBD = new ControladorBD();
            try (Connection con = conBD.mysqlConexion()) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from perro order by costo");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+
                            "  " + rs.getFloat(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
Connection conectar() {
    Connection con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/petshow", "root", "admin");
        System.out.println("Conectado a la base de datos");
    } catch (ClassNotFoundException ex) {
        System.out.println("No se encontró el driver");
    } catch (SQLException ex) {
        System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
    }
    return con;
}

   
    
}
