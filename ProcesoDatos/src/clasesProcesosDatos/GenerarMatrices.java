package clasesProcesosDatos;

public class GenerarMatrices {

    private int opcMenuMatrices; 
    private int nFilas;
    private int nCols;

    private int nFilas2;
    private int nCols2;


    public void mostrarMenuMatrices(){
 
     do{
         System.out.println("******************************************");
         System.out.println("*** [1] Generar Matrices        **********");
         System.out.println("*** [2] VOLVER A MENU PRINCIPAL **********");
         System.out.println("******************************************");
         System.out.print("Su opcion : ");
         opcMenuMatrices = Leer.datoInt();

         switch (opcMenuMatrices) {
            case 1:
                generarLasMatrices();
                break;
         
            default:
                System.out.println("Volvera al menu ");
                break;
         }
     }while(opcMenuMatrices != 2);

    }


    public void generarLasMatrices(){


        System.out.println("Para la matriz 1");
        System.out.println();

        do{
           System.out.print("Indica el numero de las filas: ");
           nFilas = Leer.datoInt();
        }while(nFilas < 1);

        System.out.println();

        do{
          System.out.print("Indica el numero de las columnas: ");
          nCols = Leer.datoInt();
        }while(nCols < 1);


        System.out.println();

        

        System.out.println();

        System.out.println("Para la matriz 2");
        System.out.println();
        do{
            System.out.print("Indica el numero de las filas: ");
            nFilas2 = Leer.datoInt();
        }while(nFilas2 < 1); 

        System.out.println();
        do{
            System.out.print("Indica el numero de las columnas: ");
            nCols2 = Leer.datoInt();
        }while(nCols2 < 1);
        


        int [][] matr1 = new int[nFilas][nCols];
        int [][] matr2 = new int[nFilas2][nCols2];

        System.out.println();

        System.out.println("Introduce los valores de la matriz1: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCols; j++){
                System.out.print( "matr [" +  i  + "][ " + j + " ]: ");
                matr1[i][j] = Leer.datoInt();
            }
        }

        System.out.println();


        System.out.println("Matriz 2: ");

        System.out.println();

         System.out.println("Introduce los valores de la matriz2: ");
        for(int i = 0; i < nFilas2; i++){
            for(int j = 0; j < nCols2; j++){
                System.out.print( "matr2 [" +  i  + "][ " + j + " ]: ");
                matr2[i][j] = Leer.datoInt();
            }
        }


        System.out.println("Imprimiendo Matriz 1 : ");

        System.out.println();
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nCols; j++){
                System.out.print( matr1[i][j] +"\t");
            }
            System.out.println();
        }
        
        System.out.println();

        System.out.println("Imprimiendo Matriz 2 : ");

        System.out.println();
        for(int i = 0; i < nFilas2; i++){
            for(int j = 0; j < nCols2; j++){
                System.out.print( matr2[i][j] +"\t");
            }
            System.out.println();
        }
       

    }
}
