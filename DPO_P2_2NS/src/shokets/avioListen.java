package shokets;

import java.io.*;
import java.net.*;

public class avioListen {
	
	public void initServer(){
		ServerSocket mi_servicio = null;
		String linea_recibida;
		DataInputStream entrada;
		PrintStream salida;
		Socket socket_conectado = null;
		
	try {
		mi_servicio = new ServerSocket(2017);
		}
		catch (IOException excepcion) {
		System.out.println(excepcion);
		}
		try {
		socket_conectado = mi_servicio.accept();
		entrada = new DataInputStream(socket_conectado.getInputStream());
		salida = new PrintStream(socket_conectado.getOutputStream());
		linea_recibida = entrada.readLine();
		salida.println("Te reenvio lo que he recibido: " + linea_recibida );
		salida.close();
		entrada.close();
		socket_conectado.close();
		}
		catch (IOException excepcion) {
		System.out.println(excepcion);
		}}
}
