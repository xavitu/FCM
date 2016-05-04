package controller;
	
import java.util.Scanner;
import com.db.utils.ConectorDB;

public class InserirVol {
	private String data;
	private String duracio;
	private String retard;
	private String estat;
	
	

	public InserirVol(ConectorDB conn, String data, String duracio, String retard, String estat){
		this.data = data;
		this.duracio = duracio;
		this.retard = retard;
		this.estat = estat;
		
		conn.insertQuery("INSERT INTO vol(data, duracio, retard, estat) VALUES ('" + this.data + "'," + this.duracio + "," + this.retard + ",'" + this.estat + "');");
	}
	


	
}
