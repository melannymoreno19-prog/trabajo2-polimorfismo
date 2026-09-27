package com.ejemplo.construccion.modelo;

import java.util.List;

public class Abeja implements InterfaceGeneral {
    private String nombre;
    private List<Construccion> construcciones;

    public Abeja(String nombre, List<Construccion> construcciones) {
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
        return "La abeja " + nombre + " establece la cera base para " + construcciones.size() + " panales.";
    }

    @Override
    public String levantarParedes(List<Construccion> construcciones) {
        return "La abeja " + nombre + " moldea celdas hexagonales en " + construcciones.size() + " estructuras.";
    }

    @Override
    public String techar(List<Construccion> construcciones) {
        return "La abeja " + nombre + " sella con propóleo el techo de " + construcciones.size() + " celdillas.";
    }
}
