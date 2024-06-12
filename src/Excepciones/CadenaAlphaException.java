/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author santy
 */

    
    public class CadenaAlphaException extends Exception{

    public CadenaAlphaException() {
    }

    public CadenaAlphaException(String string) {
        super(string);
    }    
   public void validarCadena(String cadena) throws CadenaAlphaException {
    String NUMERIC_PATTERN = "^[0-9]+$";
    boolean match = cadena.matches(NUMERIC_PATTERN);
    if (!match) {
        throw new CadenaAlphaException("En este campo solo se permiten caracteres numéricos");
    }


  }
    
     public void validarCorreo(String cadena) throws CadenaAlphaException
    {
        String ALPHANUMERIC_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("Correo no permitido");
  
  }
    public void validarNombreMascota(String cadena) throws CadenaAlphaException
    {
        String ALPHANUMERIC_PATTERN = "^[a-zA-Z0-9\\s]+$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("Nombre no permitido");
  
  } 
    
    public void validarNombreUsuario(String cadena) throws CadenaAlphaException
    {
        String ALPHANUMERIC_PATTERN = "^*([a-zA-Z0-9\\s]{8})+$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("Nombre no permitido debe tener 8 caracteres");
  
  } 
    
    public void validarContraseña(String cadena) throws CadenaAlphaException
    {
        String ALPHANUMERIC_PATTERN = "^(?=.\\d)(?=.[!@#$%^&°¬|])[A-Z].{8,}$";
//         String ALPHANUMERIC_PATTERN = "^(?=.[A-Z])(?=.\\d)(?=.*[@#$%^&+=])(?=.{8,}).+$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("Contraseña no permitida");
  } 
    
public void validarFecha(String cadena) throws CadenaAlphaException {
    String DATE_PATTERN = "^(0[1-9]|1\\d|2[0-9]|3[01])(0[1-9]|1[0-2])\\d{4}$";
    boolean match = cadena.matches(DATE_PATTERN);
    if (!match) {
        throw new CadenaAlphaException("Formato de fecha no válido. Se espera el formato dd/MM/yyyy");
    }
}

 public void validarDireccion(String cadena) throws CadenaAlphaException
    {
        String ALPHANUMERIC_PATTERN = "^*([a-zA-Z0-9\\s]){1,}+$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("Direccion no permitida");
  
  } 

}
    
    
    

