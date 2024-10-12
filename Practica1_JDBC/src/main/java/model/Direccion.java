
package model;


public class Direccion {
    
    private int idDireccion;
    private int numero;
    private String calle;
    private String codPostal;
    private String ciudad;
    
    public Direccion (int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
    public Direccion(int idDireccion, int numero, String calle, String codPostal, String ciudad) {
        this.idDireccion = idDireccion;
        this.numero = numero;
        this.calle = calle;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", numero=" + numero + ", calle=" + calle + ", codPostal=" + codPostal + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
