
package model;


public class Fabrica {
    
    private int idFabrica;
    private String telefono;
    private int numArticulosProvistos;
    
    public Fabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }
    
    public Fabrica(int idFabrica, String telefono, int numArticulosProvistos) {
        this.idFabrica = idFabrica;
        this.telefono = telefono;
        this.numArticulosProvistos = numArticulosProvistos;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumArticulosProvistos() {
        return numArticulosProvistos;
    }

    public void setNumArticulosProvistos(int numArticulosProvistos) {
        this.numArticulosProvistos = numArticulosProvistos;
    }

    @Override
    public String toString() {
        return "Fabrica{" + "idFabrica=" + idFabrica + ", telefono=" + telefono + ", numArticulosProvistos=" + numArticulosProvistos + '}';
    }
    
    
}
