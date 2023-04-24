
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Conexion;
import modelos.personaModel;
import vistas.*;

public class ConexionController implements ActionListener{
   fmrLogin VistaLogin;
   fmrPrincipal VistaPrincipal;
   Conexion ModeloConexion;
   frmPersonas VistaPersonas;
   personaModel ModeloPersona;

    public ConexionController(fmrLogin VistaLogin, fmrPrincipal VistaPrincipal, frmPersonas VistaPersonas, Conexion ModeloConexion, personaModel ModeloPer) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        this.VistaPersonas = VistaPersonas;
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaLogin.btnAceptar){
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(),
                    this.VistaLogin.txtPass.getText());
            if(ModeloConexion!=null)
            {
                this.VistaLogin.dispose();
                this.VistaPersonas.btnGuardar.addActionListener(this);
                this.VistaPersonas.setLocationRelativeTo(null);
                this.VistaPersonas.setVisible(true);
            }
            
        }
        if(arg0.getSource()==this.VistaPersonas.btnGuardar)
        {
            //MANDAR A GUARDAR EL REGISTRO
            this.ModeloPersona.GuardarPersona(this.VistaPersonas.txtApellidos.getText(),
                    this.VistaPersonas.txtNombre.getText(), this.VistaPersonas.txtTelefono.getText());
        }
    }
   
}
