/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1002;

import Poglavlje10.Vjezbe.v1001.Trokut;
import Poglavlje10.Vjezbe.v1001.Pravokutnik;
import Poglavlje10.Vjezbe.v1001.Elipsa;
import Poglavlje10.Vjezbe.v1001.GeometrijskiLik;
import java.util.Scanner;

/**
 * Program sa main metodom za testiranje geometrijskih likova.
 */
public class Program {

    public static void main(String[] args) {

        GeometrijskiLik[] likovi = {
            napraviPravokutnik(),
            napraviTrokut(),
            napraviElipsu(),
            napraviKvadrat(),
            napraviKruznicu()
        };

        double povrsinaUkupno = 0;

        for(GeometrijskiLik geo : likovi) {
            System.out.println(geo);
            povrsinaUkupno += geo.racunajPovrsinu();
        }

        System.out.printf("Ukupna povrsina: %.4f \n", povrsinaUkupno);

    }
    
    private static Scanner sc = new Scanner(System.in);

    /**
     * Pomoćna metoda za upit korisniku da unese stranicu.
     * @return duljina stranice koju je korisnik upisao.
     */
    private static double unosDuljine(String stranica) {

        System.out.printf("Unesite duljinu %s: ", stranica);
        return sc.nextDouble();
    }

    /**
     * Pomoćna metoda za kreiranje pravokutnika.
     * @return objekt, instanca klase Pravokutnik
     */
    private static Pravokutnik napraviPravokutnik() {

        System.out.println("\nKreiram pravokutnik:");
        double a = unosDuljine("a");
        double b = unosDuljine("b");
        return new Pravokutnik(a, b);
    }

    /**
     * Pomoćna metoda za kreiranje elipse.
     * @return objekt, instanca klase Elipsa
     */
    private static Elipsa napraviElipsu() {

        System.out.println("\nKreiram elipsu:");
        double a = unosDuljine("a");
        double b = unosDuljine("b");
        return new Elipsa(a, b);
    }

    /**
     * Pomoćna metoda za kreiranje trokuta.
     * @return objekt, instanca klase Trokut
     */
    private static Trokut napraviTrokut() {

        System.out.println("\nKreiram trokut:");
        double a = unosDuljine("a");
        double b = unosDuljine("b");
        double c = unosDuljine("c");
        return new Trokut(a, b, c);
    }

    /**
     * Pomoćna metoda za kreiranje kvadrata.
     * @return objekt, instanca klase Kvadrat
     */
    private static Kvadrat napraviKvadrat() {

        System.out.println("\nKreiram kvadrat:");
        return new Kvadrat(unosDuljine("a"));
    }

    /**
     * Pomoćna metoda za kreiranje kruznice.
     * @return objekt, instanca klase Kruznica
     */
    private static Kruznica napraviKruznicu() {

        System.out.println("\nKreiram kruznicu:");
        return new Kruznica(unosDuljine("r"));
    }
}
