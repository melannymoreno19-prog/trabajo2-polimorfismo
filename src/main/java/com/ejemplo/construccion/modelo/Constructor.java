package com.ejemplo.construccion.modelo;

import java.util.List;

public class Constructor implements InterfaceGeneral {
    private String nombre;
    private List<Construccion> construcciones;

    public Constructor(String nombre, List<Construccion> construcciones) {
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
        return "El constructor " + nombre + " vierte el concreto en los cimientos de " + construcciones.size() + " sitios.";
    }

    @Override
    public String levantarParedes(List<Construccion> construcciones) {
        return "El constructor " + nombre + " pega ladrillos para " + construcciones.size() + " muros.";
    }

    @Override
    public String techar(List<Construccion> construcciones) {
        return "El constructor " + nombre + " coloca las tejas en " + construcciones.size() + " viviendas.";
    }
}
