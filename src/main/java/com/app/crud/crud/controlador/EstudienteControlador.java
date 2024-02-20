package com.app.crud.crud.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.crud.crud.servicio.EstudianteServicio;


@Controller
public class EstudienteControlador {

    @Autowired
    private EstudianteServicio servicio;


    @GetMapping({"/estudiantes", "/"})
    public String listarEstudientes(Model modelo){


        modelo.addAttribute("estudiantes",servicio.listarTodosEstudientes());

        return "estudiantes";//nos retorna al archivo estudientes

        
    }

    















}