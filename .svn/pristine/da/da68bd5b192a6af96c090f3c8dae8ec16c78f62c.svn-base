/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak z0201 
 * Imamo glasnu papigu. Trebamo napisati program koji �e nam
 * ispisati true ili false, ovisno o tome da li su susjedi ljuti jer se na�a
 * papiga razvezala u nezgodno vrijeme. Imamo konstantu tipa int koja ozna�ava
 * trenutni sat, te varijablu tipa boolean koja ozna�ava da li na�a papiga
 * trenutno pri�a. Susjedi su ljuti ukoliko papiga pri�a prije 7 sati ujutro i
 * nakon 20 sati nave�er.
 *
 * Deklaritati i inicijalizirati varijable tipa boolean: papigaPrica i
 * susjediSuLjuti te konstantu tipa int trenutnoJeSati.
 */
public class Z0201 {

    public static void main(String[] args) {

        boolean papigaPrica;
        final int trenutnoJeSati;
        boolean susjediSuLjuti;

        papigaPrica = true;
        trenutnoJeSati = 22;

        susjediSuLjuti = (papigaPrica && ((trenutnoJeSati < 7)
                || (trenutnoJeSati > 20)));

        System.out.println(" rez: " + susjediSuLjuti);

    }
}