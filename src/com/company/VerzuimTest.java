package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerzuimTest {
    @Test
    // pairwise testing1
    public void VerzuimTest1(){
        Verzuim veruim1 = new Verzuim(false,false,false,0);
        assertEquals(veruim1.verzuimPeriode(),"is niet ziek");
    }
    @Test
    // pairwise testing2
    public void VerzuimTest2() {
        Verzuim veruim1 = new Verzuim(true, false, false, 0);
        assertEquals(veruim1.verzuimPeriode(), "Moet nog goedgekeurd worden door verzuim medewerker");
    }
    @Test
    // pairwise testing3
    public void VerzuimTest3() {
        Verzuim veruim1 = new Verzuim(true, true, false, 0);
        assertEquals(veruim1.verzuimPeriode(), "Er moet nog een afspraak ingepland worden");
    }
    @Test
    // pairwise testing4
    public void VerzuimTest4() {
        Verzuim veruim1 = new Verzuim(true, true, true, 0);
        assertEquals(veruim1.verzuimPeriode(), "Verzuimperiode moet nog berekend worden door bedrijfsarts");
    }
    @Test
    // pairwise testing5
    public void VerzuimTest5() {
        Verzuim veruim1 = new Verzuim(true, true, true, 3);
        assertEquals(veruim1.verzuimPeriode(), "Kort verzuim");
    }
    @Test
    // pairwise testing6
    public void VerzuimTest6() {
        Verzuim veruim1 = new Verzuim(true, true, true, 6);
        assertEquals(veruim1.verzuimPeriode(), "Normaal verzuim");
    }
    @Test
    // pairwise testing7
    public void VerzuimTest7() {
        Verzuim veruim1 = new Verzuim(true, true, true, 9);
        assertEquals(veruim1.verzuimPeriode(), "Lang verzuim");
    }

}