/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba V0202
 * Imamo dva majmuna. Napisati program koji �e, ukoliko se oba dva smiju ili se
 * niti jedan ne smije, ispisati na ekran true, jer je sve OK. Ukoliko se samo
 * jedan smije ispisati false, jer ne�to nije kako treba. Deklarirati i
 * inicijalizirati dvije varijable tipa boolean, za svakog majmuna jednu
 * varijablu.
 */
public class V0202 {

    public static void main(String[] args) {

        boolean majmun1seSmije;
        boolean majmun2seSmije;
        boolean sveJeOK;

        majmun1seSmije = true;
        majmun2seSmije = false;

        sveJeOK = majmun1seSmije == majmun2seSmije;

        System.out.println(" Sve je OK: " + sveJeOK);
    }
}