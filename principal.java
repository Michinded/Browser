package menu;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class principal extends JFrame{

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
		//contenedor.add(separador);
		
	}
	
	public void Login(){
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
		ok.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent evento) {
			
				JOptionPane.showMessageDialog(null, "ACCESO DENEGADO", hi, 1);
				
			}
		});
		
		
		contenedor.add(user);
		contenedor.add(user1);
		contenedor.add(pass);
		contenedor.add(pass1);
		contenedor.add(ok);
	}
	
	
	
}