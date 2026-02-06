package clasesProcesosDatos;

import modelos.Empleado;
import java.util.*;
public class OrdenarDatos {

    private int opcMenOrdDatos;

    private int nElementos;

    private String idEmpleado;
    private String nomEmpleado;
    private int numBatch;
    private String areaDeTrabajo;

    public void menuOrdenarDatos() {

        do {

            System.out.println("----------------------------------------------");
            System.out.println("--- [1] Ordenar datos              -----------");
            System.out.println("--- [2] Volver al menu principal   -----------");
            System.out.println("----------------------------------------------");
            System.out.print("Su opcion : ");
            opcMenOrdDatos = Leer.datoInt();

            switch (opcMenOrdDatos) {
                case 1:
                    generarOrdenamientoDatos();
                    break;

                default:
                    System.out.println("Volvera al menu principal");
                    break;
            }

        } while (opcMenOrdDatos != 2);
    }

    public void generarOrdenamientoDatos() {

        System.out.println();

        do {
            System.out.print("Indica el numero de elementos a ordenar: ");
            nElementos = Leer.datoInt();
        } while (nElementos < 1);

        System.out.println();

        //creamos una lista, para poder enlistar los datos y poderlos ordenarlos con base a los requerimientos definidos

        List<Empleado> empleados = new ArrayList<>();

        for(int i = 0; i < nElementos; i++){

            System.out.println("Introduce el id del empleado: ");
            idEmpleado = Leer.dato();
            System.out.println();
            System.out.println("Introduce el nombre del empleado: ");
            nomEmpleado = Leer.dato();
            System.out.println();
            System.out.println("Introduce el numero de batch del empleado: ");
            numBatch = Leer.datoInt();
            System.out.println();
            System.out.println("Introduce el area de trabajo del empleado: ");
            areaDeTrabajo = Leer.dato();

            System.out.println();

            empleados.add(new Empleado(idEmpleado, nomEmpleado, numBatch, areaDeTrabajo));

        }

        //realizando el proceso de ordenamiento de datos por el nombre de la persona 

        
        empleados.sort((Comparator.comparing(Empleado :: getnombreEmpleado)));

        //imprimiendo los datos introducidos por el usuario ordenados 


        System.out.println();
        System.out.println();

        System.out.println("\nLista de empleados ordenada por el nombre: ");
        for(Empleado e : empleados){
            System.out.println(e);
        }

    }
}
