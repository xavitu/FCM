package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
//import model.CoordenadesVol;
//import model.carregaDades;

public class Linea extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private ArrayList<CoordenadesVol> arrayCoordenades;
	private Graphics g;
	//private carregaDades carrega;
	
	/*public Linea(ArrayList<CoordenadesVol> cV) {
		super();
		arrayCoordenades = cV;
	}
	public Linea(){
		arrayCoordenades = new ArrayList<CoordenadesVol>();
	}
	
	public void setCoordenades(ArrayList<CoordenadesVol> aVol){
		arrayCoordenades = aVol;
	}*/
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//System.out.println("Pintem x1 de controller" + x1);
		Graphics2D g2d = (Graphics2D) g;	
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.red);
		
		/*for (int i = 0; i < arrayCoordenades.size(); i++) {
			CoordenadesVol aux = arrayCoordenades.get(i);
			g2d.drawLine(aux.getX1(), aux.getX2(), aux.getY1(), aux.getY2());
		}*/
		Image img = null;
		//tenir un thread de la classe counterthread que vagi fent peticions del model dels avions
		//i repinti els avions el repaint desde el controlador a la vista dir les coordenades on s'ha de pintar
		//una funcio que agafa les dades del model i ho envia a la vista
		//tenir una funcio que recorri la arrayList de cada element i vagi agafant les coordenades
		try {
			img = ImageIO.read(new File("Avio1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}