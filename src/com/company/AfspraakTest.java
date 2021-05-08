package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class AfspraakTest {
    @Test
    //condition coverage
    public void testAfspraakMaken() {
        Afspraak afspraak1 = new Afspraak(true, false);
        Afspraak afspraak2 = new Afspraak(false, true);
        assertFalse(afspraak1.kanAfspraakMaken());
        assertFalse(afspraak2.kanAfspraakMaken());

    }

    @Test
    //decision coverage
    public void testAfspraakMaken2() {
        Afspraak afspraak1 = new Afspraak(false, true);
        Afspraak afspraak2 = new Afspraak(true, true);
        assertFalse(afspraak1.kanAfspraakMaken());
        assertTrue(afspraak2.kanAfspraakMaken());


    }

    @Test
    //condition/decision coverage
    public void testAfspraakMaken3() {
        Afspraak afspraak1 = new Afspraak(false, false);
        Afspraak afspraak2 = new Afspraak(true, true);
        assertFalse(afspraak1.kanAfspraakMaken());
        assertTrue(afspraak2.kanAfspraakMaken());
    }

    @Test
    //modified condition/decision coverage
    public void testAfspraakMaken4() {
        Afspraak afspraak1 = new Afspraak(false, true);
        Afspraak afspraak2 = new Afspraak(true, false);
        Afspraak afspraak3 = new Afspraak(true, true);
        assertFalse(afspraak1.kanAfspraakMaken());
        assertFalse(afspraak2.kanAfspraakMaken());
        assertTrue(afspraak3.kanAfspraakMaken());
    }

    @Test
    // Multiple condition coverage
    public void testAfspraakMaken5(){
        Afspraak afspraak1 = new Afspraak(false, false);
        Afspraak afspraak2 = new Afspraak(false, true);
        Afspraak afspraak3 = new Afspraak(true, false);
        Afspraak afspraak4 = new Afspraak(true, true);
        assertFalse(afspraak1.kanAfspraakMaken());
        assertFalse(afspraak2.kanAfspraakMaken());
        assertFalse(afspraak3.kanAfspraakMaken());
        assertTrue(afspraak4.kanAfspraakMaken());
    }
}