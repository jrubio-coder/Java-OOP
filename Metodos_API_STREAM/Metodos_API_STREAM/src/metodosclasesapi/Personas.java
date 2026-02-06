/**
 * Ejemplo de una clase en java para utilizarla en 
 * STREAMS API  
 * @ author: Juan Pablo Sánchez Rubio
 */
package metodosclasesapi;

public class Personas {

    private String nombre;
    private int edad;
    

    public Personas(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { 
        return nombre; 
    } 
    public int getEdad() { 
        return edad; 
    }

    @Override
    public String toString() {
         return "Nombre: " + nombre + ", Edad: " + edad;
    }

    

}
