package com.app.crud.crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.crud.crud.entidad.Estudiante;

@Repository
public interface EstudienteRepositorio extends JpaRepository<Estudiante,Long>{



    

}
