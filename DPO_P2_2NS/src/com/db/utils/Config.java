package com.db.utils;

public class Config {
	
	private int port;
	private String ip;
	private String nombbdd;
	private String user;
	private String password;
	private int portAvio;
	private int portClient;
	
	
	
	public Config() {
		super();
	}

	public Config(int port, String ip, String nombbdd, String user, String password, int portAvio, int portClient) {
		super();
		this.port = port;
		this.ip = ip;
		this.nombbdd = nombbdd;
		this.user = user;
		this.password = password;
		this.portAvio = portAvio;
		this.portClient = portClient;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNombbdd() {
		return nombbdd;
	}

	public void setNombbdd(String nombbdd) {
		this.nombbdd = nombbdd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPortAvio() {
		return portAvio;
	}

	public void setPortAvio(int portAvio) {
		this.portAvio = portAvio;
	}

	public int getPortClient() {
		return portClient;
	}

	public void setPortClient(int portClient) {
		this.portClient = portClient;
	}
	
	public String convert(){
		/**
		 * Converteix un string al format json
		 */
		String jsonstring;
		jsonstring = "{"+"\n"+ "\"configuration\"" + ": " +"{"+ "\n" +"\"port\"" + ":" + "\""+ this.port +"\""+","+ "\n" + "\"ip\"" + ":" + this.ip + "," +"\n"+ "\"nombbdd\"" +":"+ this.nombbdd+ "\n" + "\"user\"" + ":" + this.user + "," + "\n" + "\"password\"" + ":" + this.password + "," +"\n" + "\"portAvio\"" + ":" + this.portAvio + "," +"\n" + "\"portClient\"" + ":" + this.portClient +"\n" + "}" + "\n" + "}";

		return jsonstring;   
	}
	
	

}
