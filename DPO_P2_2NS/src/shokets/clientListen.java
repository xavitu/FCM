package shokets;

import java.io.*;
import java.net.*;

public class clientListen {

	final int PUERTO=5000;
	ServerSocket sc;
	Socket so;
	DataOutputStream salida;
	String mensajeRecibido;

	//SERVIDOR

	public void initServer(){

	BufferedReader entrada;

	try{
		
		sc = new ServerSocket(PUERTO );/* crea socket servidor que escuchara en puerto 5000*/
		so=new Socket();
		System.out.println("Esperando una conexi�n:");
		so = sc.accept();
		System.out.println("Un cliente se ha conectado.");
		entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
		entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
		System.out.println("Confirmando conexion al cliente....");
		salida.writeUTF("Conexi�n exitosa...n envia un mensaje :D");
		mensajeRecibido = entrada.readLine();
		System.out.println(mensajeRecibido);
		salida.writeUTF("Gracias por conectarte, adios!");
		System.out.println("Cerrando conexi�n...");
		sc.close();//Aqui se cierra la conexi�n con el cliente
	}catch(Exception e ){
		System.out.println("Error: "+e.getMessage());

	}
	}
}
