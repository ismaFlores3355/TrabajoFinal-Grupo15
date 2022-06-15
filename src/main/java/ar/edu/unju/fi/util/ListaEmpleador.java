package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.entity.Empleador;

public class ListaEmpleador {

	private ArrayList<Empleador> empleadores;
	
	public ListaEmpleador() {
		empleadores = new ArrayList<Empleador>();
	}

	public ArrayList<Empleador> getEmpleadores() {
		return empleadores;
	}

	public void setEmpleadores(ArrayList<Empleador> empleadores) {
		this.empleadores = empleadores;
	}
	
	
}
