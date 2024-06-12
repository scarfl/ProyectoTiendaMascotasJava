package Controlador;
import Modelo.Peces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorPeces implements CRUD{
    public ArrayList<Peces> ListaPeces = new ArrayList<Peces>();

    public ControladorPeces() {
    }
    

    @Override
    public boolean create(Object obj) {
    Peces objPeces= new Peces();
    objPeces = (Peces)obj;
    boolean inserto=true;
        if(ListaPeces.isEmpty())
        {
            inserto = true;
            return ListaPeces.add(objPeces);
        }
        else
            for(Peces m:ListaPeces)
            {
                if(m.equals(objPeces))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaPeces.add(objPeces);
        }
    return inserto;
    
    }

    @Override
    public Object read(Object obj) {
        Peces objPeces = new Peces();
        objPeces =(Peces)obj;
   
        Collections.sort(ListaPeces);
        int pos = Collections.binarySearch(ListaPeces, objPeces);
        return ListaPeces.get(pos);
    }

    @Override
    public Object modify(Object obj) {
        Peces objPeces = new Peces();
        objPeces =(Peces)obj;
        
        int pos = Collections.binarySearch(ListaPeces, objPeces);
        return  ListaPeces.set(pos, objPeces);
    }

    @Override
    public boolean delete(Object obj) {
        Peces objPeces = new Peces();
        objPeces =(Peces)obj;
        
        Collections.sort(ListaPeces);
        int pos = Collections.binarySearch(ListaPeces, objPeces);
        objPeces = ListaPeces.get(pos);
        return ListaPeces.remove(objPeces);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaPeces);
    }

    @Override
    public void ordenar(int ini, int fin) {
        Peces pivote=ListaPeces.get(ini);
        int a=ini;
        int b=fin;
        Peces au;
        
        while(a<b){
            while(ListaPeces.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaPeces.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaPeces.get(a);
                ListaPeces.set(a,ListaPeces.get(b));
                ListaPeces.set(b,au);
            }
            
        }
        ListaPeces.set(ini,ListaPeces.get(b));
        ListaPeces.set(b,pivote);
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
