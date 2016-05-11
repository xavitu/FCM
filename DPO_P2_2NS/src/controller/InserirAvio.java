package controller;

import java.util.Scanner;
import com.db.utils.ConectorDB;

public class InserirAvio {
	private String model;
	private String capacitat;
	private String altura_max;
	
	

	public InserirAvio(ConectorDB conn,String model,String capacitat, String altura_max){
		this.model = model;
		this.capacitat = capacitat;
		this.altura_max = altura_max;
		conn.insertQuery("INSERT INTO avio (model, capacitat, altura_max) VALUES ('" + this.model + "','" + this.capacitat + "','" + this.altura_max + "');");
		
	}
	


	
}
