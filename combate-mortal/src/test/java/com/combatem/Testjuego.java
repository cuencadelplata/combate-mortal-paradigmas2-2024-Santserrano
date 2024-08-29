package com.combatem;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class Testjuego {

    @Test
    public void testSoldadoMuereConUnDisparo() {
        Soldado soldado = new Soldado();
        Tanque tanque = new Tanque();

        assertTrue(soldado.estaVivo());
        tanque.disparar(soldado);
        assertFalse(soldado.estaVivo());
    }

    @Test
    public void testTanqueRecibeDosDisparos() {
        Soldado soldado = new Soldado();
        Tanque tanque = new Tanque();

        assertTrue(tanque.estaVivo());
        soldado.disparar(tanque);
        assertTrue(tanque.estaVivo());
        soldado.disparar(tanque);
        assertFalse(tanque.estaVivo());
    }

    @Test
    public void testBuqueRecibeTresDisparos() {
        Tanque tanque = new Tanque();
        Buque buque = new Buque();

        assertTrue(buque.estaVivo());
        tanque.disparar(buque);
        assertTrue(buque.estaVivo());
        tanque.disparar(buque);
        assertTrue(buque.estaVivo());
        tanque.disparar(buque);
        assertFalse(buque.estaVivo());
    }

    @Test
    public void testEscudoReduceDanio() {
        Buque buqueConEscudo = new Buque();
        Tanque tanque = new Tanque();
        Escudo escudo = new Escudo(0.5);
        buqueConEscudo.agregarEscudo(escudo);

        tanque.disparar(buqueConEscudo);
        assertTrue(buqueConEscudo.estaVivo());
        tanque.disparar(buqueConEscudo);
        assertTrue(buqueConEscudo.estaVivo());
    }

    @Test
    public void testNorris() {
        Norris norris = new Norris();
        Tanque tanque = new Tanque();

        assertTrue(norris.estaVivo());
        tanque.disparar(norris);
        assertTrue(norris.estaVivo());
        tanque.disparar(norris);
        assertTrue(norris.estaVivo());
    }
}