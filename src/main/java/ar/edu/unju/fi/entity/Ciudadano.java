package ar.edu.unju.fi.entity;

import java.time.LocalDate;

public class Ciudadano {

	private int dni;
	private int nroTramite;
	private String email;
	private String estadoCivil;
	private Provincia provincia;
	private int telefono;
	private LocalDate fechaNacimiento;
	private String contraseña;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getNroTramite() {
		return nroTramite;
	}
	public void setNroTramite(int nroTramite) {
		this.nroTramite = nroTramite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Ciudadano [dni=" + dni + ", nroTramite=" + nroTramite + ", email=" + email + ", estadoCivil="
				+ estadoCivil + ", provincia=" + provincia + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", contraseña=" + contraseña + "]";
	}
	
}
