package edu.upv.fpoo;

/**
 * Esta clase representa a un maestro de la Universidad.
 * @author luisroberto
 */
public class Maestro extends Persona {
    
    private int numeroEmpleado;
    
    public int getNumeroEmpleado() { return numeroEmpleado; }
    
    public void setNumeroEmpleado(int value) {
        numeroEmpleado = Math.abs(value);
    }
}
