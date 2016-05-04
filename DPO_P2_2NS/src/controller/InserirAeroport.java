package controller;

import com.db.utils.*;

import model.ReadInfo;

public class InserirAeroport {
	private String nom;
	private String coords;


	public InserirAeroport(ConectorDB conn, String nom, String coords){

		this.nom = nom;
		this.coords = coords;

		conn.insertQuery("INSERT INTO aeroport (nom_aerop, coord) VALUES ('" + this.nom + "','" + this.coords + "')");


		
	}
	


	
}
