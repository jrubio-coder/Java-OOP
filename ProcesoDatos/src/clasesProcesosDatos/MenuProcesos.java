package clasesProcesosDatos;



public class MenuProcesos {

    private int opcMenu;

    private String nombreUsuario;

    public void mostrarMenu() {
        System.out.print("Teclea tu nombre:");
        nombreUsuario = Leer.dato();
        do {

            System.out.println();
            System.out.println("Bienvenid@ ! " + nombreUsuario);
            System.out.println();
            System.out.println("*****************************************************");
            System.out.println("**** MENU PROCESOS DATOS                      *******");
            System.out.println("**** [1]. MATRICES CLASICAS                   *******");
            System.out.println("**** [2]. CONTEO DE ELEMENTOS DE DATOS        *******");
            System.out.println("**** [3]. ORDENAMIENTO DE ELEMENTOS DE DATOS  *******");
            System.out.println("**** [4]. OBTENER LONGITUD DE PALBRAS         *******");
            System.out.println("**** [5]. CONVERTIR A MAYUSCULAS              *******");
            System.out.println("**** [6]. SALIR DEL PROGRAMA                  *******");
            System.out.println("*****************************************************");
            System.out.print("Ingresa tu opcion -> ");
            opcMenu = Leer.datoInt();
            System.out.println();
            switch (opcMenu) {
                case 1:
                    desplegarMatrices();
                    break;
                case 2:
                    contarElementos();
                    break;
                case 3:
                    ordenarDatos();
                    break;
                case 4:
                    obtenerLongitudDePalabras();
                    break;
                case 5: 
                    convertir_A_Mayusculas();
                    break;
                default:
                    System.out.println("HAS_SALIDO_DEL_PROGRAMA " + nombreUsuario);
                    break;
            }

        } while (opcMenu != 6);
    }

    public void desplegarMatrices() {
        GenerarMatrices genMatr = new GenerarMatrices();
        genMatr.mostrarMenuMatrices();
    }

    public void ordenarDatos() {

        OrdenarDatos ordDatos = new OrdenarDatos();
        ordDatos.menuOrdenarDatos();
    }

    public void contarElementos() {

        ContarElementos conEle = new ContarElementos();
        conEle.mostrarMenuContar();
    }

    public void obtenerLongitudDePalabras(){
        
        LongitudPalabras lonPal = new LongitudPalabras();
        lonPal.menuLongitudPalabras();
    }

    public void convertir_A_Mayusculas(){

         ConvertirMayusculas convMayu = new ConvertirMayusculas();
         convMayu.mostrarMenuConversionMayusculas();

    }

}
