package com.combatem;

public class Escudo {
    //final para asignar
    private final double porcentajeProteccion; 

    public Escudo(double porcentajeProteccion) {
        this.porcentajeProteccion = porcentajeProteccion;
    }

    public double modificarDanio(double danio) {
        return danio * (1 - porcentajeProteccion);
    }
}
