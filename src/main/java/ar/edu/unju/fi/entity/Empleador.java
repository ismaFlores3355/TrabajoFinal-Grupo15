package ar.edu.unju.fi.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Empleador {

	@NotBlank(message = "El cuit no puede estar vacio")
	private int cuit;

	@NotBlank(message = "La contraseña no puede ser nulo")
	private String contraseña;

	@NotNull(message = "La razon social no puede estar vacio")
	private String razonSocial;

	@NotNull(message = "El nombre comercial no puede estar vacio")
	private String nombreComercial;

	@NotNull(message = "El inicio de activad no puede estar vacio")
	private LocalDate inicioActividad;

	@Email @NotEmpty
	private String email;

	@NotEmpty(message = "El telefono no puede estar vacio")
	private int telefono;

	@NotBlank(message = "El domimilio no puede estar vacio")
	private String domicilio;

	private Provincia provincia;

	@NotNull
	private String paginaWeb;

	@NotNull
	private String descripcion;
	
	public Empleador() {
		
	}
	public Empleador(int cuit, String contraseña, String razonSocial, String nombreComercial, LocalDate inicioActividad,
			String email, int telefono, String domicilio, Provincia provincia, String paginaWeb, String descripcion) {
		super();
		this.cuit = cuit;
		this.contraseña = contraseña;
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.inicioActividad = inicioActividad;
		this.email = email;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.provincia = provincia;
		this.paginaWeb = paginaWeb;
		this.descripcion = descripcion;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public LocalDate getInicioActividad() {
		return inicioActividad;
	}

	public void setInicioActividad(LocalDate inicioActividad) {
		this.inicioActividad = inicioActividad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Empleador [cuit=" + cuit + ", contraseña=" + contraseña + ", razonSocial=" + razonSocial
				+ ", nombreComercial=" + nombreComercial + ", inicioActividad=" + inicioActividad + ", email=" + email
				+ ", telefono=" + telefono + ", domicilio=" + domicilio + ", provincia=" + provincia + ", paginaWeb="
				+ paginaWeb + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
