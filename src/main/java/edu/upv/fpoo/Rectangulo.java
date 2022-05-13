package edu.upv.fpoo;

/**
 * Esta clase representa una figura geométrica de tipo Rectángulo.
 * @author luisroberto
 */
public class Rectangulo {
    
    // Constructor de la objeto
    public Rectangulo() {
        
    }
    
    // Variables de instancia.
    private double lado1;
    private double lado2;
    private String color;
    
    public double getLado1() { return lado1; }
    
    public void setLado1(double value) { 
        lado1 = Math.abs(value);
    }
    
    public double getLado2() { return lado2; }
    
    public void setLado2(double lado2) {
        this.lado2 = Math.abs(lado2);
    }
    
    public String getColor() { return color; }
    
    public void setColor(String value) {
        color = value == null || value.isEmpty() ? 
                "[NO ESPECIFICADO]" : value.toUpperCase();
    }
      
    public double getArea() {
        return getLado1() * getLado2();
    }
    
    public void imprimirDetalle() {
        System.out.printf(
                "Rectángulo color %s con lado1 %f y lado2 %f; area = %f\n", 
                getColor(), getLado1(), getLado2(), getArea());
    }
    
}  // Termina mi clase Rectangulo.
