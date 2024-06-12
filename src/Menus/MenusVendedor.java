/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorVendedor;
import java.util.Scanner;
import Modelo.Vendedor;
/**
 *
 * @author Daniel M.A
 */
public class MenusVendedor {
    private ControladorVendedor contven;
    private Scanner leerdatos;
    private final Vendedor vend;
    public MenusVendedor(){
        contven = new ControladorVendedor();
        vend = new Vendedor();
        leerdatos= new Scanner(System.in);
        insertarDatosDefault();
    }
     private void insertarDatosDefault(){
        Vendedor vend= new Vendedor(28, 33, "daniel", "Marulanda", "Daniel@unal.edu", "calle 47 d", "ss", 123, 30535609, 28);
        contven.create(vend);
        vend = new Vendedor(28, 33, "daniel", "Marulanda", "Daniel@unal.edu", "calle 47 d", "ss", 123, 30535609, 28);
        contven.create(vend);
        vend = new Vendedor(28, 33, "daniel", "Marulanda", "Daniel@unal.edu", "calle 47 d", "ss", 123, 30535609, 28);
        contven.create(vend);
     }
     
     private void borrarDatos() {
    contven.modify();
    System.out.println("Digite la cedula a borrar: ");
    String id = leerdatos.next(); 
    contven.delete(new Vendedor(id));
    System.out.println("Usuario borrado");

     }  
    public void menu(){
        System.out.println("Menu administrador ");
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
                contven.modify();
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}