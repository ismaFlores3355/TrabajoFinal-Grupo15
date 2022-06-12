package ar.edu.unju.fi.entity;

public class Provincia {

	private String provincia;

	public Provincia() {
		super();
	}

	public Provincia(String provincia) {
		super();
		this.provincia = provincia;
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Provincia [provincia=" + provincia + "]";
	}


}
