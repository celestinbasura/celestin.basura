/*
 * Copyright 2012 Tomislav Novak @ NetAkademija.
 */

package Poglavlje04.Rjesenja;

import java.util.Scanner;

/**
 * V0407
 * Program koji ra�una broj dana izme�u dva datuma.
 * 
 * Program korisnika tra�i da unese dan, mjesec i godinu za po�etni datum 
 * i dan, mjesec i godinu za zavr�ni datum. 
 * Program ispisuje na izlazu broj dana izme�u dva datuma. 
 * U prora�un uklju�ene i prijestupne godine.
 * 
 * @author Tomislav Novak
 */
public class V0407 {

    /**
     * Glavna metoda u kojoj se vr�i ulazno izlazne operacije.
     * 
     * Metoda slu�i za unos dana, mjeseca i godine od strane korisnika. Unutar 
     * glavne metode se vr�i ispis rezultata izra�una.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /*Unos pocetnog datuma*/
        System.out.println("Unesite pocetnu godinu:");
        int pocGod = sc.nextInt();
        System.out.println("Unesite pocetni mjesec:");
        int pocMjesec = sc.nextInt();
        System.out.println("Unesite pocetni dan:");
        int pocDan = sc.nextInt();
        
        /*Unos krajnjeg datuma*/
        System.out.println("Unesite zavrsnu godinu:");
        int zavGod = sc.nextInt();
        System.out.println("Unesite zavrsni mjesec:");
        int zavMjesec = sc.nextInt();
        System.out.println("Unesite zavrsni dan:");
        int zavDan = sc.nextInt();

        /*Ispis*/
        System.out.println("Broj dana izme�u navedenih datuma iznosi: " + brojDana(pocDan, pocMjesec, pocGod, zavDan, zavMjesec, zavGod));

    }

    /**
     * Metoda koja na temelju dana, mjeseca i godine ra�una koliko je dana ostalo do kraja godine.
     * U prora�un se uzima u obzir prijestupna godina.
     * @param dan Dan u mjesecu zadanog datuma.
     * @param mjesec Mjesec zadanog datuma.
     * @param godina Zadana godina
     * @return Broj dana do kraja navedene godine od navedenog dana u mjesecu. 
     */
    static int danaDoKrajaGod(int dan, int mjesec, int godina) {

        int ukupnoDana = 0;
        System.out.println(ukupnoDana);

        switch (mjesec) {
            case 1:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 2:
                ukupnoDana += (provjeriPrijestup(godina) ? 29 : 28) - dan;
                dan = 0;
            case 3:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 4:
                ukupnoDana += 30 - dan;
                dan = 0;
            case 5:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 6:
                ukupnoDana += 30 - dan;
                dan = 0;
            case 7:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 8:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 9:
                ukupnoDana += 30 - dan;
                dan = 0;
            case 10:
                ukupnoDana += 31 - dan;
                dan = 0;
            case 11:
                ukupnoDana += 30 - dan;
                dan = 0;
            case 12:
                ukupnoDana += 31 - dan;

        }

        return ukupnoDana;

    }

    /**
     * Metoda koja na temelju dana, mjeseca i godine ra�una koliko je dana pro�lo od po�etka godine.
     * U prora�un se uzima u obzir prijestupna godina.
     * @param dan Dan u mjesecu zadanog datuma.
     * @param mjesec Mjesec zadanog datuma.
     * @param godina Zadana godina
     * @return Broj dana od pocetka navedene godine od navedenog dana u mjesecu. 
     */
    static int danaOdPocetkaGodine(int dan, int mjesec, int godina) {

        int ukupnoDana = provjeriPrijestup(godina) ? 366 : 365;

        switch (mjesec) {
            case 1:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 2:
                ukupnoDana -= 30 - dan;
                dan = 0;
            case 3:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 4:
                ukupnoDana -= 30 - dan;
                dan = 0;
            case 5:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 6:
                ukupnoDana -= 30 - dan;
                dan = 0;
            case 7:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 8:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 9:
                ukupnoDana -= 30 - dan;
                dan = 0;
            case 10:
                ukupnoDana -= 31 - dan;
                dan = 0;
            case 11:
                ukupnoDana -= (provjeriPrijestup(godina) ? 29 : 28) - dan;
                dan = 0;
            case 12:
                ukupnoDana -= 31 - dan;

        }

        return ukupnoDana;
    }
    
    /**
     * Metoda koja za primljenu godinu provjerava da li je prijestupna.
     * Napomena: Prijestupna godina smije biti djeljiva sa 4 i 400 ali da pritom nije djeljiva sa 100.
     * 
     * @param godina Godina za koju se provjerava prijestupnost.
     * @return True ukoliko je godina prijestupna, false ukoliko nije.
     */
    static boolean provjeriPrijestup(int godina) {

        return (godina % 100 == 0) ? godina % 400 == 0 : godina % 4 == 0;

    }

    /**
     * Metoda koja broji koliko ima prijestupnih godina izme�u dvije godine. 
     * U prora�un ne ulaze pocetna i zavr�na godina.
     * 
     * @param pocGod Pocetna godina.
     * @param zavGodina Zavr�na godina.
     * @return Broj prijetupnih godina izme�u pocetne i zavrsne godine.
     */
    static int brojPrijestupnihIzmedu(int pocGod, int zavGodina) {

        int brojac = 0;
        
        for (int i = pocGod + 1; i < zavGodina; i++) {
            if (provjeriPrijestup(i)) {
                brojac++;
            }
        }
        return brojac;
    }

    /**
     * Metoda koja ra�una broj dana izme�u dva datuma.
     * 
     * Metoda na temelju dana, mjeseca i godine pocetnog datuma i dana, mjeseca
     * i godine zavr�nog datuma ra�una broj dana koliko je pro�lo izme�u istih.
     * 
     * @param pocDan Dan pocetnog datuma.
     * @param pocMjesec Mjesec pocetnog datuma.
     * @param pocGodina Gpdina pocetnog datuma.
     * @param zavDan Dan zavrsnog datuma.
     * @param zavMjesec Mjesec zavrsnog datuma.
     * @param zavGodina Gpdina zavrsnog datuma.
     * @return  Broj dana izme�u zadanih datuma.
     */
    static int brojDana(int pocDan, int pocMjesec, int pocGodina, int zavDan, int zavMjesec, int zavGodina) {

        return danaDoKrajaGod(pocDan, pocMjesec, pocGodina)         //broj dana od pocetnog datuma do kraja te godine
             + (zavGodina - pocGodina - 1) * 365                    //broj dana izme�u pocetne i zavr�ne godine - bez prijestupnih
             + brojPrijestupnihIzmedu(pocGodina, zavGodina)         //broj dana zbog prijestupnih godina
             + danaOdPocetkaGodine(zavDan, zavMjesec, zavGodina);   //broj dana od pocetka do krajnjeg datuma.
    }
}
