package com.piramide.clases;

import java.util.Date;

public class Ayuda {

    private String mensaje;
    private Date fechaCreacion, fechaResolucion;

    public Ayuda(String mensaje, Date fechaCreacion, Date fechaResolucion) {
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.fechaResolucion = fechaResolucion;
    }
}
