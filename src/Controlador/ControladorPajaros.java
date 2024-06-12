package Controlador;
import Modelo.Pajaros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorPajaros implements CRUD{
    public ArrayList<Pajaros> ListaPajaros = new ArrayList<Pajaros>();

    public ControladorPajaros() {
    }
    

    @Override
    public boolean create(Object obj) {
    Pajaros objPajaros= new Pajaros();
    objPajaros = (Pajaros)obj;
    boolean inserto=true;
        if(ListaPajaros.isEmpty())
        {
            inserto = true;
            return ListaPajaros.add(objPajaros);
        }
        else
            for(Pajaros m:ListaPajaros)
            {
                if(m.equals(objPajaros))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaPajaros.add(objPajaros);
        }
    return inserto;
    
    }

    @Override
    public Object read(Object obj) {
        Pajaros objPajaros = new Pajaros();
        objPajaros =(Pajaros)obj;
    
        Collections.sort(ListaPajaros);
        int pos = Collections.binarySearch(ListaPajaros, objPajaros);
        return ListaPajaros.get(pos);
    }

    @Override
    public Object modify(Object obj) {
        Pajaros objPajaros = new Pajaros();
        objPajaros =(Pajaros)obj;
        
        int pos = Collections.binarySearch(ListaPajaros, objPajaros);
        return  ListaPajaros.set(pos, objPajaros);
    }

    @Override
    public boolean delete(Object obj) {
        Pajaros objPajaros = new Pajaros();
        objPajaros =(Pajaros)obj;
        
        Collections.sort(ListaPajaros);
        int pos = Collections.binarySearch(ListaPajaros, objPajaros);
        objPajaros = ListaPajaros.get(pos);
        return ListaPajaros.remove(objPajaros);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaPajaros);
    }

    @Override
    public void ordenar(int ini, int fin) {
        Pajaros pivote=ListaPajaros.get(ini);
        int a=ini;
        int b=fin;
        Pajaros au;
        
        while(a<b){
            while(ListaPajaros.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaPajaros.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaPajaros.get(a);
                ListaPajaros.set(a,ListaPajaros.get(b));
                ListaPajaros.set(b,au);
            }
            
        }
        ListaPajaros.set(ini,ListaPajaros.get(b));
        ListaPajaros.set(b,pivote);
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
