package model;

public class Avio {
	private String model;
	private int places;
	private int altura;
	
	public Avio(){}
	
	public Avio(String model, int places, int altura) {
		super();
		this.model = model;
		this.places = places;
		this.altura = altura;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
