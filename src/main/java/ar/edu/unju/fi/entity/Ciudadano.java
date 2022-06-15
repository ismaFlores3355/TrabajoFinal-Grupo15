package ar.edu.unju.fi.entity;

import org.apache.tomcat.jni.Local;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Ciudadano {

	@Min(value=1_000_000, message = "El dni debe ser mayor o igual a 1.000.000")
	private int dni;

	@NotBlank(message = "En nro de tramite no puede estar vacio")
	private int nroTramite;

	@Email @NotEmpty
	private String email;

	@NotEmpty(message = "El estado civil no puede estar vacio")
	private String estadoCivil;

	@NotEmpty(message = "La provincia no estar vacia")
	private Provincia provincia;

	@NotEmpty(message = "El telefono no puede estar vacio")
	private int telefono;

	@NotBlank @Past(message = "La fecha debe ser anterior a la fecha actual")
	private LocalDate fechaNacimiento;

	@NotBlank(message = "La contraseña no puede estar vacia")
	private String contraseña;

	public Ciudadano(){

	}

	public Ciudadano(int dni, int nroTramite, String email, String estadoCivil, Provincia provincia, int telefono, LocalDate fechaNacimiento,String contraseña){
			this.dni=dni;
			this.nroTramite=nroTramite;
			this.email=email;
			this.estadoCivil=estadoCivil;
			this.provincia=provincia;
			this.telefono=telefono;
			this.fechaNacimiento=fechaNacimiento;
			this.contraseña=contraseña;
	}

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
