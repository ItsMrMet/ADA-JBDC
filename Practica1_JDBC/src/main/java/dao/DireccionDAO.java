
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Direccion;

public class DireccionDAO {
    
    private Connection conexion;

    public DireccionDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
     public Direccion obtenerDireccionPorID(int idDireccion) {
        Direccion direccion = null;

        String consulta = "SELECT * FROM direccion WHERE idDireccion like ?";

        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setInt(1, idDireccion);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int numero = rs.getInt("Numero");
                String calle = rs.getString("Calle");
                String codPostal = rs.getString("cosPostal");
                String cuidad = rs.getString("Cuidad");

                direccion = new Direccion(idDireccion, numero, calle, codPostal, cuidad);
            }
        } catch (SQLException e) {
            System.out.println("Error! No se ha podido encontrar una direccion con esos datos.");
        }

        return direccion;
    }

    public boolean existeDireccion(int idDireccion) {
        try {
            String consulta = "SELECT idDireccion FORM direccion WHERE idDireccion LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, idDireccion);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public void insertarDireccion(Direccion direccion) {
        if (!existeDireccion(direccion.getIdDireccion())) {
            try {
                String consulta = "INSERT INTO direccion (idDireccion, numero, calle, codPostal, cuidad) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conexion.prepareStatement(consulta);

                ps.setInt(1, direccion.getIdDireccion());
                ps.setInt(2, direccion.getNumero());
                ps.setString(3, direccion.getCalle());
                ps.setString(4, direccion.getCodPostal());
                ps.setString(5, direccion.getCiudad());
                ps.executeUpdate();

                System.out.println("");
                System.out.println("Se ha insertado la direccion de manera correcta!");
            } catch (SQLException e) {
                System.out.println("ERROR, no se ha podido insertar la direccion");
            }
        } else {
            System.out.println("Ya existe una direccion con ese ID.");
        }
    }

    public void eliminarDireccion(int idDireccion) {
        try {
            String consulta = "DELETE FROM direccion WHERE idDireccion LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            ps.setInt(1, idDireccion);
            ps.executeUpdate();

            System.out.println("");
            System.out.println("Se ha eliminado la direccion con exito");
        } catch (SQLException e) {
            System.out.println("ERROR, no se ha podido eliminar la direccion");
        }
    }

    public void actualitzarDireccion(int idDireccion, int numero, String calle, String codPostal, String ciudad) {
        try {
            String consulta = "UPDATE direccion SET idDireccion = ?, numero = ?, calle = ?, codPostal = ?, cuidad = ? WHERE idDireccion LIKE ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            ps.setInt(1, idDireccion);
            ps.setInt(2, numero);
            ps.setString(3, calle);
            ps.setString(4, codPostal);
            ps.setString(5, ciudad);
            ps.setInt(6, idDireccion);
            ps.executeUpdate();
            System.out.println("");
            System.out.println("Se ha actuializado la direccion con exito.");
        } catch (SQLException e) {
            System.out.println("ERROR, No se ha podido actualizar la direccion.");
        }
    }
    
    
    public ArrayList<Direccion> obtenerTodasLasDirecciones() {
        ArrayList<Direccion> direcciones = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM direccion";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idDireccion = rs.getInt("ID Direccion");
                int numero = rs.getInt("Numero");
                String calle = rs.getString("Calle");
                String codPostal = rs.getString("Codigo postal");
                String cuidad = rs.getString("Ciudad");

                Direccion direccion = new Direccion(idDireccion, numero, calle, codPostal, cuidad);
                direcciones.add(direccion);
            }
        } catch (SQLException e) {
            System.out.println("ERROR, no se ha podido obtener todas las direcciones.");
        }
        return direcciones;
    }
    
}
