package Controlador;
import Modelo.Gato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorGato implements CRUD{
    public ArrayList<Gato> ListaGato = new ArrayList<Gato>();

    public ControladorGato() {
    }

    @Override
    public boolean create(Object obj) {
       Gato objGato = new Gato();
       objGato =(Gato) obj;
       boolean inserto=true;
        if(ListaGato.isEmpty())
        {
            inserto = true;
            return ListaGato.add(objGato);
        }
        else
            for(Gato g:ListaGato)
            {
                if(g.equals(objGato))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaGato.add(objGato);
        }
    return inserto;
    
    }

    @Override
    public Object read(Object obj) {
        Gato objGato = new Gato();
        objGato =(Gato) obj;
        
        Collections.sort(ListaGato);
        int pos = Collections.binarySearch(ListaGato, objGato);
        return ListaGato.get(pos);
//////        
//        for (Gato a:ListaGato){
//             if(a.equals(objGato)){
//                 return a;
//             }
//         }
//     return null;       
      
    }

    @Override
    public Object modify(Object obj) {
        Gato objGato= new Gato();
        objGato =(Gato) obj;
        int pos = Collections.binarySearch(ListaGato, objGato);
        return  ListaGato.set(pos, objGato);
        
//        int cont=0;
//        for (Gato a:ListaGato){
//            cont ++;
//            if(a.equals(objGato)){
//               ListaGato.set(cont,objGato);
//               return true;
//            }                

    }

  

    @Override
    public void ordenar() {
        
       Collections.sort(ListaGato);
    }
    

    @Override
    public boolean delete(Object obj) 
    {
        Gato objGato= new Gato();
        objGato =(Gato)obj;
        
        Collections.sort(ListaGato);
        int pos = Collections.binarySearch(ListaGato, objGato);
        objGato = ListaGato.get(pos);
        return ListaGato.remove(objGato);
        
//        int cont=0;
//        for (Gato a:ListaGato
//            
//            if(a.equals(objGato)){
//                System.out.println(ListaGato.remove(cont));
//               //System.out.println("Borrado:"+ListaGato);
//               return true;
//            }  
//            cont ++;
//        }
//        return false;
    }
    
    

    @Override
    public void ordenar(int ini, int fin) {
        Gato pivote=ListaGato.get(ini);
        int a=ini;
        int b=fin;
        Gato au;
        
        while(a<b){
            while(ListaGato.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaGato.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaGato.get(a);
                ListaGato.set(a,ListaGato.get(b));
                ListaGato.set(b,au);
            }
            
        }
        ListaGato.set(ini,ListaGato.get(b));
        ListaGato.set(b,pivote);
        if (ini < b-1){
            ordenar(ini,b-1);
        }
        if(b+1<fin){
            ordenar(b+1,fin);
        }
         
    }

    @Override
    public void modify() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}