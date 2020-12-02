package com.piramide.clases;

import java.util.ArrayList;
import java.util.Date;

public class Profesor extends Persona {

    private ArrayList<Tarea> listaTareas;

    public Profesor(String email, String nombre) {
        super(email, nombre);
        listaTareas = new ArrayList<>();
    }

    public Tarea creaTarea(Estudiante estudiante){
        Tarea tarea = new Tarea(1, "Test", new Date());
        tarea.setEstudiante(estudiante);
        listaTareas.add(tarea);
        return tarea;
    }
}
