/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak Z0204
 * Napisati program koji za zadani polumjer ra�una povr�inu i opseg kruga.
 *
 * Primjer:
 *     r = 10
 *     Opseg kruga iznos 62.831853 du�inskih jedinica.
 *     Povr�ina kruga iznosi 314.159265 kvadratnih jedinica.
 *
 * Naputak: Za vrijednost pi deklarirati i inicijalizirati double konstantu 3.1415
 */
public class Z0204 {

    public static void main(String[] args) {

        int polumjer = 32;
        final double PI = 3.1415;

        double opseg = 2 * polumjer * PI;
        double povrsina = polumjer * polumjer * PI;

        System.out.println("Opseg kruga je :" + opseg);
        System.out.println("Povrsina kruga je :" + povrsina);

    }
}