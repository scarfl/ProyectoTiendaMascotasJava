package Controlador;

/**
 *
 * @author Daniel M.A
 */
public interface CRUD {
    public boolean create(Object obj);
    public Object read (Object obj);
    public Object modify(Object obj);
    //creado
    public void modify();
    public boolean delete (Object obj);
    
    public void ordenar();
    public void ordenar(int ini, int fin);
    
    
}
