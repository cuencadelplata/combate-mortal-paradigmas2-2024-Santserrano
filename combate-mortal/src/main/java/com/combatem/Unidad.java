package com.combatem;

public abstract class Unidad {
    protected double vida;
    protected Escudo escudo;

    public Unidad(double vida) {
        this.vida = vida;
        this.escudo = null;
    }

    public void disparar(Unidad objetivo) {
        objetivo.recibirDisparo(1);
    }

    public void recibirDisparo(double danio) {
        if (escudo != null) {
            danio = escudo.modificarDanio(danio);
        }
        vida -= danio;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void agregarEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
}
