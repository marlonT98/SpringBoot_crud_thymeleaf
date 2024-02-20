package com.app.crud.crud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.crud.entidad.Estudiante;
import com.app.crud.crud.repositorio.EstudienteRepositorio;

@Service
public class EstudienteServicioImpl implements EstudianteServicio {


    @Autowired
    private EstudienteRepositorio repositorio;


    @Override
    public List<Estudiante> listarTodosEstudientes() {
      
        return repositorio.findAll();

    }




    
}
