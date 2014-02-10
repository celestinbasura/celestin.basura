/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak Z0208
 * Napisati program koji ra�una broj dana izme�u dva datuma. Potrebno je sa
 * konzole u�itati oba datuma (godinu, mjesec, dan) te paziti na prestupne
 * godine.
 */
public class Z0208 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Unesite pocetni datum: ");
        System.out.print("  godina: ");
        int pocGodina = sc.nextInt();
        System.out.print("  mjesec: ");
        int pocMjesec = sc.nextInt();
        System.out.print("  dan: ");
        int pocDan = sc.nextInt();

        System.out.println("Unesite zavrsni datum: ");
        System.out.print("  godina: ");
        int zavGodina = sc.nextInt();
        System.out.print("  mjesec: ");
        int zavMjesec = sc.nextInt();
        System.out.print("  dan: ");
        int zavDan = sc.nextInt();

        // izra�nati koliko ima godina i koliko ih je prestupnih, te dobiti broja dana
        int pocGodinaPuna = pocGodina + 1;
        int zavGodinaPuna = zavGodina - 1;
        boolean pocGodinaPunaJePrestupna = (pocGodinaPuna % 100 == 0) ? (pocGodinaPuna % 400 == 0) : (pocGodinaPuna % 4 == 0);
        boolean zavGodinaPunaJePrestupna = (zavGodinaPuna % 100 == 0) ? (zavGodinaPuna % 400 == 0) : (zavGodinaPuna % 4 == 0);

        int brojGodina = zavGodinaPuna - pocGodinaPuna + 1;
        int broj4 = ((pocGodinaPuna % 4) + brojGodina) / 4;
        int broj100 = ((pocGodinaPuna % 100) + brojGodina) / 100;
        int broj400 = ((pocGodinaPuna % 400) + brojGodina) / 400;
        int brojPrestupnih = broj4 - broj100 + broj400;

        if(pocGodinaPunaJePrestupna || zavGodinaPunaJePrestupna) {
            brojPrestupnih++;
        }

        int brojPunihGodina = brojGodina - brojPrestupnih;
        int brojDana = (brojPunihGodina * 365 + brojPrestupnih * 366);

        boolean pocGodinaJePrestupna = (pocGodina % 100 == 0) ? (pocGodina % 400 == 0) : (pocGodina % 4 == 0);
        boolean zavGodinaJePrestupna = (zavGodina % 100 == 0) ? (zavGodina % 400 == 0) : (zavGodina % 4 == 0);

        // izračuati koliko ima dana od početnog datuma do prve pune godine
        switch(pocMjesec) {
        case 1:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 2:
            brojDana += ((pocGodinaJePrestupna) ? (29 - pocDan) : (28 - pocDan));
            brojDana += pocDan;
        case 3:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 4:
            brojDana += (30 - pocDan);
            brojDana += pocDan;
        case 5:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 6:
            brojDana += (30 - pocDan);
            brojDana += pocDan;
        case 7:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 8:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 9:
            brojDana += (30 - pocDan);
            brojDana += pocDan;
        case 10:
            brojDana += (31 - pocDan);
            brojDana += pocDan;
        case 11:
            brojDana += (30 - pocDan);
            brojDana += pocDan;
        case 12:
            brojDana += (31 - pocDan + 1);
        }

        // izra�uati koliko ima dana od po�etka zadnje godine do zadnjeg datuma
        switch(zavMjesec) {
        case 12:
            brojDana += zavDan;
            brojDana += 30 - zavDan; // ostatak 11.mj
        case 11:
            brojDana += zavDan;	 // po�etak 11.mj
            brojDana += 31 - zavDan;
        case 10:
            brojDana += zavDan;
            brojDana += 30 - zavDan;
        case 9:
            brojDana += zavDan;
            brojDana += 31 - zavDan;
        case 8:
            brojDana += zavDan;
            brojDana += 31 - zavDan;
        case 7:
            brojDana += zavDan;
            brojDana += 30 - zavDan;
        case 6:
            brojDana += zavDan;
            brojDana += 31 - zavDan;
        case 5:
            brojDana += zavDan;
            brojDana += 30 - zavDan;
        case 4:
            brojDana += zavDan;
            brojDana += 31 - zavDan;
        case 3:
            brojDana += zavDan;
            brojDana += ((pocGodinaJePrestupna) ? (29 - zavDan) : (28 - zavDan));
        case 2:
            brojDana += zavDan;
            brojDana += 31 - zavDan;
        case 1:
            brojDana += zavDan;
        }

        System.out.println("Broj dana: " + brojDana);

    }
}
