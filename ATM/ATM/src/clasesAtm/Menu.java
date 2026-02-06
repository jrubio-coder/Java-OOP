package clasesAtm;

public class Menu {

    private int opc = 0; // opcion para menu principal
    private int opRetiro = 0; // opcion para retirar dinero
    private double SALDO_INICIAL = 12000.0; // <--- el saldo inicial esto se puede cambiar de acuerdo a las necesidades
                                            // del usuario
    private double cantidad_a_retirar = 0; // o´pcion para retirar otra cantidad
    private int opcConsultar = 0; // opcion para consultar saldo
    private int opcDepositar = 0; // opcion para depositar efectivo
    private double cantidad_a_depositar = 0; // opcion para depositar otra cantidad

    public void mostrarMenuPrincipal() {
        do {
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("--- CITIBANAMEX 24 HRS ATM --------");
            System.out.println("--- [1]. RETIRAR EFECTIVO  --------");
            System.out.println("--- [2]. CONSULTAR SALDO   --------");
            System.out.println("--- [3]. REALIZAR DEPÓSITO --------");
            System.out.println("--- [4]. FINALIZAR ATM     --------");
            System.out.println("-----------------------------------");
            System.out.print("Su opción: ");
            opc = Leer.datoInt();
            switch (opc) {
                case 1:
                    realizarRetiro();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    realizarDeposito();
                    break;
                default:
                    System.out.println("Ha_salido_del ATM_SERVICIO_CERRADO");
                    System.out.println("¡GRACIAS_POR_SU_PREFERENCIA!");
                    break;
            }
        } while (opc != 4);
    }

    private void realizarRetiro() {

        do {
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("---  RETIRAR EFECTIVO              --------");
            System.out.println("*** [1].$ 100.00                   --------");
            System.out.println("*** [2].$ 200.00                   --------");
            System.out.println("*** [3].$ 500.00                   --------");
            System.out.println("*** [4].$ 1000.00                  --------");
            System.out.println("*** [5].$ 1500.00                  --------");
            System.out.println("*** [6].RETIRAR OTRA CANTIDAD      --------");
            System.out.println("*** [7]. VOLVER  AL MENU PRINCIPAL --------");
            System.out.println("-------------------------------------------");
            System.out.print("Su opción: ");
            opRetiro = Leer.datoInt();
            switch (opRetiro) {
                case 1:
                    retirar_100dlls();
                    break;
                case 2:
                    retirar_200dlls();
                    break;
                case 3:
                    retirar_500dlls();
                    break;
                case 4:
                    retirar_1000dlls();
                    break;
                case 5:
                    retirar_1500dlls();
                    break;
                case 6:
                    retirar_otra_cantidad();
                    break;
                default:
                    System.out.println("Volverá_al_menu_principal");
                    break;
            }
        } while (opRetiro != 7);
    }

    private void retirar_100dlls() {
        double retiro_100dlls = 100.0;

        // se realiza la operación de retirar la cantidad de 100 dlls
        double retirarCantidad = 0;

        retirarCantidad = SALDO_INICIAL - retiro_100dlls;

        System.out.println("Usted retiró : " + "$ " + retirarCantidad);

    }

    private void retirar_200dlls() {
        double retiro_200dlls = 200.0;
        // se realiza la operación de retirar la cantidad de 200 dlls
        double retirarCantidad = 0;
        retirarCantidad = SALDO_INICIAL - retiro_200dlls;
        System.out.println("Usted retiró :  " + "$ " + retirarCantidad);

    }

    private void retirar_500dlls() {
        double retiro_500dlls = 500.0;
        // se realiza la operación de reirar la cantidad de 500 dlls
        double retirarCantidad = 0;
        retirarCantidad = SALDO_INICIAL - retiro_500dlls;
        System.out.println("Usted retiró :  " + "$ " + retirarCantidad);
    }

    private void retirar_1000dlls() {
        double retiro_1000dlls = 1000.0;
        // se realiza la operación de retirar la cantidad de 1000 dlls
        double retirarCantidad = 0;
        retirarCantidad = SALDO_INICIAL - retiro_1000dlls;
        System.out.println("Usted retiró :  " + "$ " + retirarCantidad);
    }

    private void retirar_1500dlls() {
        double retiro_1500dlls = 1500.0;
        // se realiza la operación de retirar la cantidad de 1500 dlls
        double retirarCantidad = 0;
        retirarCantidad = SALDO_INICIAL - retiro_1500dlls;
        System.out.println("Usted retiró :  " + "$ " + retirarCantidad);
    }

    private void retirar_otra_cantidad() {

        System.out.print("Ingresa la cantidad que desea retirar: ");
        cantidad_a_retirar = Leer.datoDouble();

        // se verifica si la cantidad ingresada es suficiente al saldo inicial de la
        // persona
        if (cantidad_a_retirar <= SALDO_INICIAL) {
            SALDO_INICIAL -= cantidad_a_retirar;
            System.out.println("USTED RETIRÓ : " + " $ " + SALDO_INICIAL);
        } else {
            System.out.println("FONDOS INSUFICIENTES");
        }

        System.out.println("Usted tiene ahora: " + " $ " + SALDO_INICIAL);

    }

    private void consultarSaldo() {
        do {
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("++++  $ CONSULTAR SALDO $             -----");
            System.out.println("++++ [1]. CONSULTAR MI SALDO          -----");
            System.out.println("++++ [2]. VOLVER AL MENU PRINCIPAL    -----");
            System.out.println("-------------------------------------------");
            System.out.print("Su opción: ");
            opcConsultar = Leer.datoInt();
            switch (opcConsultar) {
                case 1:
                    checarSaldo();
                    break;
                default:
                    System.out.println("Volverá_al_menu_principal");
                    break;
            }
        } while (opcConsultar != 2);
    }

    private void checarSaldo() {
        System.out.println("USTED TIENE AHORA: " + "$ " + SALDO_INICIAL);
    }

    private void realizarDeposito() {
        do {
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("****  $ DEPOSITAR EFECTIVO $            ******");
            System.out.println("**** [1]. $ 100.00                      ******");
            System.out.println("**** [2]. $ 200.00                      ******");
            System.out.println("**** [3]. $ 500.00                      ******");
            System.out.println("**** [4]. $ 1000.00                     ******");
            System.out.println("**** [5]. $ 1500.00                     ******");
            System.out.println("**** [6]. $ 2000.00                     ******");
            System.out.println("**** [7]. DEPOSITAR OTRA CANTIDAD       ******");
            System.out.println("**** [8]. VOLVER AL MENU PRINCIPAL      ******");
            System.out.println("**********************************************");
            System.out.print("Su opción : ");
            opcDepositar = Leer.datoInt();
            switch (opcDepositar) {
                case 1:
                    depositar_100dlls();
                    break;
                case 2:
                    depositar_200dlls();
                    break;
                case 3:
                    depositar_500dlls();
                    break;
                case 4:
                    depositar_1000dlls();
                    break;
                case 5:
                    depositar_1500dlls();
                    break;
                case 6:
                    depositar_2000dlls();
                    break;
                case 7:
                    depositar_Otra_Cantidad();
                    break;
                default:
                    System.out.println("Volverá_al_menú_principal");
                    break;
            }
        } while (opcDepositar != 8);
    }

    private void depositar_100dlls() {

        double deposito_100dlls = 100.0;
        // se realiza la operación de depósito de 100 dlls

        SALDO_INICIAL = SALDO_INICIAL + deposito_100dlls;

        System.out.println("Usted depositó " + "$ " + SALDO_INICIAL);
    }

    private void depositar_200dlls() {
        double deposito_200dlls = 200.0;
        // se realiza la operación de depósito de 200 dlls

        SALDO_INICIAL = SALDO_INICIAL + deposito_200dlls;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);

    }

    private void depositar_500dlls() {
        double deposito_500dlls = 500.0;
        // se realiza la operación de depósito de 500 dlls
        SALDO_INICIAL = SALDO_INICIAL + deposito_500dlls;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);
    }

    private void depositar_1000dlls() {
        double deposito_1000dlls = 1000.0;
        // se realiza la operación de depósito de 1000 dlls
        SALDO_INICIAL = SALDO_INICIAL + deposito_1000dlls;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);
    }

    private void depositar_1500dlls() {
        double deposito_1500dlls = 1500.0;
        // se realiza la operación de depósito de 1500 dlls
        SALDO_INICIAL = SALDO_INICIAL + deposito_1500dlls;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);
    }

    private void depositar_2000dlls() {
        double deposito_2000dlls = 2000.0;
        // se realiza la operación de depósito de 2000 dlls
        SALDO_INICIAL = SALDO_INICIAL + deposito_2000dlls;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);
    }

    private void depositar_Otra_Cantidad() {
        System.out.print("Indique la cantidad que desea depositar: ");
        cantidad_a_depositar = Leer.datoDouble();

        SALDO_INICIAL += cantidad_a_depositar;
        System.out.println("Usted depositó  " + "$ " + SALDO_INICIAL);
    }

    /**
     * Fin del programa, realizado con fines educativos y por hobby.
     * Las funciones de este cajero son básicas para poder entender como funciona un
     * cajero de verdad.
     * Realizado el 12-10-2024 por @ Juan Pablo Sánchez Rubio.
     */
}
