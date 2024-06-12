package Controlador;
import java.util.ArrayList;
import Modelo.Vendedor;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorVendedor implements CRUD{
    public ArrayList<Vendedor> ListaVendedor = new ArrayList<Vendedor>();

    public ControladorVendedor() {
    }
    

    
    
    
    
    

    @Override
    public boolean create(Object obj) {
        Vendedor objVendedor= new Vendedor();
        objVendedor =(Vendedor) obj;
        boolean inserto=true;
        if(ListaVendedor.isEmpty())
        {
            inserto = true;
            return ListaVendedor.add(objVendedor);
        }
        else
            for(Vendedor u:ListaVendedor)
            {
                if(u.equals(objVendedor))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaVendedor.add(objVendedor);
        }
    return inserto;
    
    }

    @Override
    public Object read(Object obj) {
        Vendedor objVendedor= new Vendedor();
        objVendedor =(Vendedor) obj;
        
        Collections.sort(ListaVendedor);
        int pos = Collections.binarySearch(ListaVendedor, objVendedor);
        return ListaVendedor.get(pos);        
        
    }

    @Override
    public Object modify(Object obj) {
        Vendedor objVendedor= new Vendedor();
        objVendedor =(Vendedor) obj;
        
        int pos = Collections.binarySearch(ListaVendedor, objVendedor);
        return  ListaVendedor.set(pos, objVendedor);
    }

    @Override
    public boolean delete(Object obj) {
        Vendedor objVendedor= new Vendedor();
        objVendedor =(Vendedor) obj;
        
        Collections.sort(ListaVendedor);
        int pos = Collections.binarySearch(ListaVendedor, objVendedor);
        objVendedor = ListaVendedor.get(pos);
        return ListaVendedor.remove(objVendedor);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaVendedor);
    }

    @Override
    public void ordenar(int ini, int fin) {
       Vendedor pivote=ListaVendedor.get(ini);
        int a=ini;
        int b=fin;
        Vendedor au;
        
        while(a<b){
            while(ListaVendedor.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaVendedor.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaVendedor.get(a);
                ListaVendedor.set(a,ListaVendedor.get(b));
                ListaVendedor.set(b,au);
            }
            
        }
        ListaVendedor.set(ini,ListaVendedor.get(b));
        ListaVendedor.set(b,pivote);
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
