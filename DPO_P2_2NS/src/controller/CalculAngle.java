package controller;

import java.lang.Math;
 
public class CalculAngle {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private double angle = 0.0;
	
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public CalculAngle(int x1, int x2, int y1, int y2) {
	
		super();
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
		angle = ((this.x1*this.y1)+(this.x2*this.y2))/(Math.sqrt(this.x1*this.x1+this.y1*this.y1)*Math.sqrt(this.x2*this.x2+this.y2*this.y2));
		angle = Math.asin(angle)*180/3.1416;
		angle = Math.ceil(angle);
		//System.out.println("EL ANGULO FORMADO POR LOS 2 VECTORES ES--> "+ angle);
		
	}

}
