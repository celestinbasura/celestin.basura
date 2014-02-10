/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Zadaci.Z0801;

/**
 * Klasa SimKartica opisuje sim karticu.
 */
public class SimKartica {

    /*
     * svim atributima smo naveli modifikator pristupa private kako bi pristup
     * njima imali samo unutar ove klase
     */
    private String telBroj = "+385992523344";
    private String serijskiBroj = "332497865209";
    private String pin = "2244";
    private String puk = "1012321989";

    /**
     * Metoda vraća telefonski broj kartice.
     *
     * @return telefonski broj kartice.
     */
    public String getTelBroj() {

        return telBroj;
    }

    /**
     * Metoda vraća serijski broj kartice.
     *
     * @return serijski broj kartice.
     */
    public String getSerijskiBroj() {

        return serijskiBroj;
    }

    /**
     * Metoda provjeraca da li uneseni pin odgovara po vrijednosti pinu
     * zapisanom na kartici.
     *
     * @param uneseniPin vrijednost koju provjeravamo.
     * @return true ukoliko uneseniPin po vrijednosti odgovara atributu pin.
     */
    public boolean provjeriPin(String uneseniPin) {

        return pin.equals(uneseniPin);
    }

    /**
     * Metoda mijenja vrijednost atributa pin.
     *
     * @param noviPin nova vrijdnost atributa pin.
     * @param stariPin stara vrijednost atributa pin.
     * @return true ukoliko je pin uspješno promijenjen.
     */
    public boolean promijeniPin(String noviPin, String stariPin) {

        if(provjeriPin(stariPin)) {
            pin = noviPin;
            return true;
        }

        return false;
    }

    /**
     * Metoda provjeraca da li uneseni puk odgovara po vrijednosti puku
     * zapisanom na kartici.
     *
     * @param uneseniPuk vrijednost koju provjeravamo.
     * @return true ukoliko uneseniPuk po vrijednosti odgovara atributu puk.
     */
    public boolean provjeriPuk(String uneseniPuk) {

        return puk.equals(uneseniPuk);
    }

    /**
     * Metoda resetira vrijednost atributa pin ukoliko je točno unesena
     * vrijednost puka.
     *
     * @param noviPin nova vrijdnost atributa pin.
     * @param uneseniPuk vrijednost atributa puk.
     * @return true ukoliko je pin uspješno promijenjen.
     */
    public boolean resetirajPin(String noviPin, String uneseniPuk) {

        if(provjeriPuk(uneseniPuk)) {
            pin = noviPin;
            return true;
        }

        return false;
    }
}
