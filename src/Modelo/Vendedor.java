package Modelo;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Vendedor extends Usuario {
     private int fIngreso,sueldo;

    public Vendedor() {
    }

    public Vendedor(int fIngreso, int sueldo, String nombre, String apellido, String cElectronico, String direccion, String tipo, int id, int telefono, int fNacimiento) {
        super(nombre, apellido, cElectronico, direccion, tipo, id, telefono, fNacimiento);
        this.fIngreso = fIngreso;
        this.sueldo = sueldo;
    }

    public Vendedor(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(int fIngreso) {
        this.fIngreso = fIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" + "fIngreso=" + fIngreso + ", sueldo=" + sueldo + '}';
    }
     
}
