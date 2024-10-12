
package model;


public class Articulo {
    
    private int idArticulo;
    private String descripcion;
    
    public Articulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    public Articulo(int idArticulo, String descripcion) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", descripcion=" + descripcion + '}';
    }
    
    
}
