package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CalculAngle;
import model.CounterThread;
import model.MovimentAvions;


public class VistaGrafica extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton jbClose;
	private JLabel jlNumAero;
	private JLabel jlPendents;
	private JLabel jlTranscurs;
	private JLabel jlFinals;
	private JLabel jlUsuaris;
	private JLabel jlVenuts;
	private JPanelBackground jpPanel1 = new JPanelBackground();
	public CounterThread threadTemps;
	public MovimentAvions threadMoviment; 
	
	/**public VistaGrafica(){
		crearVentana();//método que se encarga de crear la Ventana
	}
	 */
	public void crearVentana(){

		threadTemps = new CounterThread();
		threadMoviment = new MovimentAvions(0,0);

		jpPanel1.setBackground("Img1.jpg");
		jpPanel1.setLayout(null);

		jbClose = new JButton("Tornar");
		jpPanel1.add(jbClose);
		jbClose.setBounds(776, 750, 100, 25);

		jlNumAero = new JLabel("Numero de aeroports:   0");
		jpPanel1.add(jlNumAero);
		jlNumAero.setBounds(25, 600, 300, 25);

		jlPendents = new JLabel("Pendents:   0");
		jpPanel1.add(jlPendents);
		jlPendents.setBounds(25,625,300,25);

		jlFinals = new JLabel("Finalitzats:   0"); 
		jpPanel1.add(jlFinals);
		jlFinals.setBounds(25,650,300,25);

		jlTranscurs = new JLabel("Vols en transcurs:   0");
		jpPanel1.add(jlTranscurs);
		jlTranscurs.setBounds(25, 675, 300, 25);

		jlUsuaris= new JLabel("Usuaris:   0");
		jpPanel1.add(jlUsuaris);
		jlUsuaris.setBounds(25, 700, 300, 25);

		jlVenuts = new JLabel("Venuts:   0");
		jpPanel1.add(jlVenuts);
		jlVenuts.setBounds(25, 725, 300, 25);
		jbClose.setFocusable(false);

		//un metode q agafi un avio i el pinti
		int x1 = 0;
		int y1 = 0;		
		
		//Bucle per anar pintant avions en fincio del nombre de elements del array list on es guarden els avions
		
		afegeixAvio(x1 , y1);
		repaint();
		
		//threadTemps.start();
		//threadTemps.contaTemps();
		//threadMoviment.start();
		//threadMoviment.run();
		//threadMoviment.calcuaMoviment();
		
		calculaAngle(5, 5, 0, 5);
		
		this.getContentPane().add(jpPanel1);
		this.setSize(1610, 830);
		this.setTitle("Grafica vols");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//Funcio per moure el avio amb el thread
	}
	public void afegeixAvio(int x1, int y1){
		Grafico1 avio = new Grafico1(0);
		avio.setOpaque(false);
		jpPanel1.add(avio);
		avio.setBounds(0, 0,1604, 795);
		jpPanel1.setOpaque(false);
		repaint();
	}
	public void calculaAngle(int x1, int x2, int y1, int y2){//amb aixo s'ha de agafar el punt inicial en el que es pinta la linea
		//i despres asignar a cada valor perque formin dos vectors amb mateix origen i la linea pintada i calcular el angle per girar
		CalculAngle angle = new CalculAngle(x1, x2, y1, y2);
	}
	public void registerController(ActionListener controller){
		jbClose.addActionListener(controller);
		jbClose.setActionCommand("CLOSE");
	}
	public CounterThread getThreadTemps() {
		return threadTemps;
	}
	public void setThreadTemps(CounterThread threadTemps) {
		this.threadTemps = threadTemps;
	}
	public MovimentAvions getThreadMoviment() {
		return threadMoviment;
	}
	public void setThreadMoviment(MovimentAvions threadMoviment) {
		this.threadMoviment = threadMoviment;
	}
	
}