package com.ejemplo.construccion.modelo;

import java.util.List;

public class Arquitecto implements InterfaceGeneral {
    private String nombre;
    private List<Construccion> construcciones;

    public Arquitecto(String nombre, List<Construccion> construcciones) {
        this.nombre = nombre;
        this.construcciones = construcciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Construccion> getListaConstrucciones() {
        return construcciones;
    }

    @Override
    public String cimientos(List<Construccion> construcciones) {
        return "El arquitecto " + nombre + " diseña cimientos para " + construcciones.size() + " proyectos.";
    }

    @Override
    public String levantarParedes(List<Construccion> construcciones) {
        return "El arquitecto " + nombre + " supervisa el levantamiento de paredes de " + construcciones.size() + " obras.";
    }

    @Override
    public String techar(List<Construccion> construcciones) {
        return "El arquitecto " + nombre + " especifica la cubierta para " + construcciones.size() + " techos.";
    }
}
