
import controlador.ConexionController;
import modelos.Conexion;
import modelos.personaModel;
import vistas.fmrLogin;
import vistas.fmrPrincipal;
import vistas.frmPersonas;


public class main {

    public static void main(String[] args) {
        fmrPrincipal VistaPrincipal = new fmrPrincipal();
        fmrLogin VistaLogin = new fmrLogin(VistaPrincipal,true);
        frmPersonas VistaPersona = new frmPersonas(VistaPrincipal, true);
        Conexion ModeloConexion = new Conexion();
        personaModel ModeloPersona = new personaModel();
        
        ConexionController nuevaConexion = new ConexionController(VistaLogin, VistaPrincipal, VistaPersona, ModeloConexion, ModeloPersona);
    }
    
}
