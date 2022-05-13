package edu.upv.fpoo;

/**
 * Representa a un alumno de la Universidad.
 * @author luisroberto
 */
public class Alumno extends Persona {
    
    private int matricula;
    
    public int getMatricula() { return matricula; }
    
    public void setMatricula(int value) {
        matricula = Math.abs(value);
    }
    
}
