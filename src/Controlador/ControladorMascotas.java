package Controlador;
import Modelo.Mascotas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorMascotas implements CRUD{
    public ArrayList<Mascotas> ListaMascotas = new ArrayList<Mascotas>();

    public ControladorMascotas() {
    }
    
    

    @Override
    public boolean create(Object obj) {
    Mascotas objMascotas = new Mascotas();
    objMascotas = (Mascotas)obj;
       boolean inserto=true;
        if(ListaMascotas.isEmpty())
        {
            inserto = true;
            return ListaMascotas.add(objMascotas);
        }
        else
            for(Mascotas m:ListaMascotas)
            {
                if(m.equals(objMascotas))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaMascotas.add(objMascotas);
        }
    return inserto;
    }

    @Override
    public Object read(Object obj) {
        Mascotas objMascotas = new Mascotas();
        objMascotas = (Mascotas)obj;
        
        Collections.sort(ListaMascotas);
        int pos = Collections.binarySearch(ListaMascotas, objMascotas);
        return ListaMascotas.get(pos);
    }

    @Override
    public Object modify(Object obj) {
        Mascotas objMascotas= new Mascotas();
        objMascotas =(Mascotas) obj;
        
        int pos = Collections.binarySearch(ListaMascotas, objMascotas);
        return  ListaMascotas.set(pos, objMascotas);
    }

    @Override
    public boolean delete(Object obj) {
        Mascotas objMascotas= new Mascotas();
        objMascotas =(Mascotas) obj;
        
        Collections.sort(ListaMascotas);
        int pos = Collections.binarySearch(ListaMascotas, objMascotas);
        objMascotas = ListaMascotas.get(pos);
        return ListaMascotas.remove(objMascotas);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaMascotas);
    }

    @Override
    public void ordenar(int ini, int fin) {
        Mascotas pivote=ListaMascotas.get(ini);
        int a=ini;
        int b=fin;
        Mascotas au;
        
        while(a<b){
            while(ListaMascotas.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaMascotas.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaMascotas.get(a);
                ListaMascotas.set(a,ListaMascotas.get(b));
                ListaMascotas.set(b,au);
            }
            
        }
        ListaMascotas.set(ini,ListaMascotas.get(b));
        ListaMascotas.set(b,pivote);
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
