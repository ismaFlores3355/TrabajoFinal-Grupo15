package ar.edu.unju.fi.ejercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ar.edu.unju.fi.controller","ar.edu.unju.fi.entity"})
public class TrabajoFinalPvGrupo15Application {

	public static void main(String[] args) {
		SpringApplication.run(TrabajoFinalPvGrupo15Application.class, args);
	}

}
