/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright Tomislav Novak @ NetAkademija
 */
package Poglavlje06.Rjesenja;

import java.util.Scanner;

/**
 * Napisati program koji sa konzole učitava rečenice koje unosi korisnik sve dok
 * korisnik ne unese niz EOF. EOF korisnik može unijeti bilo gdje u bilo kojoj rečenici.
 * Sve što je korisnik unijeo prije EOF mora se spremiti u jedan string.
 * Korisnik unosi broj veći od 0 a manji od 80 koji predstavlja širinu linije. Prethodno
 * uneseni tekst se mora formatirati za ispis unutar zadane širine linije. Treba napisati
 * dvije metode. Prva metoda vraća formatirani tekst ne razdvajajući riječi, dok druga
 * metoda vraća formatirani tekst razdvajajući riječi po slogovima (riječi razdvajati po
 * samoglasnicima i pri razdvajanju koristiti znak - na kraju reda. Ukoliko je zadnji
 * samoglasnik predzadnje slovo u riječi po njemu ne možemo rastaviti). Korisnik može
 * ponoviti unos širine linije sve dok ne unese 0.
 * Napomena: formatirani tekst treba vratiti natrag u main metodu i tamo napraviti ispis
 * koristeći print metodu.
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0601_v2 {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        StringBuilder tekst = new StringBuilder();
        String linija;
        int duljina = 0;
        boolean kraj = false;
        do {
            linija = ulaz.nextLine();
            if (linija.contains("EOF")) {
                linija = linija.substring(0, linija.indexOf("EOF"));
                kraj = true;
            }
            tekst = tekst.append(linija);
        } while (!kraj);



        do {
            System.out.println("Unesite širinu jednog retka [20, 80]:");
            duljina = ulaz.nextInt();
        } while (duljina < 20 || duljina > 80);

//        System.out.println("Prva metoda:");
//        System.out.println(metodaPrva(tekst, duljina));
        System.out.println("Druga metoda:");
        System.out.println(metodaDruga(tekst, duljina));

    }

    /**
     * Metoda koja formatira tekst na način da vrši prijelaz u novi red ukoliko 
     * je broj znakova u redu više nego je korisnik zadao parametrom duljna.
     * 
     * @param tekst Tekst koji je potrebno formatirati.
     * @param duljina Maksimalna duljina jednog retka.
     * @return formatirani string.
     */
    static String metodaPrva(StringBuilder tekst, int duljina) {

        int index = duljina - 1;
        int prijelom;
        while (index < tekst.length() - 1) {
            if (slobodanPrijelom(tekst.substring(index, index + 2))) {
                tekst.replace(index, index + 1, tekst.charAt(index) + "\n");
                index++;
            } else {
                prijelom = nadiKrajLinije(tekst, index);
                tekst.insert(prijelom, "\n");
                index = prijelom;
            }      
            index += duljina;
        }
        return tekst.toString();
    }

    /**
     * Metoda koja formatira ulazni niz znakova na način da jedan redak teksta ne
     * bude duži od duljine koju je korisnik zadao. Prijelaz unovi red je moguće nakon kraja sloga.
     * 
     * @param tekst Tekst koji je potrebno formatirati.
     * @param duljina Maksimalna duljina jednog retka.
     * @return formatirani string.
     */
    static String metodaDruga(StringBuilder tekst, int duljina) {

        int index = duljina - 1;
        int prijelom;
        while (index < tekst.length() - 1) {
            if (slobodanPrijelom(tekst.substring(index, index + 2))) {
                tekst.replace(index, index + 1, tekst.charAt(index) + "\n");
                index++;
            } else {
                prijelom = nadiKrajSloga(tekst, index);
                if (tekst.charAt(prijelom - 1) == ' ') {
                    tekst.insert(prijelom, "\n");
                } else {
                    tekst.insert(prijelom, "-\n");
                }
                index = prijelom;
            }
            index += duljina;
        }
        return tekst.toString();
    }

    /**
     * Metoda koja pronalazi prvi razmak u ulaznom tekstu 
     * na nekom indeksu manjem od zadanog indeksa.
     * @param tekst Ulazni tekst.
     * @param index zadani indeks.
     * @return indeks prvog razmaka.
     */
    static int nadiKrajLinije(StringBuilder tekst, int index) {

        for (int i = index - 1; i >= 0; i--) {
            if (tekst.charAt(i) == ' ') {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * Metod koja pronalazi granicu dva sloga u rijeci ulaznog teksta ili 
     * prvi razmak koji se pojavljuje prije indeksa.
     * @param tekst Ulazni tekst.
     * @param index indeks prije kojeg se mora pronaći granica sloga ili razmak.
     * @return index n akojem se nalazi granica ili razmak.
     */
    static int nadiKrajSloga(StringBuilder tekst, int index) {

        for (int i = index; i >= 0; i--) {
            if (samoglasnik(tekst.charAt(i)) || tekst.charAt(i) == ' ') {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * Metoda koja provjeraa za ulazni znak da li je samoglasnik.
     * @param znak Ulazni znak.
     * @return True ukoliko je ulazni znak samoglasnik, false inače.
     */
    static boolean samoglasnik(char znak) {

        switch (znak) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    /**
     * Metoda koja provjerava da li je dozvoljeno prelamanje teksta na 
     * @param str
     * @return 
     */
    static boolean slobodanPrijelom(String str) {
        return str.contains(" ");      
    }
}
