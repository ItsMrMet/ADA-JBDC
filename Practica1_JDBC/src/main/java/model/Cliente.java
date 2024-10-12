
package model;


public class Cliente {
    
    private int idCliente;
    private double saldo;
    private int limitCredito;
    private int descuento;
    private int idDireccion;
    
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public Cliente(int idCliente, double saldo, int limitCredito, int descuento, int idDireccion) {
        this.idCliente = idCliente;
        this.saldo = saldo;
        this.limitCredito = limitCredito;
        this.descuento = descuento;
        this.idDireccion = idDireccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimitCredito() {
        return limitCredito;
    }

    public void setLimitCredito(int limitCredito) {
        this.limitCredito = limitCredito;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", saldo=" + saldo + ", limitCredito=" + limitCredito + ", descuento=" + descuento + ", idDireccion=" + idDireccion + '}';
    }
    
    
}
