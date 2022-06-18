package ar.edu.unju.fi.entity;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;
import java.util.ArrayList;

public class Oferta {

	private int vacante;
	private String puestoRequerido;
	private String resumenPuesto;
	private String disponibilidadhoraria;
	private String principalTarea;
	private int datoContato;
	private String jornada;
	private String requisito;
	private double salario;
	private String beneficio;
	private boolean disponible;

	public Oferta() {
	}

	public Oferta(int vacante, String puestoRequerido, String resumenPuesto, String disponibilidadhoraria, String principalTarea, int datoContato, String jornada, String requisito, double salario, String beneficio, boolean disponible) {
		this.vacante = vacante;
		this.puestoRequerido = puestoRequerido;
		this.resumenPuesto = resumenPuesto;
		this.disponibilidadhoraria = disponibilidadhoraria;
		this.principalTarea = principalTarea;
		this.datoContato = datoContato;
		this.jornada = jornada;
		this.requisito = requisito;
		this.salario = salario;
		this.beneficio = beneficio;
		this.disponible = disponible;
	}

	public int getVacante() {
		return vacante;
	}

	public void setVacante(int vacante) {
		this.vacante = vacante;
	}

	public String getPuestoRequerido() {
		return puestoRequerido;
	}

	public void setPuestoRequerido(String puestoRequerido) {
		this.puestoRequerido = puestoRequerido;
	}

	public String getResumenPuesto() {
		return resumenPuesto;
	}

	public void setResumenPuesto(String resumenPuesto) {
		this.resumenPuesto = resumenPuesto;
	}

	public String getDisponibilidadhoraria() {
		return disponibilidadhoraria;
	}

	public void setDisponibilidadhoraria(String disponibilidadhoraria) {
		this.disponibilidadhoraria = disponibilidadhoraria;
	}

	public String getPrincipalTarea() {
		return principalTarea;
	}

	public void setPrincipalTarea(String principalTarea) {
		this.principalTarea = principalTarea;
	}

	public int getDatoContato() {
		return datoContato;
	}

	public void setDatoContato(int datoContato) {
		this.datoContato = datoContato;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getRequisito() {
		return requisito;
	}

	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Oferta{" +
				"vacante=" + vacante +
				", puestoRequerido='" + puestoRequerido + '\'' +
				", resumenPuesto='" + resumenPuesto + '\'' +
				", disponibilidadhoraria='" + disponibilidadhoraria + '\'' +
				", principalTarea='" + principalTarea + '\'' +
				", datoContato=" + datoContato +
				", jornada='" + jornada + '\'' +
				", requisito='" + requisito + '\'' +
				", salario=" + salario +
				", beneficio='" + beneficio + '\'' +
				", disponible=" + disponible +
				'}';
	}
}
