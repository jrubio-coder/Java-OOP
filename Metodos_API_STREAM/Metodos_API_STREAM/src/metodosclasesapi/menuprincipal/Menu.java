package metodosclasesapi.menuprincipal;

//importaciones de las clases del paquete metodosclasesapi

import metodosclasesapi.Leer;
import metodosclasesapi.Ciudades;
import metodosclasesapi.*;


//importaciones de las libreria java.util para el manejo de datos 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Menu {

    // atributos de la clase menu
    private int opcMenu;
    private int nElementosDeCiudades;
    private int nElementosPersonas;
    private int nEmpleados;
    private int nDatos;

    //metodo que muestra el menu principal del programa al usuario 

    public void mostrarMenuAPIS() {

        do {
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("----- MENU APIS EJEMPLOS        ------");
            System.out.println("----- 1. Lista de Ciudades      ------");
            System.out.println("----- 2. Comparador de personas ------");
            System.out.println("----- 3. Filtrado de datos      ------");
            System.out.println("----- 4. Ordenamiento de datos  ------");
            System.out.println("----- 5. Salir del programa     ------");
            System.out.println("--------------------------------------");
            System.out.print("Su opción: ");
            opcMenu = Leer.datoInt();
            switch (opcMenu) {
                case 1:
                    listarCiudades();
                    break;
                case 2:
                    compararPersonas();
                    break;
                case 3:
                    filtrarDatos();
                    break;
                case 4:
                    ordenarDatos();
                    break;
                default:
                    System.out.println("USTED_HA_SALIDO_DEL_PROGRAMA_ADIOS");
                    break;
            }

        } while (opcMenu != 5);

    }
/*
 * Metodos de la clase Menu donde se aplican los metodos de las clases que estan en el paquete metodosclaseapi
 */
    public void listarCiudades() {
        System.out.println();
        System.out.print("Ingresa el numero de ciudades que deseas agregar a la lista: ");
        nElementosDeCiudades = Leer.datoInt();

        Ciudades[] ciudades = new Ciudades[nElementosDeCiudades];

        for (int i = 0; i < nElementosDeCiudades; i++) {
            System.out.print("Ingresa el nombre de la ciudad " + (i + 1) + ": ");
            String ciudad = Leer.dato();

            ciudades[i] = new Ciudades(ciudad);
        }

        // creamos un List version Stream API para la imprimir los datos

        List<Ciudades> listaCiudades = Arrays.asList(ciudades);

        System.out.println("Las ciudades agregadas son: ");
        listaCiudades.forEach(System.out::println);

    }

    public void compararPersonas() {
        System.out.println();

        System.out.print("Indica el numero de personas que deseas agregar a la lista y compararlas por edad: ");
        nElementosPersonas = Leer.datoInt();

        Personas[] personas = new Personas[nElementosPersonas];
        for (int i = 0; i < nElementosPersonas; i++) {
            System.out.println("Ingresa el nombre de la persona: " + (i + 1) + ": ");
            String nombre = Leer.dato();
            System.out.println("Ingresa la edad de la persona: " + (i + 1) + ": ");
            int edad = Leer.datoInt();

            personas[i] = new Personas(nombre, edad);
        }

        List<Personas> listaPersonas = Arrays.asList(personas);

        System.out.println("Las personas ingresadas son: ");
        listaPersonas.forEach(System.out::println);

        // Comparando las edades de las personas utilizando el stream API Comparator

        System.out.println();
        System.out.println("Mostrando la edad de la persona mayor: ");

        // aplicando el metodo Comparator de strams API

        listaPersonas.stream()
                .map(p -> p.getEdad())
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

    // metodo que permite filtrar un conjunto de datos  y por medio de la condicion dada de por el usuario

    public void filtrarDatos() {
        System.out.println();
        System.out.print("Indica el numero de datos que deseas filtar: ");
        nEmpleados = Leer.datoInt();

        List<Empleados> empleados = new ArrayList<>();
        for (int i = 0; i < nEmpleados; i++) {
            System.out.println("Ingresa la edad del empleado:  " + (i + 1) + ": ");
            int edadEmpl = Leer.datoInt();

            System.out.println("Ingresa el nombre del empleado:  " + (i + 1) + ": ");
            String nombreEmpl = Leer.dato();

            System.out.println("Ingresa el salario del empleado: " + (i + 1) + ": ");
            double salarioEmpl = Leer.datoDouble();

            empleados.add(new Empleados(edadEmpl, nombreEmpl, salarioEmpl));

        }

        // le pedimos al usuario que ingrese el salario minimo que se desea filtrarse

        System.out.println("Ingresa el salario minimo para filtrar los datos: ");
        double salarioMinimo = Leer.datoDouble();

        // Usamos Stream API y el método filter para filtrar los datos de los empleados
        List<Empleados> empleadosFiltrados = empleados.stream()
                .filter(empleado -> empleado.getSalarioEmpleado() >= salarioMinimo)
                .collect(Collectors.toList());

        System.out.println("El salario filtrado es:  " + salarioMinimo);
        empleadosFiltrados.forEach(System.out::println);

    }

    // metodo que permite ordenar los datos de un conjunto de personas  por su edad 
    
    public void ordenarDatos() {
        System.out.println();
        System.out.print("Indica el numero de datos que deseas ordenar: ");
        nDatos = Leer.datoInt();

        List<Person> personas = new ArrayList<>();

        for (int i = 0; i < nDatos; i++) {
            System.out.println("Ingresa el nombre de la persona :  " + (i + 1) + ": ");
            String nombre = Leer.dato();

            System.out.println("Ingresa la edad de la persona :  " + (i + 1) + ": ");
            int edad = Leer.datoInt();

            System.out.println("Ingresa el sexo de la persona  M o F: " + (i + 1) + ": ");
            char sexo = Leer.chardato();

            personas.add(new Person(nombre, edad, sexo));

        }

        // Se procede al realizar el ordenamiento de personas de acuerdo a su edad
        // utilizando Stream API

        System.out.println();
        System.out.println("Mostrando el ordenamiento de la edad de la persona (de menor a mayor)");

        personas.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Mostrando los nombre de las personas ordenadas Alfabeticamente de la (Z-A), introducidas por el usuario ");

        personas.stream()
                .map(e -> e.getName())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

       System.out.println();
       System.out.println("Mostrando los nombre de las personas ordenadas Alfabeticamente de la (A-Z), introducidas por el usuario ");

       personas.stream()
        .map(e->e.getName())
        .sorted()
        .forEach(System.out::println);

    }

}// fin de la clase Menu 

/*
 * Codigo realizado con fines educativos y con fines de entretenimiento personal para contribuir y repasar el 
 * aprendizaje adquirido como desarrollador.
 * 06/02/2025 
 */
