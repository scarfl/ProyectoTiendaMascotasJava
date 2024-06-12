package Modelo;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Mascotas implements Comparable<Mascotas> {
    private String nombre,raza,color,tAlimento;
    private int idMascota,tVida,fVenta,costo;

    public Mascotas() {
    }

    public Mascotas(String nombre, String raza, String color, String tAlimento,int costo, int idMascota, int tVida, int fVenta) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tAlimento = tAlimento;
        this.idMascota = idMascota;
        this.tVida = tVida;
        this.fVenta = fVenta;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String gettAlimento() {
        return tAlimento;
    }

    public void settAlimento(String tAlimento) {
        this.tAlimento = tAlimento;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int gettVida() {
        return tVida;
    }

    public void settVida(int tVida) {
        this.tVida = tVida;
    }

    public int getfVenta() {
        return fVenta;
    }

    public void setfVenta(int fVenta) {
        this.fVenta = fVenta;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tAlimento=" + tAlimento + ", idMascota=" + idMascota + ", tVida=" + tVida + ", fVenta=" + fVenta + '}';
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

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
        final Mascotas other = (Mascotas) obj;
        return this.idMascota == other.idMascota;
    }
     
     public int compareTo(Mascotas m) {
         if(this.getIdMascota() == m.getIdMascota())
             return 0;
         else if(this.getIdMascota() > m.getIdMascota())
             return 1;
         else
             return -1;
    }
}
