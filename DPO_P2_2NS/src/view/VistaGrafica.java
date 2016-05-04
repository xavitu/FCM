package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VistaGrafica extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton jbClose;
	
	/**public VistaGrafica(){
		crearVentana();//método que se encarga de crear la Ventana
	}
	 */
	public void crearVentana(){
		
		JPanelBackground jpPanel1 = new JPanelBackground();
		jpPanel1.setBackground("Imagenes/Img1.jpg");
		jpPanel1.setLayout(null);
		
		jbClose = new JButton("Tornar");
		jpPanel1.add(jbClose);
		jbClose.setBounds(750, 750, 80, 25);
		
		jbClose.setFocusable(false);
		this.getContentPane().add(jpPanel1);
		this.setSize(1610, 830);
		this.setTitle("Grafica vols");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	public void registerController(ActionListener controller){
		jbClose.addActionListener(controller);
		jbClose.setActionCommand("CLOSE");
	}	
}