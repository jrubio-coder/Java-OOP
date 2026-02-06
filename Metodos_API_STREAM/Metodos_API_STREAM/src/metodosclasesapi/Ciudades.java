/**
 * Ejemplo de una clase en java para utilizarla en 
 * STREAMS API  
 * @ author: Juan Pablo Sánchez Rubio
 */
package metodosclasesapi;

public class Ciudades {

    private String nombreCiudad;

    public Ciudades(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad --> " + nombreCiudad + " <--";
    }

}
