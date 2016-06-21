package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import view.Lienzo;

public class Grafico1 extends JPanel{

	//posar atributs de les variables inicialitzades
	//fer el thread amb la draw image
	//setter de la informacio
	//fer una arrayList per guardar la informacio

	private static final long serialVersionUID = 1L;

	private Lienzo l;
	private double rotacion = 0.0;
	
	public Grafico1(double rotacion) {
		super();
		this.rotacion = rotacion;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		l = new Lienzo("Avio1.png", rotacion);
		Image img = null;
		//tenir un thread de la classe counterthread que vagi fent peticions del model dels avions
		//i repinti els avions el repaint desde el controlador a la vista dir les coordenades on s'ha de pintar
		//una funcio que agafa les dades del model i ho envia a la vista
		//tenir una funcio que recorri la arrayList de cada element i vagi agafant les coordenades
		try {
			img = ImageIO.read(new File("Avio1.png"));
			pintaAvions(g, img);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void pintaAvions(Graphics g, Image image){
		Graphics2D g2d = (Graphics2D) g;
		Image img = null;
		img = image;
		try {
			AffineTransform tx = AffineTransform.getRotateInstance(rotacion, img.getWidth(this)/2, img.getHeight(this)/2);
			g2d.drawImage(img, tx, this);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
