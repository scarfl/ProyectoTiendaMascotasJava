/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorMascotas;
import java.util.Date;
import java.util.Scanner;
import Modelo.Mascotas;
import Modelo.Mascotas;
/**
 *
 * @author Daniel M.A
 */
public class MenusMascotas
{
    ControladorMascotas contmasco;
   Scanner llerDatos;
   public MenusMascotas()  
   {
        //Separa memoria cuuando se haga una instancia de esta clase
        contmasco= new ControladorMascotas();
        llerDatos= new Scanner(System.in);
        instertarDatosDefault();
        
   }
   private void instertarDatosDefault()
   {
       Date fecha = new Date();
       Mascotas mascot= new Mascotas("taille", "picher", "cafe", "dog shw",400, 999, 9, 28 );
       contmasco.create(mascot);
       mascot = new Mascotas ("taille", "picher", "cafe", "dog shw",400, 999, 9, 28 );
       contmasco.create(mascot);
       mascot= new Mascotas ("taille", "picher", "cafe", "dog shw",400, 999, 9, 28  );
       contmasco.create(mascot);
   }
    private void insertarDatos(){
       Mascotas pet= new Mascotas();
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
       System.out.println("Digite el costo");
       pet.setCosto(llerDatos.nextInt());
       
       if(contmasco.create(pet)){
           System.out.println("Datos insertados");
       }
       else{
           System.out.println("ERROR AL INSERTAR");
       }
   }
   private void modifyUn() {
       Mascotas pet= new Mascotas();
       System.out.println("Digite el id de la mascota (consultar)");
       
       pet.setIdMascota(llerDatos.nextInt());
       pet=(Mascotas)contmasco.modify(pet);
       if(pet != null)
       {
        System.out.println(pet.toString());
       }
       else
       {
        System.out.println("La mascota no existe");
       }
               
   }
    
   public void menusMascotas()
   {
       System.out.println("MENU mascota");
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
           contmasco.modify();
            break;
        case 3:
            modifyUn();
            break;
        case 6:
            contmasco.ordenar();
            break;
         case 7:
            contmasco.ordenar(0, contmasco.ListaMascotas.size()-1);
            break;
        default:
            System.out.println("Digito una opcion invalido");
            break;
        }
           
   }        
 
}