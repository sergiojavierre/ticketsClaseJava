package com.piramide;

import com.piramide.clases.Ayuda;
import com.piramide.clases.Estudiante;
import com.piramide.clases.Profesor;
import com.piramide.clases.Tarea;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("sergio.javierre@fppiramide.com","sergio");
        Estudiante estudiante = new Estudiante("jorge@fppiramide.com","jorge");

        Tarea tarea1 = profesor.creaTarea(estudiante);
        estudiante.solicitaAyuda(tarea1);
    }
}
