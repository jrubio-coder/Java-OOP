package modelos;

public class Tecnologia {

    private String nombreDelProducto;
    
    private String marca;
    
    public Tecnologia(){

    }

    public Tecnologia(String nombreDelProducto,  String marca){

        this.nombreDelProducto =  nombreDelProducto;
        
        this.marca = marca;
    }


    //getters y setters 

    public String getNombreDelArticulo(){
        return nombreDelProducto;
    }

    public void setNombreDelArticulo(String nombreDelArticulo){
        this.nombreDelProducto = nombreDelArticulo;
    }

  

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nTecnologia \nNombre Del Producto : " 
        + nombreDelProducto + 
         ",\nMarca : " + marca;
    }
}
