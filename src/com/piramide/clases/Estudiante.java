package com.piramide.clases;

import java.util.Date;

public class Estudiante extends Persona{


    public Estudiante(String email, String nombre) {
        super(email, nombre);
    }

    public void hacer(Tarea tarea){

    }

    public void solicitaAyuda(Tarea tarea){
        Ayuda ayuda = new Ayuda("SOS urgente",new Date(),null);
        tarea.registraAyuda(ayuda);
    }
}
