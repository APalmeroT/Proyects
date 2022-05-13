package edu.upv.fpoo;

import java.util.Scanner;

public class Main {
    
    private Scanner in;
    
    public Main() {
        in = new Scanner(System.in);
    }
    
    public static void main(String[] args) {        
        Main app = new Main();
        app.run();        
    }

    public void run() {
        
        imprimirTituloAplicacion();
        
        int opcion = 0;
        
        do {
        
            imprimirMenu();
            System.out.print("Opcion seleccionada: ");
            opcion = in.nextInt(); in.nextLine();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    helloWorldJava();
                    break;
                case 2:
                    objetosFigurasGeometricas();
                    break;
                case 3:
                    objetosEscuela();
                    break;
                case 0:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opción no válida -.-");
            }
            
            System.out.println("");
            
        } while (opcion != 0);
        
    }
    
    private void imprimirTituloAplicacion( ) {
        System.out.println("\t\t== Práctica 01 ==\n");
        System.out.println("Hola clase de Fundamentos de POO! \n");
    }
    
    private void imprimirMenu() {
        System.out.println("Opciones:");
        System.out.println("  1. Hello world Java (input).");
        System.out.println("  2. Objetos de figuras geométricas.");
        System.out.println("  3. Objetos de la escuela (herencia).");
        System.out.println("  0. SALIR.\n");
    }

    private void helloWorldJava() {
        
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.printf("Hola %s, mucho gusto  :)\n", nombre);
        
        System.out.print("Ingrese su edad: ");
        int edad = in.nextInt();  in.nextLine();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
        else {
            System.out.println("Todavía no es mayor de edad.");
        }
        
        System.out.print("Escriba el nombre de su carrera: ");
        String carrera = in.nextLine();
        System.out.printf("Está en la carrera de %s \n", carrera);
    }

    private void objetosFigurasGeometricas() {
        System.out.println("\nFIGURAS GEOMÉTRICAS\n");
        System.out.println("Creando un rectángulo");
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.print("Especifique el color: ");
        rectangulo1.setColor(in.nextLine());
        System.out.print("Lado1: ");
        rectangulo1.setLado1(in.nextDouble()); in.nextLine();
        System.out.print("Lado2: ");
        rectangulo1.setLado2(in.nextDouble()); in.nextLine();
        
        rectangulo1.imprimirDetalle();
        
        System.out.println("El color actual es " + rectangulo1.getColor());
        System.out.println("Cambiando el color del rectangulo a negro...");
        rectangulo1.setColor("negro");
        rectangulo1.imprimirDetalle();
        
        System.out.println("\nCreando rectángulo2");
        
        System.out.print("Color: ");
        String color = in.nextLine();
        System.out.print("Lado1: ");
        double lado1 = in.nextDouble(); in.nextLine();
        System.out.print("Lado2: ");
        double lado2 = in.nextDouble(); in.nextLine();
        
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setColor(color);
        rectangulo2.setLado1(lado1);
        rectangulo2.setLado2(lado2);
        rectangulo2.imprimirDetalle();
        System.out.println("Area: " + rectangulo2.getArea());  
        
        // TODO: Crear otras 4 clases que representen a figuras geométricas,
        // todas con la propiedad de getArea().
        
        // TODO: Crear los 4 objetos que correspondan a las figuras geométricas
        // de las que hicieron las clases, y asignar sus propiedades según
        // datos de entrada.   
    }

    private void objetosEscuela() {
        
        System.out.println("== Objetos Escuela ==\n");
        
        System.out.println("Datos del alumno...");
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = in.nextLine();
        System.out.print("Edad: ");
        int edad = in.nextInt(); in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Matrícula: ");
        int matricula = in.nextInt(); in.nextLine();
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setEdad(edad);
        alumno.setEmail(email);
        alumno.setMatricula(matricula);
        System.out.println(
                "Se han ingresado los datos correctamente del alumno " +
                alumno.getNombreCompleto());
        
        // TODO: Crear el objeto de tipo Maestro a partir de datos de entrada
        // (como en la creación del objeto Alumno).
        
        // TODO: Crear una clase de tipo Administrativo, que herede de Persona
        // TODO: Crear el objeto de tipo Administrativo a partir de datos de entrada.
    }
}
