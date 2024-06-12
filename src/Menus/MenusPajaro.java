/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;
import Controlador.ControladorPajaros;
import java.util.Date;
import java.util.Scanner;
import Modelo.Pajaros;
import Modelo.Mascotas;
/**
 *
 * @author Daniel M.A
 */
public class MenusPajaro {
    ControladorPajaros contpajj;
   Scanner llerDatos;
   public MenusPajaro()  
   {
        //Separa memoria cuuando se haga una instancia de esta clase
        contpajj= new ControladorPajaros();
        llerDatos= new Scanner(System.in);
        instertarDatosDefault();
        
   }
    private void instertarDatosDefault()
   {
       Date fecha = new Date();
       Mascotas pajj = new Pajaros("grande", "no", "frutas", "Corre", "montaña", "colombia", "largo", "pedro", "tucan", "amarillo", "lombris", 678, 9000, 16, 8);
       contpajj.create(pajj);
       pajj= new Pajaros ("grande", "no", "frutas", "Corre", "montaña", "colombia", "largo", "pedro", "tucan", "amarillo", "lombris", 678, 9000, 16, 8);
       contpajj.create(pajj);
       pajj= new Pajaros ("grande", "no", "frutas", "Corre", "montaña", "colombia", "largo", "pedro", "tucan", "amarillo", "lombris", 678, 9000, 16, 8);
       contpajj.create(pajj);
   }
    private void insertarDatos(){
       Pajaros pet= new Pajaros();
       System.out.println("MENU Pajaro");
       
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
       System.out.println("Digite el tipo de jaula");
       pet.settJaula(llerDatos.next());
       System.out.println("Digite si tiene accesorios la jaula ");
       pet.setAccJaula(llerDatos.next());
       System.out.println("Digite el tipo de vuelo");
       pet.settVuelo(llerDatos.next());
       System.out.print("Digite si hace dieta");
       pet.setDieta(llerDatos.next());
       System.out.print("Digite el pais");
       pet.setPais(llerDatos.next());
       System.out.print("Digite el tipo de pico");
       pet.settPico(llerDatos.next());
       System.out.println("digite el costo");
       pet.setCosto(llerDatos.nextInt());
       
      if(contpajj.create(pet)){
           System.out.println("Datos insertados");
       }
       else{
           System.out.println("ERROR AL INSERTAR");
       }
   }
     private void modifyUn() {
       Pajaros pet= new Pajaros();
       System.out.println("Digite el id del Pajaro (consultar)");
       
       pet.setIdMascota(llerDatos.nextInt());
       pet=(Pajaros)contpajj.modify(pet);
       if(pet != null)
       {
        System.out.println(pet.toString());
       }
       else
       {
        System.out.println("El Pajaro no existe");
       }
               
   }
   public void menusPajaro()
   {
       System.out.println("MENU Pajaro");
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
           contpajj.modify();
            break;
        case 3:
            modifyUn();
            break;
        case 6:
            contpajj.ordenar();
            break;
         case 7:
            contpajj.ordenar(0, contpajj.ListaPajaros.size()-1);
            break;
        default:
            System.out.println("Digito una opcion invalido");
            break;
        }
           
   }        
}
