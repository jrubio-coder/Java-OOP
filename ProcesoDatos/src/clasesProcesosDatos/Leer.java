package clasesProcesosDatos;

import java.io.*;

public class Leer {

    public static String dato() {

        String sdato = "";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            // Leer. La entrada finaliza al pulsar la tecla Entrar
            sdato = flujoE.readLine();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return sdato;
    }

    public static short datoShort() {
        try {
            return Short.parseShort(dato());

        } catch (NumberFormatException e) {
            return Short.MIN_VALUE; // valor más pequeño
        }

    }

    public static int datoInt() {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE; // valor más pequeño
        }
    }

    public static long datoLong() {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException e) {
            return Long.MIN_VALUE; // valor mas pequeño
        }
    }

    public static float datoFloat() {
        try {
            return Float.parseFloat(dato());
        } catch (NumberFormatException e) {
            return Float.NaN; // No es un numero, valor float
        }
    }

    public static double datoDouble() {
        try {
            return Double.parseDouble(dato());
        } catch (NumberFormatException e) {
            return Double.NaN; // No es un numero, valor double.
        }
    }

}
