package com.company;

public class VerzuimLengte {


    int aantalMaandenZiek;

    public VerzuimLengte(int aantalMaandenZiek) {
        this.aantalMaandenZiek = aantalMaandenZiek;
    }

    public String watVoorAfspraak(){
        if(0 < aantalMaandenZiek && aantalMaandenZiek < 3 ){
            return "Afspraak met verzuim medewerker";
        }

        if(3 <= aantalMaandenZiek && aantalMaandenZiek <7){
            return  "Afspraak met bedrijfsarts";
        }
        if(aantalMaandenZiek >= 7){
            return  "Gesprek met coach en bedrijfsarts";
        }
        else return "is niet ziek";
    }
}
