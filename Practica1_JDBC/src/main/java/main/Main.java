package main;

import model.Cliente;

import model.Cliente;
import dao.ClienteDAO;
import controlador.*;
import java.sql.Connection;
import java.util.*;
import static main.Conexion.conectarMySQL;
import static main.Conexion.desconectarMySQL;

public class Main {
    
    private static final Connection conexion = conectarMySQL();
    private static final ClienteControlador clienteControlador = new ClienteControlador(new ClienteDAO(conexion));

    public static void main(String[] args) {
        
        //Cliente cliente = 
        clienteControlador.eliminarClienteBD(2);
        

    }
}
