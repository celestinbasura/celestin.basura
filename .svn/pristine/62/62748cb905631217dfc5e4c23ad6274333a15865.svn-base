/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1220;

/**
 * P1225
 * Primjer anonimne unutarnje klase: konkretna implementacija metode status()
 * prilikom kreiranja instance klase osoba.
 */
public class p1225 {

    public static void main(String[] args) {

        Osoba os1 = new Osoba("Mirko", "Mirkić") {

            @Override
            public String status() {
                return getIme() + " " + getPrezime() + " je student";
            }
        };

        Osoba os2 = new Osoba("Živko", "Živkić") {

            @Override
            public String status() {
                return getIme() + " " + getPrezime()
                        + " nije student, on je završio.";
            }            
        };

        System.out.println(os1.status());
        System.out.println(os2.status());

    }
}
