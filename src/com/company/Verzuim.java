package com.company;

import javax.swing.*;

public class Verzuim {

    boolean isZiekgemeld;
    boolean isGoedGekeurd;
    boolean heeftAfspraak;
    int verzuimPeriode;

    public Verzuim(boolean isZiekgemeld, boolean isGoedGekeurd, boolean heeftAfspraak, int verzuimPeriode) {
        this.isZiekgemeld = isZiekgemeld;
        this.isGoedGekeurd = isGoedGekeurd;
        this.heeftAfspraak = heeftAfspraak;
        this.verzuimPeriode = verzuimPeriode;
    }


    public String verzuimPeriode() {

        if (isZiekgemeld) {

            if (isZiekgemeld && isGoedGekeurd) {


            if (isZiekgemeld && isGoedGekeurd && heeftAfspraak) {

                if (verzuimPeriode < 6 && verzuimPeriode > 0) {
                    return "Kort verzuim";
                }
                if (verzuimPeriode == 6) {
                    return "Normaal verzuim";
                }
                if (verzuimPeriode > 6) {
                    return "Lang verzuim";
                }
                 else return "Verzuimperiode moet nog berekend worden door bedrijfsarts";
            }return "Er moet nog een afspraak ingepland worden";}


            return "Moet nog goedgekeurd worden door verzuim medewerker";
        }return "is niet ziek";
    }
}
