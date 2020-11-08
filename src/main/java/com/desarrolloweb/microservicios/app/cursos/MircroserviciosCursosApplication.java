package com.desarrolloweb.microservicios.app.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.desarrolloweb.microservicios.app.cursos.commons.alumnos.models.entity",
	"com.desarrolloweb.microservicios.app.cursos.models.entity"})
public class MircroserviciosCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircroserviciosCursosApplication.class, args);
	}

}
