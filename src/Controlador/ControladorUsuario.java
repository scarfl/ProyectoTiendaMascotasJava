package Controlador;
import java.util.ArrayList;
import Modelo.Usuario;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Luisa Lopez Castro
 */
public class ControladorUsuario implements CRUD{
    public ArrayList<Usuario> ListaUsuario = new ArrayList<Usuario>();
    public ArrayList<Usuario> ListaAdministradores = new ArrayList<Usuario>();
    public ControladorUsuario() {
        
        Usuario UsuAdm = new Usuario("nombre", "apellido", "cElectronico", "direccion", "tipo", 0, 0, 0);
        ListaAdministradores.add(UsuAdm);
        
        
    }
    

    

    @Override
    public boolean create(Object obj) {
        Usuario objUsuario= new Usuario();
        objUsuario =(Usuario) obj;
    boolean inserto=true;
        if(ListaUsuario.isEmpty())
        {
            inserto = true;
            return ListaUsuario.add(objUsuario);
        }
        else
            for(Usuario u:ListaUsuario)
            {
                if(u.equals(objUsuario))
                  return inserto=false;
            }
        if(inserto)
        {
            inserto=ListaUsuario.add(objUsuario);
        }
    return inserto;
    
    }

    @Override
    public Object read(Object obj) {
        Usuario objUsuario= new Usuario();
        objUsuario =(Usuario) obj;
               
        Collections.sort(ListaUsuario);
        int pos = Collections.binarySearch(ListaUsuario, objUsuario);
        return ListaUsuario.get(pos);
    }

    @Override
    public Object modify(Object obj) {
        Usuario objUsuario= new Usuario();
        objUsuario =(Usuario) obj;
        
        int pos = Collections.binarySearch(ListaUsuario, objUsuario);
        return  ListaUsuario.set(pos, objUsuario);
    }

    @Override
    public boolean delete(Object obj) {
        Usuario objUsuario= new Usuario();
        objUsuario =(Usuario) obj;
        
        Collections.sort(ListaUsuario);
        int pos = Collections.binarySearch(ListaUsuario, objUsuario);
        objUsuario = ListaUsuario.get(pos);
        return ListaUsuario.remove(objUsuario);
    }

    @Override
    public void ordenar() {
        Collections.sort(ListaUsuario);
    }

    @Override
    public void ordenar(int ini, int fin) {
        Usuario pivote=ListaUsuario.get(ini);
        int a=ini;
        int b=fin;
        Usuario au;
        
        while(a<b){
            while(ListaUsuario.get(a).getNombre().compareToIgnoreCase(pivote.getNombre())< 1 && a < b) a++;
            while(ListaUsuario.get(b).getNombre().compareToIgnoreCase(pivote.getNombre())>1)b--;
            if (a<b){
                au=ListaUsuario.get(a);
                ListaUsuario.set(a,ListaUsuario.get(b));
                ListaUsuario.set(b,au);
            }
            
        }
        ListaUsuario.set(ini,ListaUsuario.get(b));
        ListaUsuario.set(b,pivote);
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