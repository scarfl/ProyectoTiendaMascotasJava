package Controlador;
import Modelo.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorPerro implements CRUD{
    public ArrayList<Perro> ListaPerro = new ArrayList<Perro>();

    public ControladorPerro() {
    }
    

    @Override
    public boolean create(Object obj) {
    Perro objPerro= new Perro();
    objPerro = (Perro)obj;
    boolean inserto=true;
        if(ListaPerro.isEmpty())
        {
            inserto = true;
            return ListaPerro.add(objPerro);
        }
        else
            for(Perro m:ListaPerro)
            {
                if(m.equals(objPerro))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaPerro.add(objPerro);
        }
    return inserto;
    
    }
    
public Perro getPerroById(int idPerro) {
    for (Perro perro : ListaPerro) {
        if (perro.getIdMascota() == idPerro) {
            return perro;
        }
    }
    return null;
}

  public boolean update(Perro perro) {
    int index = ListaPerro.indexOf(perro);
    if (index != -1) {
        ListaPerro.set(index, perro);
        return true;
    } else {
        return false;
    }
}  
    
    
    
    
    

    @Override
    public Object read(Object obj) {
        Perro objPerro = new Perro();
        objPerro =(Perro)obj;
    
        Collections.sort(ListaPerro);
        int pos = Collections.binarySearch(ListaPerro, objPerro);
        return ListaPerro.get(pos);
    }

    @Override
    public Object modify(Object obj) {
        Perro objPerro = new Perro();
        objPerro =(Perro)obj;
        
        int pos = Collections.binarySearch(ListaPerro, objPerro);
        return  ListaPerro.set(pos, objPerro);
        
    }

    @Override
    public boolean delete(Object obj) {
        Perro objPerro = new Perro();
        objPerro =(Perro)obj;
        
        Collections.sort(ListaPerro);
        int pos = Collections.binarySearch(ListaPerro, objPerro);
        objPerro = ListaPerro.get(pos);
        return ListaPerro.remove(objPerro);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaPerro);
    }

    @Override
    public void ordenar(int ini, int fin) {
       Perro pivote=ListaPerro.get(ini);
        int a=ini;
        int b=fin;
        Perro au;
        
        while(a<b){
            while(ListaPerro.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaPerro.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaPerro.get(a);
                ListaPerro.set(a,ListaPerro.get(b));
                ListaPerro.set(b,au);
            }
            
        }
        ListaPerro.set(ini,ListaPerro.get(b));
        ListaPerro.set(b,pivote);
        if (ini < b-1){
            ordenar(ini,b-1);
        }
        if(b+1<fin){
            ordenar(b+1,fin);
        }
    }

    @Override
    public void modify() {
    }

  
    
    
}
