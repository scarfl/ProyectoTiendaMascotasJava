package Controlador;
import java.util.ArrayList;
import Modelo.Administrador;
import java.util.Collections;

/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorAdministrador implements CRUD{
    public ArrayList<Administrador> ListaAdministrador = new ArrayList<Administrador>();

    public ControladorAdministrador() {
    }    

    @Override
    public boolean create(Object obj) {
        Administrador objAdministrador= new Administrador();
        objAdministrador =(Administrador) obj;
        boolean inserto=true;
        if(ListaAdministrador.isEmpty())
        {
            inserto = true;
            return ListaAdministrador.add(objAdministrador);
        }
        else
            for(Administrador u:ListaAdministrador)
            {
                if(u.equals(objAdministrador))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaAdministrador.add(objAdministrador);
        }
    return inserto;
        
    }

    @Override
    public Object read(Object obj) {
        Administrador objAdministrador= new Administrador();
        objAdministrador =(Administrador) obj;
        
        Collections.sort(ListaAdministrador);
        int pos = Collections.binarySearch(ListaAdministrador, objAdministrador);
        return ListaAdministrador.get(pos);
        
//        for (Administrador a:ListaAdministrador){
//             if(a.equals(objAdministrador)){
//                 return a;
//             }
//         }
//     return null;       
//        
    }

    @Override
    public Object modify(Object obj) {
        Administrador objAdministrador= new Administrador();
        objAdministrador =(Administrador) obj;
        
        int pos = Collections.binarySearch(ListaAdministrador, objAdministrador);
        return  ListaAdministrador.set(pos, objAdministrador);
        
//        int cont=0;
//        for (Administrador a:ListaAdministrador){
//            cont ++;
//            if(a.equals(objAdministrador)){
//               ListaAdministrador.set(cont,objAdministrador);
//               return true;
//            }                
//        }
//        return false;
    }

    @Override
    public boolean delete(Object obj) {
        Administrador objAdministrador= new Administrador();
        objAdministrador =(Administrador) obj;
        
        Collections.sort(ListaAdministrador);
        int pos = Collections.binarySearch(ListaAdministrador, objAdministrador);
        objAdministrador = ListaAdministrador.get(pos);
        return ListaAdministrador.remove(objAdministrador);
//        int cont=0;
//        for (Administrador a:ListaAdministrador){
//            
//            if(a.equals(objAdministrador)){
//                System.out.println(ListaAdministrador.remove(cont));
//               //System.out.println("Borrado:"+ListaAdministrador);
//               return true;
//            }  
//            cont ++;
//        }
//        return false;
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaAdministrador);
    }

    @Override
    public void ordenar(int ini, int fin) {
        Administrador pivote=ListaAdministrador.get(ini);
        int a=ini;
        int b=fin;
        Administrador au;
        
        while(a<b){
            while(ListaAdministrador.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaAdministrador.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaAdministrador.get(a);
                ListaAdministrador.set(a,ListaAdministrador.get(b));
                ListaAdministrador.set(b,au);
            }
            
        }
        ListaAdministrador.set(ini,ListaAdministrador.get(b));
        ListaAdministrador.set(b,pivote);
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
