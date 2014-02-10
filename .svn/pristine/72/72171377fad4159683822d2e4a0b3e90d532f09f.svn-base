/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Vje�ba V0209
 * Napisati program koji za zadni mjesec i datum ra�una koliko je dana pro�lo
 * od po�etka godine. Pretpostaviti da godina nije prestupna.
 * Potrebno je sa konzole u�itati dva cijela broja: mjesec i dan, te ispisati
 * koliko dana je pro�lo.
 *
 * Napomena: poku�ati iskoristiti falltrough mogu�nost switch-case naredbe.
 */
public class V0209 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Unesite mjesec: ");
        int mjesec = sc.nextInt();
        System.out.print("Unesite dan: ");
        int dan = sc.nextInt();

        int brojDana = 0;

        switch(mjesec) {
        case 12:
            brojDana += dan;
            brojDana += 30 - dan;	// ostatak 11.mj
        case 11:
            brojDana += dan;	// početka 11.mj
            brojDana += 31 - dan;
        case 10:
            brojDana += dan;
            brojDana += 30 - dan;
        case 9:
            brojDana += dan;
            brojDana += 31 - dan;
        case 8:
            brojDana += dan;
            brojDana += 31 - dan;
        case 7:
            brojDana += dan;
            brojDana += 30 - dan;
        case 6:
            brojDana += dan;
            brojDana += 31 - dan;
        case 5:
            brojDana += dan;
            brojDana += 30 - dan;
        case 4:
            brojDana += dan;
            brojDana += 31 - dan;
        case 3:
            brojDana += dan;
            brojDana += 28 - dan;
        case 2:
            brojDana += dan;
            brojDana += 31 - dan;
        case 1:
            brojDana += dan;
        }

        System.out.printf("Od po�etka godina je pro�lo %d dana.", brojDana);

    }
}