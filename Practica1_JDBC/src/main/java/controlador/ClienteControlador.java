package controlador;

import model.Cliente;
import dao.ClienteDAO;

public class ClienteControlador {

    private ClienteDAO clienteDAO;

    public ClienteControlador(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public Cliente crearCliente(int idCliente, double saldo, int limitCredito, int descuento, int idDireccion) {
        return new Cliente(idCliente, saldo, limitCredito, descuento, idDireccion);
    }

    public void insertarClienteBD(Cliente cliente) {
        clienteDAO.insertarCliente(cliente);
    }

    public void eliminarClienteBD(int idCliente) {
        clienteDAO.eliminarCliente(idCliente);
    }

    
    public void actualizarClienteBD(int idCliente, double saldo, int limitCredito, int descuento, int idDireccion) {
        clienteDAO.actualitzarCliente(idCliente, saldo, limitCredito, descuento, idDireccion);
    }

   
    public void mostrarClientes() {
        //pacientVista.mostrarInformacioPacients(pacientDAO.obtenirTotsPacients());
    }
}
