package modelos;

public class Palabras {

    private String nombrePersona;
    private String pais;
    private String ciudad;
    private String marcaTecnologia;
    private String aerolinea;
    private String idioma;

    public Palabras(){

    }

    public Palabras(String nombrePersona, String pais, String ciudad, String marcaTecnologia, String aerolinea, String idioma){
        this.nombrePersona = nombrePersona;
        this.pais = pais;
        this.ciudad = ciudad;
        this.marcaTecnologia = marcaTecnologia;
        this.aerolinea = aerolinea;
        this.idioma = idioma;
    }


    //getters y setters 

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMarcaTecnologia() {
        return marcaTecnologia;
    }

    public void setMarcaTecnologia(String marcaTecnologia) {
        this.marcaTecnologia = marcaTecnologia;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Palabras \nNombre de Persona : " 
        + nombrePersona + 
        " \nPais : " + pais + 
        " \nCiudad : " + ciudad
        + "\nMarca de Tecnologia : " + marcaTecnologia 
        + "\nAerolinea : " + aerolinea 
        + "\nIdioma : " + idioma;
    }

    
    


    

}
