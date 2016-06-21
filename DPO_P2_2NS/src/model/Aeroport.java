package model;

public class Aeroport {
	private String nAeroport;
	private String coordenades;
	public Aeroport(String nAeroport, String coordenades) {
		super();
		this.nAeroport = nAeroport;
		this.coordenades = coordenades;
	}
	public String getnAeroport() {
		return nAeroport;
	}
	public void setnAeroport(String nAeroport) {
		this.nAeroport = nAeroport;
	}
	public String getCoordenades() {
		return coordenades;
	}
	public void setCoordenades(String coordenades) {
		this.coordenades = coordenades;
	}
	
	
}
