package com.app.crud.crud.servicio;

import java.util.List;

import com.app.crud.crud.entidad.Estudiante;

public interface EstudianteServicio {

   public List<Estudiante> listarTodosEstudientes();

   public Estudiante guardarEstudiante(Estudiante estudiante);

   public Estudiante obtenerEstudiantePorId(Long id);

   public Estudiante actualizarEstudiante(Estudiante estudiante);

   public void eliminarEstudiante(Long id );

}
