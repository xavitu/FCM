package model;

import view.VistaGrafica;

public class MovimentAvions extends Thread{
	private boolean running;
	public int secs;
	private VistaGrafica grafica;
	private int x;
	private int y;

	public MovimentAvions(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		grafica = new VistaGrafica();
	}
	public void run(){
		running = true;
		calcuaMoviment();
	}

	public void calcuaMoviment(){
		while (running) {
			x=x+1;
			y=y+1;
			//grafica.afegeixAvio(x, y);
			//System.out.println("LA X: " + x +"LA Y:" + y);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
