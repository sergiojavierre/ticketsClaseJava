package com.piramide.clases;

import java.util.ArrayList;
import java.util.Date;

public class Tarea {
    private Integer id;
    private String nombre;
    private Date plazo;
    private Estudiante estudiante;
    private Integer nota;
    private ArrayList<Ayuda> ayudas;

    public Tarea(Integer id, String nombre, Date plazo) {
        this.id = id;
        this.nombre = nombre;
        this.plazo = plazo;
        this.ayudas = new ArrayList<>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void registraAyuda(Ayuda ayuda){
        this.ayudas.add(ayuda);
    }
}
