package controller;
	
import java.util.Scanner;
import com.db.utils.ConectorDB;

public class InserirVol {
	private String data;
	private String duracio;
	private String retard;
	private String estat;
	private String origen;
	private String desti;
	
	

	public InserirVol(ConectorDB conn, String data, String duracio, String retard, String estat,String origen, String deesti){
		this.data = data;
		this.duracio = duracio;
		this.retard = retard;
		this.estat = estat;
		
		conn.insertQuery("INSERT INTO vol(data, duracio, retard, estat,aeroportOrigen,aeroportDesti) VALUES "+ 
				"('"   +  this.data     + 
				 "','" +  this.duracio  + 
				 "','" +  this.retard   + 
				 "','" +  this.estat    + 
				 "','" +  this.origen   + 
				 "','" + this.desti     + 
				 "');");
	}
	


	
}
