package model;

import com.db.utils.*;
import controller.ButtonControler;
import view.MainWindow;
import view.VistaGrafica;
import shokets.*;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				clientListen cl = new clientListen();
				cl.initServer();
				/*
				Config c = new Config();
				c = ReadInfo.carregaDades();
				ConectorDB conn = new ConectorDB("root", "", "fcm", 3306);
				conn.connect();
				ArrayList<Object[]> infoaeroports = ReadInfo.ompleInfoAeroports(conn);
				ArrayList<Object[]> infovols = ReadInfo.ompleInfoVols(conn);
				ArrayList<Object[]> infoavions = ReadInfo.ompleInfoAvions(conn);
				
				MainWindow view = new MainWindow(infoaeroports,infovols,infoavions);
				VistaGrafica  grafica = new VistaGrafica();	
				
				grafica.crearVentana();
				grafica.setVisible(false);
				ButtonControler controller = new ButtonControler(view, grafica,conn);
				view.registerController(controller);
				grafica.registerController(controller);
				view.setVisible(true);
				 */
			}
		});	
	}

}
