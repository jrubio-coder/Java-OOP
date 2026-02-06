package modelos;

public class Empleado {

    private String idEmpleado;
    private String nombreEmpleado;
    private int numeroBatch;
    private String areaTrabajo;

    public Empleado() {

    }

    public Empleado(String idEmpleado, String nombreEmpleado, int numeroBatch, String areaTrabajo) {

        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.numeroBatch = numeroBatch;
        this.areaTrabajo = areaTrabajo;

    }

    // getters y setters

    public String getIdEmpleado() {

        return idEmpleado;

    }

    public void setIdEmpleado(String idEmpleado) {

        this.idEmpleado = idEmpleado;

    }

    public String getnombreEmpleado() {

        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getNumeroBatch() {
        return numeroBatch;
    }

    public void setNumeroBatch(int numeroBatch) {
        this.numeroBatch = numeroBatch;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public String toString() {
        return "Informacion del Empleado: \nidEmpleado: " + idEmpleado +
                ", \nnombreEmpleado: " + nombreEmpleado +
                ", \nnumeroBatch: " + numeroBatch +
                ",\nareaTrabajo: " + areaTrabajo + "_";
    }


    

}
