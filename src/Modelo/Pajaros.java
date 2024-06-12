package Modelo;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Pajaros extends Mascotas {
    private String tJaula,accJaula,dieta,tVuelo,habitat,pais,tPico;

    public Pajaros() {
    }

        public Pajaros(String tJaula, String accJaula, String dieta, String tVuelo, String habitat, String pais, String tPico, String nombre, String raza, String color, String tAlimento, int costo, int idMascota, int tVida, int fVenta) {
        super(nombre, raza, color, tAlimento, costo, idMascota, tVida, fVenta);
        this.tJaula = tJaula;
        this.accJaula = accJaula;
        this.dieta = dieta;
        this.tVuelo = tVuelo;
        this.habitat = habitat;
        this.pais = pais;
        this.tPico = tPico;
    }

    

    public String gettJaula() {
        return tJaula;
    }

    public void settJaula(String tJaula) {
        this.tJaula = tJaula;
    }

    public String getAccJaula() {
        return accJaula;
    }

    public void setAccJaula(String accJaula) {
        this.accJaula = accJaula;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String gettVuelo() {
        return tVuelo;
    }

    public void settVuelo(String tVuelo) {
        this.tVuelo = tVuelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String gettPico() {
        return tPico;
    }

    public void settPico(String tPico) {
        this.tPico = tPico;
    }

    @Override
    public String toString() {
        return super.toString()+"Pajaros{" + "tJaula=" + tJaula + ", accJaula=" + accJaula + ", dieta=" + dieta + ", tVuelo=" + tVuelo + ", habitat=" + habitat + ", pais=" + pais + ", tPico=" + tPico + '}';
    }
    
    
    
}
