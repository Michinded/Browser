package menu;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Librerias Externas
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
//******************

public class principal extends JFrame{
	
//Iniciador de NJavegador (CUIDADO AL IMPLEMENTAR)
	JWebBrowser navegador = new JWebBrowser();
	
	private final JLabel user = new JLabel ("Usuario: ");
	private final JTextField user1 = new JTextField (10);
	private final JLabel pass = new JLabel ("Contraseña: ");
	private final JPasswordField pass1 = new JPasswordField (10);
	private final JButton ok = new JButton( "ACCEDER");
	//private final JSeparator separador = new JSeparator();
	private final JButton GglAca = new JButton();
	private final JButton Wiki = new JButton();
	private final JButton Mong = new JButton();
	
	
	public static void main(String args[]) {
		principal v = new principal();
		
		v.setVisible(true);
	}
	
	public principal(){
		setTitle("Navegador Academico");
		setSize(1280, 720);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Login();
		
		
	}
	
	public void Login(){
		String SP, SU, SP2;
		String SP1;
		SP = "123456";
		SU = "Admin";
		
		
		//Metodos para colocar los parametros de LogIn;
		Container contenedor = getContentPane();
		SpringLayout lay = new SpringLayout();
		
		contenedor.setLayout(lay);
		//Etiqueta de Usuario (Indicador)
		lay.putConstraint ( SpringLayout.WEST, user, 10, SpringLayout.WEST, contenedor); // X
		lay.putConstraint ( SpringLayout.WEST, user, 30, SpringLayout.WEST, contenedor); // Y
		
		//Campo nombre usuario (Campo de llenado)
		lay.putConstraint ( SpringLayout.WEST, user1, 10, SpringLayout.WEST, contenedor); // X
		lay.putConstraint ( SpringLayout.WEST, user1, 90, SpringLayout.WEST, contenedor); // Y
		
		//Etiqueta de Contraseña (Indicador)
		lay.putConstraint ( SpringLayout.WEST, pass, 10, SpringLayout.WEST, contenedor); // X
		lay.putConstraint ( SpringLayout.WEST, pass, 220, SpringLayout.WEST, contenedor); // Y
				
		//Campo contraseña de usuario (Campo de llenado)
		lay.putConstraint ( SpringLayout.WEST, pass1, 10, SpringLayout.WEST, contenedor); // X
		lay.putConstraint ( SpringLayout.WEST, pass1, 300, SpringLayout.WEST, contenedor);
		
		//Separador
		//lay.putConstraint (SpringLayout.WEST, separador, 15, SpringLayout.WEST, contenedor);
		//lay.putConstraint (SpringLayout.NORTH, separador, 15, SpringLayout.WEST, contenedor);
		
		//Ok button (Acces)
		lay.putConstraint ( SpringLayout.WEST, ok, 6, SpringLayout.WEST, contenedor); // X
		lay.putConstraint ( SpringLayout.WEST, ok, 440, SpringLayout.WEST, contenedor);
	
		String hi = "ERROR DE ACCESO";
		//Accion al presionar el boton OK
		ok.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent evento) {
				
				//Obtiene los contenidos en los campos de texto
				String valorPass = new String(pass1.getPassword());
				String valorUser = new String(user1.getText());
				
				//Compara si los dos campos esta rellenados y los limpia si no lo estan (Cada bloque hace lo mismo)
				if(user1.getText().isEmpty() || valorPass.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ACCESO DENEGADO, DEBE LLENAR AMBOS CAMPOS", hi, 1);
					user1.setText("");
					pass1.setText("");
				}
				else {
					//Caso contrario
					
					//Si el valor de los campos es igual a las cadenas de User y Pass
					// Son iguales concede Acceso
					if(valorPass.matches(SP) && valorUser.matches(SU)) {
					
						
						JOptionPane.showMessageDialog(null, "Bienvenido: \n"+valorUser, hi, 1);
						
						user1.setText("");
						pass1.setText("");
						
						user.setVisible(false);
					}
					//Si no muestra un mensaje de que no se encuentra registrado
					else {
						
						JOptionPane.showMessageDialog(null, "Lo sentimos el usuario: \n"+valorUser+"\nNo se encuentra registrado", hi, 1);
						
						user1.setText("");
						pass1.setText("");
						
					}
					
				}
			}
		});
		
		contenedor.add(user);
		contenedor.add(user1);
		contenedor.add(pass);
		contenedor.add(pass1);
		contenedor.add(ok);
		//contenedor.add(separador);
	}
	
	
	
}