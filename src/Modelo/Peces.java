package Modelo;

/**
 *
 * @author Luisa Lopez Castro
 */
public class Peces extends Mascotas{
    private String habitat,tAcuario;
    private int nAletas;
    private String venenoso, convivencia;

    public Peces() {
    }

    public Peces(String nombre, String raza, String color, String tAlimento, int costo, int idMascota, int tVida, int fVenta, String venenoso, String convivencia, String habitat, String tAcuario, int nAletas ) {
        super(nombre, raza, color, tAlimento, costo, idMascota, tVida, fVenta);
    }

    

    public String getHabitat() {
        return habitat;
    }

    public String getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(String venenoso) {
        this.venenoso = venenoso;
    }

    public String getConvivencia() {
        return convivencia;
    }

    public void setConvivencia(String convivencia) {
        this.convivencia = convivencia;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String gettAcuario() {
        return tAcuario;
    }

    public void settAcuario(String tAcuario) {
        this.tAcuario = tAcuario;
    }

    public int getnAletas() {
        return nAletas;
    }

    public void setnAletas(int nAletas) {
        this.nAletas = nAletas;
    }


    
    @Override
    public String toString() {
        return super.toString()+ "Peces{" + "habitat=" + habitat + ", tAcuario=" + tAcuario + ", nAletas=" + nAletas + ", venenoso=" + venenoso + ", convivencia=" + convivencia + '}';
    }
    
    
}
