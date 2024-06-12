package Modelo;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Usuario implements Comparable<Usuario> {
    private String nombre,apellido,Cedula,cElectronico,direccion,tipo;
    private int id,telefono,fNacimiento;
    public int getCedula;

    public Usuario(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getGetCedula() {
        return getCedula;
    }

    public void setGetCedula(int getCedula) {
        this.getCedula = getCedula;
    }
    
    
    

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String cElectronico, String direccion, String tipo, int id, int telefono, int fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula= Cedula;
        this.cElectronico = cElectronico;
        this.direccion = direccion;
        this.tipo = tipo;
        this.id = id;
        this.telefono = telefono;
        this.fNacimiento = fNacimiento;
    }
    
    
   

    

    public Usuario(String Daniel, String Marulanda, String dmarulandaunaleduco, String manizales, String vendedor, String string, String string0) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getcElectronico() {
        return cElectronico;
    }

    public void setcElectronico(String cElectronico) {
        this.cElectronico = cElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", cElectronico=" + cElectronico + ", direccion=" + direccion + ", tipo=" + tipo + ", id=" + id + ", telefono=" + telefono + ", fNacimiento=" + fNacimiento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.id == other.id;
    }
    
    public int compareTo(Usuario u) {
            if(this.getId() == u.getId())
             return 0;
         else if(this.getId() > u.getId())
             return 1;
         else
             return -1;
    }
    
    
    
    
    
    
    

    public void setComtraseña(String string) {
    }

    public boolean getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getContraseña() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getCedula(boolean nextBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
}
