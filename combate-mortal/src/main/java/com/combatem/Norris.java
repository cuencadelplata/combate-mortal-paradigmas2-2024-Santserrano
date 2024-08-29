package com.combatem;

public class Norris extends Unidad {
    public Norris() {
        super(99);
    }
    //anulamos con override la clase unidad para modificar daño y disparo 
    @Override
    public void recibirDisparo(double danio) {
        
    }

    @Override
    public void disparar(Unidad objetivo) {
        objetivo.vida = 0;
    }
}