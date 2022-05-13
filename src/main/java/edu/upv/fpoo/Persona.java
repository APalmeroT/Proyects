package edu.upv.fpoo;

/**
 * Esta clase representa una una persona cualquiera.
 * @author luisroberto
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    
    public String getNombre() { return nombre; }
    
    public void setNombre(String value) { 
        nombre = value == null || value.isBlank() ? 
                null : value.trim().toUpperCase();
    }
    
    public String getApellidos() { return apellidos; }
    
    public void setApellidos(String value) {
        apellidos = value == null || value.isBlank() ?
                null : value.trim().toUpperCase();
    }
    
    public int getEdad() { return edad; }
    
    public void setEdad(int value) {
        edad = Math.abs(value);
    }
    
    public String getEmail() { return email; }
    
    public void setEmail(String value) {
        email = value == null || value.isBlank() || !value.contains("@") ?
                null : value.trim().toLowerCase();
    }
    
    public String getNombreCompleto() {
        String nombreCompleto = null;
        if (getNombre() == null) return null;
        nombreCompleto = getNombre();
        if (getApellidos() != null)
            nombreCompleto = nombreCompleto + " " + getApellidos();
        return nombreCompleto;
    }
}
