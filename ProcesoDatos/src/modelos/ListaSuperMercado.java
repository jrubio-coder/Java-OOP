package modelos;

public class ListaSuperMercado {

    private String idProducto;
    private String nombreProducto;
    private String paisOrigen;
    private String fechaCaducidad;
    private double precioUnitario;

    public ListaSuperMercado(){

    }

    public ListaSuperMercado(String idProducto, String nombreProducto, String paisOrigen, String fechaCaducidad, double precioUnitario){

        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.paisOrigen = paisOrigen;
        this.fechaCaducidad = fechaCaducidad;
        this.precioUnitario = precioUnitario;
    }

    //getters y setters

    
    public String getIdProducto(){
        return idProducto;
    }

    public void setIdProducto(String idProd){
        this.idProducto = idProd;

    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nomProd){
        this.nombreProducto = nomProd;
    }

    public String getPaisOrigen(){
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrgen){
        this.paisOrigen = paisOrgen;
    }

    public String getFechaCaducidad(){
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fecCaducidad){
        this.fechaCaducidad = fecCaducidad;
    }

    public double getPrecioUnitario(){
        return precioUnitario;
    }

    public void setPrecioUnitario(double precUnitario){
        this.precioUnitario = precUnitario;
    }

    @Override
    public String toString() {
        return "Lista del SuperMercado :  \nId del Producto : " 
        + idProducto + 
        ", \nNombre del Producto : " 
        + nombreProducto + 
        ", \nPais de Origen: "
        + paisOrigen + 
        ", \nFecha de Caducidad : " 
        + fechaCaducidad + 
        ", \nPrecio Unitario : " + precioUnitario;
    }


}
