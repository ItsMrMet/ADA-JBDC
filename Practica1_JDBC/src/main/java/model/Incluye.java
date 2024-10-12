
package model;

import java.util.Date;


public class Incluye {
    
    private int cantidad;
    private Date fecha;
    private int idArticulo;
    
    public Incluye(int idArticulo, Date fecha) {
        this.idArticulo = idArticulo;
        this.fecha = fecha;
    }
    
    public Incluye(int idArticulo, Date fecha, int cantidad) {
        this.idArticulo = idArticulo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public String toString() {
        return "Incluye{" + "cantidad=" + cantidad + ", fecha=" + fecha + ", idArticulo=" + idArticulo + '}';
    }
    
    
}
