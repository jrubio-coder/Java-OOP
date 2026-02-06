package clasesProcesosDatos;

import java.util.*;

import modelos.Palabras;

public class LongitudPalabras {

    private int opMenLongitud;
    private int nPalabras;

    private String nombrePersona;
    private String pais;
    private String ciudad;
    private String marcaTecnologia;
    private String aerolinea;
    private String idioma;

    public void menuLongitudPalabras() {

        do {
            System.out.println("**********************************************");
            System.out.println("**** [1] OBTENER LONGITUD DE  PALABRAS   *****");
            System.out.println("**** [2] VOLVER AL MENU PRINCIPAL        *****");
            System.out.println("**********************************************");
            System.out.print("Su opcion : ");
            opMenLongitud = Leer.datoInt();

            switch (opMenLongitud) {
                case 1:
                    generarLongitudPalabras();
                    break;
                default:
                    System.out.println("VOLVERAS_AL_ MENU");
                    break;
            }

        } while (opMenLongitud != 2);
    }

    public void generarLongitudPalabras() {

        System.out.println();

        do {
            System.out.print("Indica el numero de palabras a obtener su longitud : ");
            nPalabras = Leer.datoInt();
        } while (nPalabras < 1);

        System.out.println();

        List<Palabras> lngp = new ArrayList<>();

        for (int i = 0; i < nPalabras; i++) {

            System.out.print("Indica el nombre de una persona: ");
            nombrePersona = Leer.dato();

            System.out.println();

            System.out.print("Indica el nombre de un pais: ");
            pais = Leer.dato();

            System.out.println();

            System.out.print("Indica el nombre de una ciudad: ");
            ciudad = Leer.dato();

            System.out.println();

            System.out.print("Indica el nombre de una marca de Tecnologia: ");
            marcaTecnologia = Leer.dato();

            System.out.println();

            System.out.print("Indica el nombre de una aerolinea: ");
            aerolinea = Leer.dato();

            System.out.println();

            System.out.print("Indica un idioma: ");
            idioma = Leer.dato();

            System.out.println();

            // agregando las palabras a la lista

            lngp.add(new Palabras(nombrePersona, pais, ciudad, marcaTecnologia, aerolinea, idioma));

        }

        // mediante streams se obtiene la longitud de las palabras introducidas por el
        // usuario

        System.out.println();
        System.out.println("Mostrando la longitud de las palabras introducidas por el usuario: ");
        System.out.println();
        System.out.println("Longitud de la palabra  nombre : ");
        lngp.stream()

                .forEach(p -> System.out.println(
                        p.getNombrePersona() + " -> " + p.getNombrePersona().length() + " caracteres"));

        System.out.println();

        System.out.println("Longitud de la palabra  pais : ");
        lngp.stream()
                .forEach(p -> System.out.println(
                        p.getPais() + " ->  " + p.getPais().length() + " caracteres"));
        
        System.out.println();

        System.out.println("Longitud de la palabra ciudad : ");
        lngp.stream()
                .forEach(p -> System.out.println(
                        p.getCiudad() + " ->  " + p.getCiudad().length() + " caracteres"));

        System.out.println();
        
        System.out.println("Longitud de la palabra  marca de Tecnologia  : ");
        lngp.stream()
                .forEach(p -> System.out.println(
                        p.getMarcaTecnologia() + " ->  " + p.getMarcaTecnologia().length() + " caracteres"));

        System.out.println();

        System.out.println("Longitud  de la palabra aerolinea : ");
        lngp.stream()
                .forEach(p -> System.out.println(
                        p.getAerolinea() + " ->  " + p.getAerolinea().length() + " caracteres"));

        System.out.println();

        System.out.println("Longitud  de la palabra  idioma  : ");
        lngp.stream()
                .forEach(p -> System.out.println(
                        p.getIdioma() + " ->  " + p.getIdioma().length() + " caracteres"));

        System.out.println();


        
    }

}
