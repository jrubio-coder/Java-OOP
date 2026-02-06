package clasesProcesosDatos;

import java.util.*;

import modelos.Tecnologia;

public class ConvertirMayusculas {

    private int nPalabras_A_Convertir;
    private int opcMenuMayu;

    private String nombreProducto;
    private String marca;


    public void mostrarMenuConversionMayusculas() {
        do {
            System.out.println("**************************************************");
            System.out.println("*** [1] CONVERTIR A MAYUSCULAS   *****************");
            System.out.println("*** [2] VOLVER AL MENU PRINCIPAL *****************");
            System.out.println("**************************************************");
            opcMenuMayu = Leer.datoInt();
            switch (opcMenuMayu) {
                case 1:
                    realizarConversionAMayusculas();
                    break;
            
                default:
                    System.out.println("VOLVERA_AL_MENU PRINCIPAL");
                    break;
            }
        } while (opcMenuMayu != 2);
    }


    public void realizarConversionAMayusculas(){

        do{
            System.out.print("Indica el numero de palabras que deseas convertir a mayusculas: ");
            nPalabras_A_Convertir = Leer.datoInt();
        }while(nPalabras_A_Convertir < 1);

        List<Tecnologia> cMay = new ArrayList<>();


        for(int i = 0;  i < nPalabras_A_Convertir; i++ ){

            System.out.println();
            System.out.print("Introduce el nombre del producto: ");
            nombreProducto = Leer.dato();

            System.out.println();

            System.out.print("Introduce la marca del producto: ");
            marca = Leer.dato();


            //agregando los datos introducidos por el usuario en la lista 

            cMay.add(new Tecnologia(nombreProducto, marca));
         
        }


        //imprimiendo las palabras originales 

        System.out.println();
        
        System.out.println("Imprimiendo las palabras originales sin modificar ");
        System.out.println();

        for(Tecnologia t : cMay){
            System.out.println(t);
        }
        
        //realizando la conversion de las palabras a mayusculas 

        System.out.println("Mostrando las palabras convertidas en Mayusculas");
        System.out.println();

        cMay.stream()
        .map(p -> p.getNombreDelArticulo().toUpperCase())
        .forEach(System.out::println);

        System.out.println();

        cMay.stream().map(p -> p.getMarca().toUpperCase()).
        forEach(System.out::println);

    }

}
