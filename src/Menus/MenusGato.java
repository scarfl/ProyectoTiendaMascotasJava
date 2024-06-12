/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorGato;
import java.util.Date;
import java.util.Scanner;
import Modelo.Mascotas;
import Modelo.Gato;
/**
 *
 * @author Daniel M.A
 */
public class MenusGato {
     ControladorGato contgatt;
   Scanner llerDatos;
   public MenusGato()  
   {
        //Separa memoria cuuando se haga una instancia de esta clase
        contgatt= new ControladorGato();
        llerDatos= new Scanner(System.in);
        instertarDatosDefault();
        
   }
   private void instertarDatosDefault()
   {
       Date fecha = new Date();
       Mascotas gatt= new Gato("largo", 6, 8, "si", "brenda", "hdhdh","blanco", "chunky", 45000, 33, 9, 2,"no");
       contgatt.create(gatt);
       gatt= new Gato ("largo", 6, 8, "si", "brenda", "hdhdh","blanco", "chunky", 45000, 33, 9, 2, "si");
       contgatt.create(gatt);
       gatt= new Gato ("largo", 6, 8, "si", "brenda", "hdhdh","blanco", "chunky", 45000, 33, 9, 2, "no");
       contgatt.create(gatt);
   }
   private void insertarDatos(){
       Gato pet= new Gato();
       System.out.println("MENU Gato");
       
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
       System.out.println("Digite el tipo de pelaje");
       pet.settPelaje(llerDatos.next());
       System.out.println("Digite si tiene tendencia a cazar ");
       pet.settCaza(llerDatos.next());
       System.out.println("Digite el peso");
       pet.setPesoK(llerDatos.nextInt());
       System.out.print("Digite si es domestico");
       pet.setDomestico(llerDatos.next());
       System.out.println("digite el costo");
       pet.setCosto(llerDatos.nextInt());
       
      if(contgatt.create(pet)){
           System.out.println("Datos insertados");
       }
       else{
           System.out.println("ERROR AL INSERTAR");
       }
   }
   private void modifyUn() {
       Gato pet= new Gato();
       System.out.println("Digite el id del gato (consultar)");
       
       pet.setIdMascota(llerDatos.nextInt());
       pet=(Gato)contgatt.modify(pet);
       if(pet != null)
       {
        System.out.println(pet.toString());
       }
       else
       {
        System.out.println("El gato no existe");
       }
               
   }
   public void menusGato()
   {
       System.out.println("MENU Gato");
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
           contgatt.modify();
            break;
        case 3:
            modifyUn();
            break;
        case 6:
            contgatt.ordenar();
            break;
         case 7:
            contgatt.ordenar(0, contgatt.ListaGato.size()-1);
            break;
        default:
            System.out.println("Digito una opcion invalido");
            break;
        }
           
   }        
}

