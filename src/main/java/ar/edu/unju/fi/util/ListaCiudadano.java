package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.entity.Ciudadano;

public class ListaCiudadano {

	private ArrayList<Ciudadano> ciudadanos;

	public ListaCiudadano() {
		
		ciudadanos = new ArrayList<Ciudadano>();
	}

	public ArrayList<Ciudadano> getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(ArrayList<Ciudadano> ciudadanos) {
		this.ciudadanos = ciudadanos;
	}
	
	
}
