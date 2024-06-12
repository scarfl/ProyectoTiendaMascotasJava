/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class Consultas {

public void guardarUsuario(String usuario, String password) {
    ControladorBD db = new ControladorBD();
   String sql = "INSERT INTO usuarios (nombre, clave) VALUES ('" + usuario + "', '" + password + "');";
    try (Connection conexion = db.mysqlConexion();
         Statement st = conexion.createStatement()) {
        int rs = st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Guardado correctamente");
    } catch (SQLException e) {
        System.out.println(e);
    }
}


public boolean accesoUsuario(String user, String pass) {
    ControladorBD db = new ControladorBD();
    String usuarioCorrecto = null;
    String passCorrecto = null;
    try (Connection cn = db.conectar()) {
        PreparedStatement pst = cn.prepareStatement("SELECT nombre, clave FROM usuarios WHERE nombre = ?");
        pst.setString(1, user);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            usuarioCorrecto = rs.getString(1);
            passCorrecto = rs.getString(2);
        }
        if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
            JOptionPane.showMessageDialog(null, "Login correcto. Bienvenido " + user);
            return true; // Inicio de sesión exitoso
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            return false; // Inicio de sesión fallido
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
        return false; // Inicio de sesión fallido
    }
}


    public static void main(String[] args) {
        try {
            ControladorBD conBD = new ControladorBD();
            try (Connection con = conBD.mysqlConexion()) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios ORDER BY idUsuario");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getFloat(6));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
