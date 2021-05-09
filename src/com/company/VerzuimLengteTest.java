package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerzuimLengteTest {

    @Test
    // equivalentie klasse test1
    public void VerzuimLengteTest1(){
        VerzuimLengte verzuimLengte1 = new VerzuimLengte(0);
        assertEquals("is niet ziek",verzuimLengte1.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test2
    public void VerzuimLengteTest2(){
        VerzuimLengte verzuimLengte2 = new VerzuimLengte(1);
        assertEquals("Afspraak met verzuim medewerker",verzuimLengte2.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test3
    public void VerzuimLengteTest3(){
        VerzuimLengte verzuimLengte3 = new VerzuimLengte(2);
        assertEquals("Afspraak met verzuim medewerker",verzuimLengte3.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test4
    public void VerzuimLengteTest4(){
        VerzuimLengte verzuimLengte4 = new VerzuimLengte(3);
        assertEquals("Afspraak met bedrijfsarts",verzuimLengte4.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test5
    public void VerzuimLengteTest5(){
        VerzuimLengte verzuimLengte5 = new VerzuimLengte(5);
        assertEquals("Afspraak met bedrijfsarts",verzuimLengte5.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test6
    public void VerzuimLengteTest6(){
        VerzuimLengte verzuimLengte6 = new VerzuimLengte(6);
        assertEquals("Afspraak met bedrijfsarts",verzuimLengte6.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test7
    public void VerzuimLengteTest7(){
        VerzuimLengte verzuimLengte7 = new VerzuimLengte(7);
        assertEquals("Gesprek met coach en bedrijfsarts",verzuimLengte7.watVoorAfspraak());
    }
    @Test
    // equivalentie klasse test8
    public void VerzuimLengteTest8(){
        VerzuimLengte verzuimLengte8 = new VerzuimLengte(8);
        assertEquals("Gesprek met coach en bedrijfsarts",verzuimLengte8.watVoorAfspraak());
    }

}