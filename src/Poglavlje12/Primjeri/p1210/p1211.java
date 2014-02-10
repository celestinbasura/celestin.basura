/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1210;
        
/**
 * Primjer p1211
 * Primjer referenciranja Enum objekata
 */
public class p1211 {

    public static void main(String[] args) {

        /*
         * Adresa na objekt CRVENA klase Boja vec postoji.
         * Nalazi se u referenci Boja.CRVENA
         */
        Boja b = Boja.CRVENA;
        printStatus(b);       
        printStatus(Boja.ZELENA);

    }

    static void printStatus(Boja bo) {

        System.out.println("Referenca u bo je " + bo);

        System.out.println(
                "Referenca bo "
                + ((bo instanceof Boja) ? "je " : "nije ")
                + "klase Boja");

        System.out.println(
                "Referenca bo "
                + ((bo == Boja.CRVENA) ? "pokazuje " : "ne pokazuje ")
                + "na isti objekt kao i Boja.CRVENA");
    }
}
