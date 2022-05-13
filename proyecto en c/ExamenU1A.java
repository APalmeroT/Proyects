/*


                        Examen Unidad 1
                      Fundamentos de POO

Instrucciones:

 1. Cree una clase que se llame Fecha. Esta clase será la representación de una
    fecha, por lo que debe tener tres propiedades encapsuladas: día, mes y año;
    por lo que debe tener los correspondientes métodos get.
 
 2. En la clase Fecha debe crear un constructor vacio, en que se establezcan las
    propiedades de dia, mes y año en 1, 1, y 1 respectivamente.

 3. Hacer un método set o varios métodos set para establecer la fecha correcta,
    puesto que el objeto, siempre debe representar una fecha correcta. Esto 
    quiere decir que al establecer los valores de día, mes y año se tiene que 
    validar que la fecha esté correcta. Es decir, el valor del año debe ser
    entre 0 y 3000; el mes entre 1 y 12 y el día dependiendo del mes, debe ser
    entre 1 - 30, 31, 28 (29 si es año bisiesto).

 4. Agregar un método en la clase fecha que se llame "toString()", el cual debe
    regresar el valor del objeto (la fecha) en formato dd/MM/yyyy, por ejemplo:
    el día de hoy sebe regresar un string 01/06/2020.
 
 5. Crear una clase Persona, la cual debe tener las propiedades nombre (String), 
    apellidos (String), email (String) y fechaNacimiento (Fecha); debidamente
    encapsulados. Como vera, la objeto persona se compone de un objeto Fecha.

 6. Implementar las funcionalidades descritas en el menún de opciones: Listar a
    todas las personas agergadas en el array list y agregar a una persona en el
    array list según datos de entrada.


 */
package edu.upv.fpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * 
 * @author estefaniadelafuente
 */
public class ExamenU1 {

    /**
     * Punto principal de entrada de la aplicación.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExamenU1 app = new ExamenU1();
        app.run();
    }

    /**
     * Ejecución principal de la aplicación.
     */
    public void run() {

        System.out.println("======================================");
        System.out.println("=          Examen Unidad 1           =");
        System.out.println("=        Fundamentos de POO          =");
        System.out.println("======================================\n");

        int opcion;

        do { // Ciclo principal de la aplicación correspondiente a las opciones.

            imprimirMenu();
            System.out.print("Opción seleccionada: ");
            opcion = in.nextInt();
            in.nextLine(); // Leer opción selecionada.
            System.out.println("");

            switch (opcion) {
                case 1: // Listar a las personas agregadas.
                    listarPersonas();
                    break;
                case 2: // Agregar una persona.
                    agregarPersona();
                    break;
                case 0: // Salir.
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Opción no válida");

            }

            System.out.println("");

        } while (opcion != 0);

    }

    /**
     * Imprime el menú de opciones de la aplicación.
     */
    public void imprimirMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println(" 1. Listar a las personas agregadas.");
        System.out.println(" 2. Agregar Persona.");
        System.out.println(" 0. SALIR.");
    }

    /**
     * Lista o imprime los datos de todas las personas registradas.
     */
    public void listarPersonas() {

        // TODO: Implementar la funcionalidad de listar todas las personas en el
        // ArrayList persona, aquí se tiene que mostrar toda la información de
        // las personas, el nombre completo, el email y la fecha de nacimiento.

        System.out.println("Numero de personas : " + personas.size());
        personas.forEach(persona -> {
            System.out.println(persona + "\n");
        });

    }

    /**
     * Pide los datos de una persona para crear su objeto correspondiente de tipo
     * Persona y la agrega al registro (ArrayList).
     */
    public void agregarPersona() {

        // TODO: Implementar la funcionalidad de agregar personas pidiendo los
        // datos de entrada para establecer cada propiedad. Una de las
        // propiedades que también debe establecerse es la fecha de nacimiento,
        // la cual puede pedir como más le convenga: pedir primero el día,
        // después el més y al ultimo el año... etc.
        System.out.println("Introduce nombre sin apellidos");
        String nombre;
        nombre = in.nextLine();
        System.out.println("Introduce  apellidos");
        String apellidos = in.nextLine();
        System.out.println("Introduce email");
        String email = in.nextLine();
        System.out.println("Introduce anio de nacimiento");
        int anio = in.nextInt();
        System.out.println("Introduce mes de nacimiento");
        int mes = in.nextInt();
        System.out.println("Introduce dia de nacimiento");
        int dia = in.nextInt();

        Fechaa fecha = new Fechaa();
        fecha.setFecha(dia, mes, anio);

        personas.add(new Persona(nombre, apellidos, email, fecha));

    }

    /**
     * ArrayList que contiene a los objetos de tipo persona que se agregan al
     * registro.
     */
    private final ArrayList<Persona> personas = new ArrayList<>();

    /**
     * Objeto Scanner que ayuda a obtener datos de entrada desde la consola.
     */
    private final Scanner in = new Scanner(System.in);

}