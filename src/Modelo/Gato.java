package Modelo;

/**
 *
 * @author Daniel M.A
 */
public class Gato extends Mascotas{
    private String tPelaje;
    private int edad,pesoK;
    private String tCaza;
    private String Domestico;

    public Gato() {
    }

    public Gato(String tPelaje, int edad, int pesoK, String tCaza, String nombre, String raza, String color, String tAlimento, int costo, int idMascota, int tVida, int fVenta, String Domestico) {
        super(nombre, raza, color, tAlimento, costo, idMascota, tVida, fVenta);
        this.tPelaje = tPelaje;
        this.edad = edad;
        this.pesoK = pesoK;
        this.tCaza = tCaza;
        this.Domestico = Domestico;
    }

    

    public String gettPelaje() {
        return tPelaje;
    }

    public void settPelaje(String tPelaje) {
        this.tPelaje = tPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPesoK() {
        return pesoK;
    }

    public void setPesoK(int pesoK) {
        this.pesoK = pesoK;
    }

    public String gettCaza() {
        return tCaza;
    }

    public void settCaza(String tCaza) {
        this.tCaza = tCaza;
    }
    
    public void setDomestico(String Domestico) {
        this.Domestico = Domestico;
    }

    public String getDomestico() {
        return Domestico;
    }

    @Override
    public String toString() {
        return super.toString()+"Gato{" + "tPelaje=" + tPelaje + ", edad=" + edad + ", pesoK=" + pesoK + ", tCaza=" + tCaza + '}';
    }


}


