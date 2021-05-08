package com.company;

public class Afspraak {


        boolean ziekmelding;
        boolean goedgekeurd;

        public Afspraak(boolean ziekmelding, boolean goedgekeurd) {
            this.ziekmelding = ziekmelding;
            this.goedgekeurd = goedgekeurd;
        }

        public boolean kanAfspraakMaken() {
            boolean resultaat = false;
            if (ziekmelding && goedgekeurd)
                return true;
            return resultaat ;
        }
    }

