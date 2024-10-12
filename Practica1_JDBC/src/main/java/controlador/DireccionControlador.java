package controlador;

import model.Direccion;
import dao.DireccionDAO;

public class DireccionControlador {

    private DireccionDAO direccionDAO;

    public DireccionControlador(DireccionDAO direccionDAO) {
        this.direccionDAO = direccionDAO;
    }

    public Direccion crearDireccion(int idDireccion, int numero, String calle, String codPostal, String ciudad) {
        return new Direccion(idDireccion, numero, calle, codPostal, ciudad);
    }

    public void insertarDireccionBD(Direccion direccion) {
        direccionDAO.insertarDireccion(direccion);
    }

    public void eliminarDireccionBD(int idDireccion) {
        direccionDAO.eliminarDireccion(idDireccion);
    }

    
    public void actualizarDireccionBD(int idDireccion, int numero, String calle, String codPostal, String ciudad) {
        direccionDAO.actualitzarDireccion(idDireccion, numero, calle, codPostal, ciudad);
    }

    
    public void mostrarDirecciones() {
        //pacientVista.mostrarInformacioPacients(pacientDAO.obtenirTotsPacients());
    }

}
