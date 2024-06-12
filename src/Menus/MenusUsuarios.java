/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorUsuario;
import java.util.Scanner;
import Modelo.Usuario;
import static com.sun.media.jfxmediaimpl.MediaUtils.error;
/**
 *
 * @author Daniel M.A
 */
public class MenusUsuarios {
    private ControladorUsuario contusu;
    private Scanner leerdatos;
    public MenusUsuarios(){
        contusu = new ControladorUsuario();
        leerdatos= new Scanner(System.in);
        insertarDatosDefault();
    }
     private void insertarDatosDefault(){
        Usuario usu= new Usuario("daniel", "marulanda", "dmarulanda@unal.edu", "calle 47 d", "tipo", 88, 305356, 28);
        contusu.create(usu);
        
        usu= new Usuario("daniel", "marulanda", "dmarulanda@unal.edu", "calle 47 d", "tipo", 100256, 305356, 28);
        contusu.create(usu);
        usu= new Usuario("daniel", "marulanda", "dmarulanda@unal.edu", "calle 47 d", "tipo", 100256, 305356, 28);
        contusu.create(usu);
     }
private void borrarDatos() {
    contusu.modify();
    System.out.println("Digite la cedula a borrar: ");
    String cedula = leerdatos.next(); 
    contusu.delete(new Usuario(cedula));
    System.out.println("Usuario borrado");
}





    public void menu(){
        System.out.println("Menu Usuarios ");
        System.out.println("1. Insertar ");
        System.out.println("2. Consultar Todos");
        System.out.println("3. Borrar un dato");
        System.out.println("Seleccione su opcion");
        int opc=leerdatos.nextInt();
        switch(opc){
            case 1:
                insertarDatosDefault();
                break;
            case 2:
                contusu.modify();
                break;
            case 3:
                borrarDatos();
                break;
            default:
                System.out.println("Digito una opcion invalido");
                break; 
        }
    }

    void menuUsuarios() {
       
    }
}     
