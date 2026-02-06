package clasesProcesosDatos;


import java.util.*;

import modelos.ListaSuperMercado;

public class ContarElementos {

    private int opcMenContar;
    private int nElementosContar;

    private String idProducto;
    private String nombProducto;
    private String paisOrigen;
    private String fechCaducidad;
    private double precioUnitario;

    public void mostrarMenuContar() {

        do {
            System.out.println("*******************************************");
            System.out.println("**** [1] CONTAR ELEMENTOS         *********");
            System.out.println("**** [2] VOLVER AL MENU PRINCIPAL *********");
            System.out.println("*******************************************");
            System.out.print("Su opcion: ");
            opcMenContar = Leer.datoInt();
            switch (opcMenContar) {
                case 1:
                    contarLosElementos();
                    break;

                default:
                    System.out.println("Volvera_al_menu_principal");
                    break;
            }
        } while (opcMenContar != 2);
    }

    private void contarLosElementos() {

        System.out.println();

        do {

            System.out.print("Indica el numero de elementos de la lista del super a contar: ");
            nElementosContar = Leer.datoInt();
        } while (nElementosContar < 1);


        System.out.println();

        List<ListaSuperMercado> liSuper  = new ArrayList<>();

        for(int i = 0; i < nElementosContar; i++){

            System.out.print("Indica el id del producto: ");
            idProducto = Leer.dato();
            System.out.println();
            System.out.print("Indica el nombre del producto: ");
            nombProducto = Leer.dato();
            System.out.println();
            System.out.print("Indica el pais de origen del producto: ");
            paisOrigen = Leer.dato();
            System.out.println();
            System.out.print("Indica la fecha de caducidad: ");
            fechCaducidad = Leer.dato();
            System.out.println();
            System.out.print("Indica el precio del producto: ");
            precioUnitario = Leer.datoDouble();
            System.out.println();

 
            //agregando los productos introducidos por el usuario a la lista

            liSuper.add(new ListaSuperMercado(idProducto, nombProducto, paisOrigen, fechCaducidad, precioUnitario));

        }

       //imprimir los valores introducidos por el usuario ordenados

       liSuper.sort(Comparator.comparing(ListaSuperMercado :: getNombreProducto));
    
       System.out.println();
       
       System.out.println("Imprimiendo la lista del super con los articulos ordenados por orden: ");

       System.out.println();

       for(ListaSuperMercado ls: liSuper){
        System.out.println(ls);
       }

       //creando un Map para realizar el conteo de los elementos de la lista del super agregados por el usuario

       System.out.println();

       //contar cuantas veces aparece el producto en la lista

       Map<String, Integer> contarProductos = new HashMap<>();
       for(ListaSuperMercado sp : liSuper){
           contarProductos.put(sp.getNombreProducto(),
           contarProductos.getOrDefault((sp.getNombreProducto()), 0) +1);
       }

       System.out.println();

       //Imprimir el conteo de los productos 
       System.out.println("Conteo de personas por nombre: ");

       System.out.println();

       for(Map.Entry<String, Integer> entry : contarProductos.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }





    }

    

     





}
