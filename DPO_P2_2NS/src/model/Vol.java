package model;

public class Vol {
	private String sortida; 
	private String durada; 
	private String retard;
	private String estat;
	private String referencia;
	private String origen;
	private String desti;

	public Vol(String sortida, String durada, String retard, String estat, String referencia, String origen,
			String desti) {
		super();
		this.sortida = sortida;
		this.durada = durada;
		this.retard = retard;
		this.estat = estat;
		this.referencia = referencia;
		this.origen = origen;
		this.desti = desti;
	}

	public String getSortida() {
		return sortida;
	}

	public void setSortida(String sortida) {
		this.sortida = sortida;
	}

	public String getDurada() {
		return durada;
	}

	public void setDurada(String durada) {
		this.durada = durada;
	}

	public String getRetard() {
		return retard;
	}

	public void setRetard(String retard) {
		this.retard = retard;
	}

	public String getEstat() {
		return estat;
	}

	public void setEstat(String estat) {
		this.estat = estat;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}
	
}