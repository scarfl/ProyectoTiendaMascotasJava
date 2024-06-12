package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Perro extends Mascotas {
    private String tamano,pelaje,tLadrar,tRoncar;
    private int pesoK,edad;
    private String babear;

    public Perro() {
    }

    public Perro(String tamano, String pelaje, String tLadrar, String tRoncar, int pesoK, int edad, String babear, String nombre, String raza, String color, String tAlimento, int costo, int idMascota, int tVida, int fVenta) {
        super(nombre, raza, color, tAlimento, costo, idMascota, tVida, fVenta);
        this.tamano = tamano;
        this.pelaje = pelaje;
        this.tLadrar = tLadrar;
        this.tRoncar = tRoncar;
        this.pesoK = pesoK;
        this.edad = edad;
        this.babear = babear;
    }

 
    
    
    
    
    
    
    

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String gettLadrar() {
        return tLadrar;
    }

    public void settLadrar(String tLadrar) {
        this.tLadrar = tLadrar;
    }

    public String gettRoncar() {
        return tRoncar;
    }

    public void settRoncar(String tRoncar) {
        this.tRoncar = tRoncar;
    }

    public int getPesoK() {
        return pesoK;
    }

    public void setPesoK(int pesoK) {
        this.pesoK = pesoK;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBabear() {
        return babear;
    }

    public void setBabear(String babear) {
        this.babear = babear;
    }

    @Override
    public String toString() {
        return "Perro{" + "tamano=" + tamano + ", pelaje=" + pelaje + ", tLadrar=" + tLadrar + ", tRoncar=" + tRoncar + ", pesoK=" + pesoK + ", edad=" + edad + ", babear=" + babear + '}';
    }
    
}

