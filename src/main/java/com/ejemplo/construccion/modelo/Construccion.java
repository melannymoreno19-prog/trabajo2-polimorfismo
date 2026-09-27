package com.ejemplo.construccion.modelo;

public class Construccion {
    private String tipo;
    private int duracionDias;
    private double costoEstimado;

    public Construccion(String tipo, int duracionDias, double costoEstimado) {
        this.tipo = tipo;
        this.duracionDias = duracionDias;
        this.costoEstimado = costoEstimado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    @Override
    public String toString() {
        return "Construccion{" +
                "tipo='" + tipo + ''' +
                ", duracionDias=" + duracionDias +
                ", costoEstimado=" + costoEstimado +
                '}';
    }
}
