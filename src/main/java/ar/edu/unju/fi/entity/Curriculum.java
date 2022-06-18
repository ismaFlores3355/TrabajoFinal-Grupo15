package ar.edu.unju.fi.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

public class Curriculum {

    @NotBlank(message = "El apellido no puede ser blanco")
    private String apellido;

    @NotEmpty(message = "El nombre no puede estar vacio")
    private String nombre;

    @Min(value = 1_000_000, message = "El dni debe ser mayor o igual a 1.000.000")
    private int dni;

    @NotBlank(message = "El domicilio no puede ser blanco")
    private String domicilio;

    @NotEmpty(message = "El contacto no puede estar vacio")
    private int contacto;

    private String experienciaLaboral;

    private String educacion;

    private String idioma;

    private String conocimientoInformatico;

    private String informacionComplementaria;

    private String datoAdicional;

    public Curriculum(){

    }

    public Curriculum(String apellido, String nombre, int dni, String domicilio, int contacto, String experienciaLaboral, String educacion, String idioma, String conocimientoInformatico, String informacionComplementaria, String datoAdicional) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.contacto = contacto;
        this.experienciaLaboral = experienciaLaboral;
        this.educacion = educacion;
        this.idioma = idioma;
        this.conocimientoInformatico = conocimientoInformatico;
        this.informacionComplementaria = informacionComplementaria;
        this.datoAdicional = datoAdicional;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getConocimientoInformatico() {
        return conocimientoInformatico;
    }

    public void setConocimientoInformatico(String conocimientoInformatico) {
        this.conocimientoInformatico = conocimientoInformatico;
    }

    public String getInformacionComplementaria() {
        return informacionComplementaria;
    }

    public void setInformacionComplementaria(String informacionComplementaria) {
        this.informacionComplementaria = informacionComplementaria;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                ", contacto=" + contacto +
                ", experienciaLaboral='" + experienciaLaboral + '\'' +
                ", educacion='" + educacion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", conocimientoInformatico='" + conocimientoInformatico + '\'' +
                ", informacionComplementaria='" + informacionComplementaria + '\'' +
                ", datoAdicional='" + datoAdicional + '\'' +
                '}';
    }
}
