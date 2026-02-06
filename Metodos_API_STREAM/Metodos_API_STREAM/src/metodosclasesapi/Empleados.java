package metodosclasesapi;

public class Empleados {

    private int edadEmpleado;
    private String nombreEmpleado;
    private double salarioEmpleado;

    public Empleados(int edadEmp, String nombreEmp, double salarioEmp) {
        this.edadEmpleado = edadEmp;
        this.nombreEmpleado = nombreEmp;
        this.salarioEmpleado = salarioEmp;
    }

    public int getEdadEmpleado(){
        return edadEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    @Override
    public String toString() {
        return "Empleados: Edad del Empleado = " + edadEmpleado + ", Nombre del Empleado = " + nombreEmpleado + ", Salario del Empleado = "
                + salarioEmpleado ;
    }

    
    
    

}
