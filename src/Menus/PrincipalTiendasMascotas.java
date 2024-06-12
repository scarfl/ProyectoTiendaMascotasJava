/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Menus.MenusUsuarios;
import Menus.MenusGato;
import Menus.MenusPerro;
import Menus.MenusPajaro;
import Menus.MenusPez;
import java.util.Scanner;

/**
 *
 * @author Daniel M.A
 */
public class PrincipalTiendasMascotas {
    private static MenusPerro menup = new MenusPerro();
    private static MenusGato menug = new MenusGato();
    private static  MenusPez menupz = new MenusPez();
    private static MenusPajaro menupj = new MenusPajaro();
    private static MenusUsuarios menuusu = new MenusUsuarios();
    public static void menuPP(){
        
        Scanner leerdatos= new Scanner(System.in);
        System.out.println("Menu Mascotas");
        System.out.println("1.Perros");
        System.out.println("2. Gatos");
        System.out.println("3. peces");
        System.out.println("4.pajaros");
        System.out.println("5. Usuarios");
        System.out.println("Seleccione la opcion");
        int opc= leerdatos.nextInt();
        switch(opc){
            case 1:
                menup.menusPerro();
                break;
            case 2:
                menug.menusGato();
                break;
            case 3 :
                menupz.menusPeces();
                break;
            case 4 :
                menupj.menusPajaro();
                break;
            case 5:
                menuusu.menuUsuarios();
                break;
            default:
                break;
                
            
           
        }
    }
    public static void main(String[]args){
        while(true)
        {
            
            menuPP();
        }
    }
}
