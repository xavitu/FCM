package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class CounterThread extends Thread{
	private boolean running;
	public int secs;
	private int time = 0;
	private int x1;
	private int y1;


	public void run(){
		running = true;
		contaTemps();
	}
	
	public void contaTemps() {
		// TODO Auto-generated method stub
		while(running){	
			secs++;	
			calculaHora();
			System.out.println("Temps passat = " + secs);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void calculaHora(){
		Date now = new Date(System.currentTimeMillis());
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");

		//System.out.println(date.format(now));
		System.out.println("Hora: " + hour.format(now));
	
	}
	public int calculaVelocitat(){
		int velocitat = 0;
		SimpleDateFormat hour = new SimpleDateFormat(null);
		//velocitat = calculaDistancia() / (getArribada - hour);
		return velocitat;
	}
	
	public void setSecs(int secs) {
		this.secs = secs;
	}
	public int getSecs(){
		return secs;
	}
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int setX1(int x1) {
		this.x1 = x1 + 1;
		return x1;
	}
	public int setY1(int y1) {
		this.y1 = y1 + 1;
		return y1 + 1;
	}
	
	


}
