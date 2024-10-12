
package model;


public class Fabricar {
    
    private double precio;
    private String existencias;
    private int idArticulo;
    private int idFabrica;
    
    public Fabricar(int idArticulo, int idFabrica) {
        this.idArticulo = idArticulo;
        this.idFabrica = idFabrica;
    }
    
    public Fabricar(int idArticulo, int idFabrica, double precio, String existencias) {
        this.idArticulo = idArticulo;
        this.idFabrica = idFabrica;
        this.precio = precio;
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getExistencias() {
        return existencias;
    }

    public void setExistencias(String existencias) {
        this.existencias = existencias;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    @Override
    public String toString() {
        return "Fabricar{" + "precio=" + precio + ", existencias=" + existencias + ", idArticulo=" + idArticulo + ", idFabrica=" + idFabrica + '}';
    }
    
    
}
