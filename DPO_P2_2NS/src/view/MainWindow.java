package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import com.db.utils.*;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Declaracio del variables
	 */

	private JTextField jtfNomAeroport;
	private JLabel jlNomAeroport;

	private JTextField jtfCoordenades;
	private JLabel jlCoordenades;

	private JTextField jtfModelAvio;
	private JLabel jlModelAvio;

	private JTextField jtfPlaces;
	private JLabel jlPlaces;

	private JTextField jtfAltura;
	private JLabel jlAltura;

	private JButton jbAfegirAeroport;
	private JButton jbAfegirVol;
	private JButton jbAfegirAvio;
	

	private JLabel jlDataSortida;
	private JTextField jtfDataSortida;

	private JLabel jlDuracio;
	private JTextField jtfDuracio;

	private JLabel jlRetard;
	private JTextField jtfRetard;

	private JLabel jlEstat;
	private JTextField jtfEstat;

	private JLabel jlIcao;
	private JTextField jtfIcao;

	private JLabel jlOrigen;
	private JTextField jtfOrigen;

	private JLabel jlDesti;
	private JTextField jtfDesti;
	
	private JButton jbVisualitzar;
	
	
	public MainWindow (Object[] info){
		

		JTabbedPane visualAereo = new JTabbedPane();
		JTabbedPane informacio = new JTabbedPane();
		setResizable(false);
		
		/* CANVI JTABLE*/
		TableModel modelo = new TableModel();
		modelo.addColumn("Identificador");
		modelo.addColumn("Nom aeroport");
		modelo.addColumn("Coordenades");
		modelo.addRow(info);
		//modelo.addRow(new Object[] {"1","2","3"});
		//modelo.addRow(new Object[] {"1","2","3"});
		JTable table = new JTable (modelo);
		table.getTableHeader().setReorderingAllowed(false);
		/*CANVI JTABLE*/
		
		JScrollPane scrollPane1 = new JScrollPane(table);
		table.setFillsViewportHeight(true);

		informacio.addTab("Aeroports", scrollPane1);

		String[] columNames2 = {"Identificador","Data sortida", "Duracio trajecte",
				"Retard", "Estat vol", "Origen", "Desti"	
		};

		Object[][] data2 ={
		};
		TableModel modelo2 = new TableModel();
		modelo2.addColumn("Identificador");
		modelo2.addColumn("Data sortida");
		modelo2.addColumn("Duracio trajecte");
		modelo2.addColumn("Retard");
		modelo2.addColumn("Estat vol");
		modelo2.addColumn("Origen");
		modelo2.addColumn("Desti");
		modelo2.addRow(new Object[] {"1","2","3","4","5","6","7"});
		modelo2.addRow(new Object[] {"1","2","3","4","5","6","7"});
		modelo2.addRow(new Object[] {"1","2","3","4","5","6","7"});
		JTable table2 = new JTable(modelo2);
		table2.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollPane2 = new JScrollPane(table2);
		informacio.addTab("Vols", scrollPane2);		
		table2.setFillsViewportHeight(true);

		String[] columNames3 = {"Identificador", "Model avio", "Nombre places", "Altura de creuer"
		};

		Object[][] data3 ={
		};

		TableModel modelo3 = new TableModel();
		modelo3.addColumn("Identificador");
		modelo3.addColumn("Model avio");
		modelo3.addColumn("Nombre places");
		modelo3.addColumn("Altura de creuer");
		modelo3.addRow(new Object[] {"1","2","3","4"});
		modelo3.addRow(new Object[] {"1","2","3","4"});
		modelo3.addRow(new Object[] {"1","2","3","4"});
		JTable table3 = new JTable(modelo3);
		table3.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollPane3 = new JScrollPane(table3);
		informacio.addTab("Avions", scrollPane3);		
		table3.setFillsViewportHeight(true);

		informacio.addTab("Avions", scrollPane3);
		visualAereo.addTab("Informacio", informacio);

		JTabbedPane gestio = new JTabbedPane();
		JPanel jpAfegirAeroport = new JPanel();
		jpAfegirAeroport.setLayout(new GridLayout(3, 1));

		JPanel jpSub2 = new JPanel();
		jpSub2.setLayout(new BorderLayout());
		jlNomAeroport = new JLabel("Nom Aeroport");/*AEROPORT INSERIR*/
		jtfNomAeroport = new JTextField(); 
		jtfNomAeroport.setPreferredSize(new Dimension(450, 10));
		jpSub2.add(jlNomAeroport, BorderLayout.LINE_START);
		jpSub2.add(jtfNomAeroport, BorderLayout.LINE_END);
		jpAfegirAeroport.add(jpSub2);

		JPanel jpSub3 = new JPanel();
		jpSub3.setLayout(new BorderLayout());
		jlCoordenades = new JLabel("Coordenades");/*COORDENADES INSERIR*/
		jtfCoordenades = new JTextField();
		jtfCoordenades.setPreferredSize(new Dimension(450, 10));
		jpSub3.add(jlCoordenades, BorderLayout.LINE_START);
		jpSub3.add(jtfCoordenades, BorderLayout.LINE_END);
		jpAfegirAeroport.add(jpSub3);

		JPanel jpSub4 = new JPanel();
		jpSub4.setLayout(new BorderLayout());
		jbAfegirAeroport = new JButton("Afegir"); /*AFEGIR AEROPORTS*/
		jpSub4.add(jbAfegirAeroport, BorderLayout.LINE_END);
		jpAfegirAeroport.add(jpSub4);

		JPanel jpPanel3 = new JPanel();
		jpPanel3.setLayout(new BorderLayout());
		jpPanel3.add(jpAfegirAeroport, BorderLayout.NORTH);

		gestio.addTab("Aeroports", jpPanel3);
		//mig layout

		JPanel jpAfegirVol = new JPanel();
		jpAfegirVol.setLayout(new GridLayout(8, 1));

		JPanel jpSub5 = new JPanel();
		jpSub5.setLayout(new BorderLayout());
		jlDataSortida = new JLabel("Sortida");
		jtfDataSortida = new JTextField();
		jtfDataSortida.setPreferredSize(new Dimension(500, 10));
		jpSub5.add(jlDataSortida, BorderLayout.LINE_START);
		jpSub5.add(jtfDataSortida, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub5);

		JPanel jpSub6 = new JPanel();
		jpSub6.setLayout(new BorderLayout());
		jlDuracio= new JLabel("Durada");
		jtfDuracio = new JTextField();
		jtfDuracio.setPreferredSize(new Dimension(500, 10));
		jpSub6.add(jlDuracio, BorderLayout.LINE_START);
		jpSub6.add(jtfDuracio, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub6);

		JPanel jpSub7 = new JPanel();
		jpSub7.setLayout(new BorderLayout());
		jlRetard = new JLabel("Retard");
		jtfRetard = new JTextField();
		jtfRetard.setPreferredSize(new Dimension(500, 10));
		jpSub7.add(jlRetard, BorderLayout.LINE_START);
		jpSub7.add(jtfRetard, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub7);

		JPanel jpSub8 = new JPanel();
		jpSub8.setLayout(new BorderLayout());
		jlEstat = new JLabel("Estat");
		jtfEstat = new JTextField();
		jtfEstat.setPreferredSize(new Dimension(500, 10));
		jpSub8.add(jlEstat, BorderLayout.LINE_START);
		jpSub8.add(jtfEstat, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub8);

		JPanel jpSub9 = new JPanel();
		jpSub9.setLayout(new BorderLayout());
		jlIcao = new JLabel("Referencia");
		jtfIcao = new JTextField();
		jtfIcao.setPreferredSize(new Dimension(500, 10));
		jpSub9.add(jlIcao, BorderLayout.LINE_START);
		jpSub9.add(jtfIcao, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub9);

		JPanel jpSub10 = new JPanel();
		jpSub10.setLayout(new BorderLayout());
		jlOrigen = new JLabel("Origen");
		jtfOrigen = new JTextField();
		jtfOrigen.setPreferredSize(new Dimension(500, 10));
		jpSub10.add(jlOrigen, BorderLayout.LINE_START);
		jpSub10.add(jtfOrigen, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub10);

		JPanel jpSub11 = new JPanel();
		jpSub11.setLayout(new BorderLayout());
		jlDesti = new JLabel("Desti");
		jtfDesti = new JTextField();
		jtfDesti.setPreferredSize(new Dimension(500, 10));
		jpSub11.add(jlDesti, BorderLayout.LINE_START);
		jpSub11.add(jtfDesti, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub11);		

		JPanel jpSub12 = new JPanel();
		jpSub12.setLayout(new BorderLayout());
		jbAfegirVol = new JButton("Afegir"); /*BOTO AFEGIR VOL */
		jpSub12.add(jbAfegirVol, BorderLayout.LINE_END);
		jpAfegirVol.add(jpSub12);

		JPanel jpPanel4 = new JPanel();
		jpPanel4.setLayout(new BorderLayout());
		jpPanel4.add(jpAfegirVol, BorderLayout.NORTH);

		gestio.addTab("Vols", jpPanel4);

		JPanel jpAfegirAvio = new JPanel();
		jpAfegirAvio.setLayout(new GridLayout(4, 1));

		JPanel jpSub13 = new JPanel();
		jpSub13.setLayout(new BorderLayout());
		jlModelAvio= new JLabel("Model");
		jtfModelAvio = new JTextField();
		jtfModelAvio.setPreferredSize(new Dimension(500, 10));
		jpSub13.add(jlModelAvio, BorderLayout.LINE_START);
		jpSub13.add(jtfModelAvio, BorderLayout.LINE_END);
		jpAfegirAvio.add(jpSub13);

		JPanel jpSub14 = new JPanel();
		jpSub14.setLayout(new BorderLayout());
		jlPlaces = new JLabel("Places");
		jtfPlaces = new JTextField();
		jtfPlaces.setPreferredSize(new Dimension(500, 10));
		jpSub14.add(jlPlaces, BorderLayout.LINE_START);
		jpSub14.add(jtfPlaces, BorderLayout.LINE_END);
		jpAfegirAvio.add(jpSub14);

		JPanel jpSub15 = new JPanel();
		jpSub15.setLayout(new BorderLayout());
		jlAltura = new JLabel("Altura");
		jtfAltura = new JTextField();
		jtfAltura.setPreferredSize(new Dimension(500, 10));
		jpSub15.add(jlAltura, BorderLayout.LINE_START);
		jpSub15.add(jtfAltura, BorderLayout.LINE_END);
		jpAfegirAvio.add(jpSub15);

		JPanel jpSub16 = new JPanel();
		jpSub16.setLayout(new BorderLayout());
		jbAfegirAvio = new JButton("Afegir");/*BOTO AFEGIR VOL - AVIO*/
		jpSub16.add(jbAfegirAvio, BorderLayout.LINE_END);
		jpAfegirAvio.add(jpSub16);

		JPanel jpPanel5 = new JPanel();
		jpPanel5.setLayout(new BorderLayout());
		jpPanel5.add(jpAfegirAvio, BorderLayout.NORTH);

		gestio.addTab("Avions", jpPanel5);
		visualAereo.addTab("Gestio", gestio);

		JPanel jpVisual = new JPanel(new GridLayout(1, 1));

		JPanel jpSub17 = new JPanel();
		jpSub17.setLayout(new BorderLayout());
		jbVisualitzar = new JButton("Visualitzar els vols en curs");
		jpSub17.add(jbVisualitzar, BorderLayout.CENTER);
		jpVisual.add(jpSub17);
		jbAfegirAeroport.setFocusable(false);
		jbVisualitzar.setFocusable(false);
		
		visualAereo.addTab("Visualitzacio", jpVisual);

		this.getContentPane().add(visualAereo);
		this.setSize(600,315);
		this.setTitle("Project Flight Centralization Manager");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	


	public void registerController(ActionListener controller){
		jbAfegirAeroport.addActionListener(controller);
		jbAfegirAeroport.setActionCommand("AFEGIRAEROPORT");
		
		jbAfegirVol.addActionListener(controller);
		jbAfegirVol.setActionCommand("AFEGIRVOL");
		
		jbAfegirAvio.addActionListener(controller);
		jbAfegirAvio.setActionCommand("AFEGIRAVIO");
		
		jbVisualitzar.addActionListener(controller);
		jbVisualitzar.setActionCommand("VIS");
		
	}
	public String typedNomAeroport(){
		return jtfNomAeroport.getText();
	}
	public String typedCoordenades() {
		return jtfCoordenades.getText();
	}
	public String typedSortida() {
		return jtfDataSortida.getText();
	}
	public String typedDurada() {
		return jtfDuracio.getText();
	}
	public String typedRetard() {
		return jtfRetard.getText();
	}
	public String typedEstat() {
		return jtfEstat.getText();
	}
	public String typedReferencia() {
		return jtfIcao.getText();
	}
	public String typedOrigen() {
		return jtfOrigen.getText();
	}
	public String typedDesti() {
		return jtfDesti.getText();
	}
	public String typedModel() {
		return jtfModelAvio.getText();
	}
	public String typedPlaces() {
		return jtfPlaces.getText();
	}
	public String typedAltura() {
		return jtfAltura.getText();
	}

}
