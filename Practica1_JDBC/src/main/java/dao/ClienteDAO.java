package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDAO {

    private Connection conexion;

    public ClienteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public Cliente obtenerClientePorID(int idCliente) {
        Cliente cliente = null;

        String consulta = "SELECT * FROM cliente WHERE idCliente like ?";

        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Double saldo = rs.getDouble("Saldo");
                int limitCredito = rs.getInt("limite credito");
                int descuento = rs.getInt("Descuento");
                int idDireccion = rs.getInt("Direccion");

                cliente = new Cliente(idCliente, saldo, limitCredito, descuento, idDireccion);
            }
        } catch (SQLException e) {
            System.out.println("Error! No se ha podido encontrar un cliente con esos datos.");
        }

        return cliente;
    }

    public boolean existeCliente(int idCliente) {
        try {
            String consulta = "SELECT idCliente FORM cliente WHERE idCliente LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public void insertarCliente(Cliente cliente) {
        if (!existeCliente(cliente.getIdCliente())) {
            try {
                String consulta = "INSERT INTO cliente (idCliente, saldo, limitCredito, descuento, idDireccion) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conexion.prepareStatement(consulta);

                ps.setInt(1, cliente.getIdCliente());
                ps.setDouble(2, cliente.getSaldo());
                ps.setInt(3, cliente.getLimitCredito());
                ps.setInt(4, cliente.getDescuento());
                ps.setInt(5, cliente.getIdDireccion());
                ps.executeUpdate();

                System.out.println("");
                System.out.println("Se ha insertado los datos de manera correcta!");
            } catch (SQLException e) {
                System.out.println("ERROR, no se ha podido insertar el cliente");
            }
        } else {
            System.out.println("Ya existe un cliente con ese ID.");
        }
    }

    public void eliminarCliente(int idCliente) {
        try {
            String consulta = "DELETE FROM cliente WHERE idCliente LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            ps.setInt(1, idCliente);
            ps.executeUpdate();

            System.out.println("");
            System.out.println("Se ha eliminado el cliente con exito");
        } catch (SQLException e) {
            System.out.println("ERROR, no se ha podido eliminar el cliente.");
        }
    }

    public void actualitzarCliente(int idCliente, double saldo, int limitCredito, int descuento, int idDireccion) {
        try {
            String consulta = "UPDATE cliente SET idCliente = ?, saldo = ?, limitCredito = ?, descuento = ?, idDireccion = ? WHERE idCliente LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            ps.setInt(1, idCliente);
            ps.setDouble(2, saldo);
            ps.setInt(3, limitCredito);
            ps.setInt(4, descuento);
            ps.setInt(5, idDireccion);
            ps.setInt(6, idCliente);
            ps.executeUpdate();
            System.out.println("");
            System.out.println("Se ha actuializado el cliente con exito.");
        } catch (SQLException e) {
            System.out.println("ERROR, No se ha podido actualizar el cliente.");
        }
    }
    
    public ArrayList<Cliente> obtenerTodosLosClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM cliente";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idCliente = rs.getInt("ID Cliente");
                Double saldo = rs.getDouble("Saldo");
                int limitCredito = rs.getInt("limite credito");
                int descuento = rs.getInt("Descuento");
                int idDireccion = rs.getInt("Direccion");

                Cliente cliente = new Cliente(idCliente, saldo, limitCredito, descuento, idDireccion);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("ERROR, no se ha podido obtener datos de clientes.");
        }
        return clientes;
    }
}
