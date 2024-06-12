/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorPeces;
import java.util.Date;
import java.util.Scanner;
import Modelo.Perro;
import Modelo.Mascotas;
import Modelo.Peces;
/**
 *
 * @author Daniel M.A
 */
public class MenusPez
{
    ControladorPeces contpezz;
   Scanner llerDatos;
   public MenusPez()  
   {
        //Separa memoria cuuando se haga una instancia de esta clase
        contpezz= new ControladorPeces();
        llerDatos= new Scanner(System.in);
        instertarDatosDefault();
        
   }
   private void instertarDatosDefault()
   {
       Date fecha = new Date();
       Mascotas pezz= new Peces("leo", "ff", "azul", "lombris", 45000, 4, 8, 90, "si", "no", "lagunas", "alta", 4 );
       contpezz.create(pezz);
       pezz= new Peces ("leo", "ff", "azul", "lombris", 45000, 4, 8, 90, "si", "no", "lagunas", "alta", 4 );
       contpezz.create(pezz);
       pezz= new Peces ("leo", "ff", "azul", "lombris", 45000, 4, 8, 90, "si", "no", "lagunas", "alta", 4 );
       contpezz.create(pezz);
   }
   private void insertarDatos(){
       Peces pet= new Peces();
       System.out.println("MENU PEZ");
       
       System.out.println("Digite el nombre");
       pet.setNombre(llerDatos.next());
       System.out.println("Digite la Raza");
       pet.setRaza(llerDatos.next());
       System.out.println("Digite el color");
       pet.setColor(llerDatos.next());
       System.out.println("Digite el tipo de alimento");
       pet.settAlimento(llerDatos.next());
       System.out.println("Digite el id de la mascota");
       pet.setIdMascota(llerDatos.nextInt());
       System.out.println("Digite la fecha de venta");
       pet.setfVenta(llerDatos.nextInt());
       System.out.println("Digite el tiempo de vida");
       pet.settVida(llerDatos.nextInt());
       System.out.println("Digite el tipo de acuario");
       pet.settAcuario(llerDatos.next());
       System.out.println("Digite si es venenoso");
       pet.setVenenoso(llerDatos.next());
       System.out.println("Digite si convive con otros");
       pet.setConvivencia(llerDatos.next());
       System.out.println("Digite el numero de aletas");
       pet.setnAletas(llerDatos.nextInt());
       System.out.print("Digite el habitat");
       pet.setHabitat(llerDatos.next());
       System.out.println("digite el costo");
       pet.setCosto(llerDatos.nextInt());
       
      if(contpezz.create(pet)){
           System.out.println("Datos insertados");
       }
       else{
           System.out.println("ERROR AL INSERTAR");
       }
   }
   private void modifyUn() {
       Peces pet= new Peces();
       System.out.println("Digite el id del pez (consultar)");
       
       pet.setIdMascota(llerDatos.nextInt());
       pet=(Peces)contpezz.modify(pet);
       if(pet != null)
       {
        System.out.println(pet.toString());
       }
       else
       {
        System.out.println("El pez no existe");
       }
               
   }
   public void menusPeces()
   {
       System.out.println("MENU pez");
       System.out.println("1. Insertar");  
       System.out.println("2. Consultar Todos");
       System.out.println("3. Consultar dato");
       System.out.println("4. Modificar datos ");
       System.out.println("5. Borrar  datos");
       System.out.println("6. Ordenar datos sort");
       System.out.println("7. Ordenar datos quicksort");
       System.out.println("8. Ordenar Burbuja");
       System.out.println("9. Ordenar mersort");
       System.out.println("Digite una opcion");
       int opc= llerDatos.nextInt();
 
       switch(opc){
        case 1:
            insertarDatos();
            break;
        case 2:
           contpezz.modify();
            break;
        case 3:
            modifyUn();
            break;
        case 6:
            contpezz.ordenar();
            break;
         case 7:
            contpezz.ordenar(0, contpezz.ListaPeces.size()-1);
            break;
        default:
            System.out.println("Digito una opcion invalido");
            break;
        }
           
   }        
 
}
