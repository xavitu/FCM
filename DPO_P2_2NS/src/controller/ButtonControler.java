package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.db.utils.*;

import view.MainWindow;
import view.VistaGrafica;

public class ButtonControler implements ActionListener{

	private VistaGrafica grafica;
	private MainWindow view;
	private ConectorDB conn;
	
	
	public ButtonControler(MainWindow view, VistaGrafica grafica, ConectorDB conn) {
		super();
		this.view = view;
		this.grafica = grafica;
		this.conn = conn;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("AFEGIRAEROPORT")){
			String nom = view.typedNomAeroport();
			String coords = view.typedCoordenades();
			
			InserirAeroport ia = new InserirAeroport(conn,nom,coords);
		}
		
		if(event.getActionCommand().equals("AFEGIRVOL")){
			String sortida = view.typedSortida();
			String durada = view.typedDurada();
			String retard = view.typedRetard();
			String estat = view.typedEstat();
			String referencia = view.typedReferencia();
			String origen = view.typedOrigen();
			String desti = view.typedDesti();
			
			InserirVol iv = new InserirVol(conn,sortida, durada, retard, estat);
		}
		
		if(event.getActionCommand().equals("AFEGIRAVIO")){
			String model =  view.typedModel();
			String capacitat = view.typedPlaces();
			String altura = view.typedAltura();
			
			InserirAvio iav = new InserirAvio (conn,model,capacitat,altura);
	
		}
		
		if(event.getActionCommand().equals("VIS") ){
			grafica.setVisible(true);
		}
		if (event.getActionCommand().equals("CLOSE")){
			grafica.setVisible(false);
		}
	}
	
}
