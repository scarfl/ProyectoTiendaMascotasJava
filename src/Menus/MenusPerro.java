/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorPerro;
import java.util.Date;
import java.util.Scanner;
import Modelo.Perro;
import Modelo.Mascotas;

/**
 *
 * @author Daniel M.A
 */
public class MenusPerro {
    ControladorPerro contperr;
   Scanner llerDatos;
   public MenusPerro() 
   {
        //Separa memoria cuuando se haga una instancia de esta clase
        contperr= new ControladorPerro();
        llerDatos= new Scanner(System.in);
        instertarDatosDefault();    
   }
   private void instertarDatosDefault()
   {
       Date fecha = new Date();
       Mascotas perr= new Perro("pequeño", "si","alta", "baja", 45, 5, "si", "max", "Bull dog", "blanco", "chunky", 56, 768, 8, 28);
       contperr.create(perr);
       perr= new Perro ("pequeño", "si","alta", "baja", 45, 5, "si", "max", "Bull dog", "blanco", "chunky", 56, 768, 8, 28);
       contperr.create(perr);
       perr= new Perro ("pequeño", "si","alta", "baja", 45, 5, "si", "max", "Bull dog", "blanco", "chunky", 56, 768, 8, 28);
       contperr.create(perr);
   }
   private void insertarDatos(){
       Perro pet= new Perro();
       System.out.println("MENU PERRO");
       
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
       System.out.println("Digite el tamaño");
       pet.setTamano(llerDatos.next());
       System.out.println("Digite el pelaje");
       pet.setPelaje(llerDatos.next());
       System.out.println("Digite si tiene tendencia a ladrar");
       pet.settLadrar(llerDatos.next());
       System.out.println("Digite si tiene tendecia a roncar");
       pet.settRoncar(llerDatos.next());
       System.out.println("Digite el peso");
       pet.setPesoK(llerDatos.nextInt());
       System.out.println("Digite la edad");
       pet.setEdad(llerDatos.nextInt());
       System.out.println("Digite el costo");
       pet.setCosto(llerDatos.nextInt());
       
       
      if(contperr.create(pet)){
           System.out.println("Datos insertados");
       }
       else{
           System.out.println("ERROR AL INSERTAR");
       }
   }
   private void modifyUn()
   {
       Perro pet= new Perro();
       System.out.println("Digite el id del perro (consultar)");
       
       pet.setIdMascota(llerDatos.nextInt());
       pet=(Perro)contperr.modify(pet);
       if(pet != null)
       {
        System.out.println(pet.toString());
       }
       else
       {
        System.out.println("El perro no existe");
       }
       
       
       
       
               
   }
   private void borrarDatos() {
   System.out.println("Digite el ID del perro a borrar:");
   int idPerro = llerDatos.nextInt();
   
   if (contperr.delete(idPerro)) {
      System.out.println("Perro borrado exitosamente.");
   } else {
      System.out.println("El perro con el ID especificado no existe.");
   }
}
   
   
   
 private void modificarDatos() {
   System.out.println("Digite el ID del perro a modificar:");
   int idPerro = llerDatos.nextInt();
   
   Perro perro = contperr.getPerroById(idPerro);
   if (perro != null) {
      System.out.println("Digite el nuevo nombre:");
      perro.setNombre(llerDatos.next());
      System.out.println("Digite la nueva raza:");
      perro.setRaza(llerDatos.next());
      System.out.println("Digite el nuevo color:");
      perro.setColor(llerDatos.next());
      System.out.println("Digite el nuevo tipo de alimento:");
      perro.settAlimento(llerDatos.next());
      System.out.println("Digite el nuevo id de la mascota:");
      perro.setIdMascota(llerDatos.nextInt());
      System.out.println("Digite la nueva fecha de venta:");
      perro.setfVenta(llerDatos.nextInt());
      System.out.println("Digite el nuevo tamaño:");
      perro.setTamano(llerDatos.next());
      System.out.println("Digite el nuevo pelaje:");
      perro.setPelaje(llerDatos.next());
      System.out.println("Digite si tiene tendencia a ladrar (si/no):");
      perro.settLadrar(llerDatos.next());
      System.out.println("Digite si tiene tendencia a roncar (si/no):");
      perro.settRoncar(llerDatos.next());
      System.out.println("Digite el nuevo peso:");
      perro.setPesoK(llerDatos.nextInt());
      System.out.println("Digite la nueva edad:");
      perro.setEdad(llerDatos.nextInt());
      System.out.println("Digite el nuevo costo:");
      perro.setCosto(llerDatos.nextInt());

      if (contperr.update(perro)) {
         System.out.println("Datos modificados exitosamente.");
      } else {
         System.out.println("Error al modificar los datos.");
      }
   } else {
      System.out.println("El perro con el ID especificado no existe.");
   }
}

   
   
   
   
   
   
   
   
   public void menusPerro()
   {
       System.out.println("MENU perro");
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
           contperr.modify();
            break;
        case 3:
            modifyUn();
            break;
        case 4:
            modificarDatos();
            break;
        case 5:
            borrarDatos();
            break;   
        case 6:
            contperr.ordenar();
            break;
         case 7:
            contperr.ordenar(0, contperr.ListaPerro.size()-1);
            break;
        default:
            System.out.println("Digito una opcion invalido");
            break;
        }
           
   }        
}
