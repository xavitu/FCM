package model;

import com.db.utils.*;
import controller.ButtonControler;
import view.MainWindow;
import view.VistaGrafica;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				/*hollllllllllllllllaaaaa-asd-asd-asda-sda-s-dasd*/
				Config c = new Config();
				c = ReadInfo.carregaDades();
				ConectorDB conn = new ConectorDB("root", "", "fcm", 3306);
				conn.connect();
				
				MainWindow view = new MainWindow();
				VistaGrafica  grafica = new VistaGrafica();	
				grafica.crearVentana();
				grafica.setVisible(false);
				ButtonControler controller = new ButtonControler(view, grafica,conn);
				view.registerController(controller);
				grafica.registerController(controller);
				view.setVisible(true);
				/*CAnviiii*/
				conn.disconnect();
			}
		});	
	}

}
