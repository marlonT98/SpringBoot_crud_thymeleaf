package com.app.crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.app.crud.crud.repositorio.EstudienteRepositorio;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private EstudienteRepositorio respositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
/*
	Estudiante estudiante1 = new Estudiante("marlon","tarrillo","marlon@gmail");
		respositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("jose","cruz","jose@gmail");
		respositorio.save(estudiante2);

 */
	


	}

}
