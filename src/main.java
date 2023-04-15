
import Controladores.ConexionController;
import Modelos.Conexion;
import Vistas.frmLogin;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(null, true);
        Conexion ModeloConexion = new Conexion();
        ConexionController ControladorConexoin = new ConexionController(VistaLogin, VistaPrincipal, ModeloConexion);
    }
    
}
