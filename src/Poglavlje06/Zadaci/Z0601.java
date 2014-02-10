/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje06.Zadaci;

import java.util.Scanner;

/**
 * Z0501
 * Napisati program koji sa konzole u�itava re�enice koje unosi korisnik sve
 * dok korisnik ne unese niz EOF. EOF korisnik mo�e unijeti bilo gdje u bilo
 * kojoj re�enici. Sve �to je korisnik unijeo prije EOF mora se spremiti u
 * jedan string.
 *
 * Korisnik unosi broj ve�i od 0 a manji od 80 koji predstavlja �irinu linije.
 * Prethodno uneseni tekst se mora formatirati za ispis unutar zadane �irine
 * linije. Treba napisati dvije metode. Prva metoda vraća formatirani tekst ne
 * razdvajaju�i rije�i, dok druga metoda vra�a formatirani tekst razdvajaju�i
 * rije�i po slogovima (rije�i razdvajati po samoglasnicima i pri razdvajanju
 * koristiti znak - na kraju reda. Ukoliko je zadnji samoglasnik predzadnje
 * slovo u rije�i po njemu ne mo�emo rastaviti). Korisnik mo�e ponoviti unos
 * �irine linije sve dok ne unese 0.
 *
 * Napomena: formatirani tekst treba vratiti natrag u main metodu i tamo
 * napraviti ispis koriste�i print metodu.
 *
 * Primjer:
 * Uneseni tekst:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Maecenas placerat auctor dolor, in dapibus dolor dignissim in.
 * Vesti tincidunt malesuada felis, eu EOF luctus leo ultrices non.
 *
 *
 * Broj �irine linije: 20
 *
 * Formatiranje teksta 1. metoda:
 * Lorem ipsum dolor
 * sit amet,
 * consectetur
 * adipiscing elit.
 * Maecenas placerat
 * auctor dolor, in
 * dapibus dolor
 * dignissim in. Vesti
 * tincidunt malesuada
 * felis, eu
 *
 * Formatiranje teksta 2. metoda:
 * Lorem ipsum dolor
 * sit amet, consecte-
 * tur adipiscing
 * elit. Maecenas pla-
 * cerat auctor dolor,
 * in dapibus dolor
 * dignissim in. Ve-
 * sti tincidunt male-
 * suada felis, eu
 *
 */
public class Z0601 {

    public static void main(String[] args) {

        String lorem = "Clanak je vrlo zanimljiv jer otkriva raskorak izmedju "
                + "zelja i potreba tvrtki s jedne strane i znanja koje posjeduju"
                + " studenti koji zavrsavaju sveucilista i visoke skole s druge. "
                + "Cijela analiza se odnosi na zapadno trziste s razvijenim "
                + "gospodarstvom. Kakvo je stanje kod nas, bolje je i ne pitati, "
                + "odnosno analize o stvarnim potrebama se rijetko rade, ali "
                + "vjerujemo da ce se povecEOFane potrebe za kvalitetnim IT kadrom "
                + "na zapadu prije ili poslije odraziti i na nasu stvarnost.";
        
        Scanner scLorem = new Scanner(lorem);
        Scanner sc = new Scanner(System.in);

        final String DELIMITER = "EOF";
        String finalString = "";

        System.out.println("Unesite recenice:");
        String in;
        do {
            /* za unos sa konzole otkomentirati liniju ispod i zakomentirati
             * slijede�u liniju
             */
            // in = sc.nextLine();
            in = scLorem.nextLine();

            /* mo�e i ovako:
             * finalString += (isFinalString(in, DELIMITER)) ?
             *         trimFinalString(in, DELIMITER):(in.trim()+" ");
             */
            if(isFinalString(in, DELIMITER)) {
                finalString += trimFinalString(in, DELIMITER);
            }
            else {
                finalString += in.trim() + " ";
            }

        } while(!isFinalString(in, DELIMITER));

        int rows;
        do {
            System.out.print("\nUnesite sirinu linije ili 0 za kraj: ");
            rows = sc.nextInt();
            if((rows < 30) || (rows > 80)) {
                System.out.println("Sirina linije mora biti izmedju 30 i 80.");
            }
            else {
                System.out.println("\nFormatiranje teksta, 1. metoda");
                System.out.println(formatedString1(finalString, rows));

                System.out.println("\nFormatiranje teksta, 2. metoda");
                System.out.println(formatedString2(finalString, rows));
            }
        } while(rows > 0);

        System.out.println(finalString);

    }

    public static String formatedString1(String finalString, int rows) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        /*
         * Petlju izvr�avamo dok god se index vi�e ne mo�e pomaknuti u
         * finalStringu za broj mjesta u varijabli rows (redci), a po�injemo
         * sa i=0, tj. od po�etka finalString Stringa.
         */
        while((i + rows) < finalString.length()) {

            /*
             * Ukoliko je na mjestu razloma razmak ne trebamo dalje gledati
             * nego samo na tom mjestu razlomiti i korigirati i
             */
            if(finalString.charAt(i + rows) != ' ') {
                /*
                 * Uzmemo prvi podstring stringa finalString od indexa i do
                 * i+rows, to je maksimalni podstring �irine zadanog retka.
                 * Na�emo index najdesnijeg razmak tog podstringa.
                 */
                int A = finalString.lastIndexOf(" ", i + rows - 1) + 1;

                /*
                 * U StringBuilder objekt dodamo podstring od indexa i do
                 * najdesnijeg razmaka i o�istimo po�etne i krajnje razmake
                 */
                sb.append(finalString.substring(i, A).trim());

                /* U StringBuilder objekt dodamo novi red. */
                sb.append("\n");

                /*
                 * Pomaknemo i sa prija�njeg mjesta na mjesto kraja podstringa
                 * kojeg smo dodali u StringBuilder objekt kako bi mogli
                 * nastaviti.
                 */
                i = A;
            }
            else {
                /* pogodili smo razmak, dodajemo sve jer nemamo �to razlamati */
                sb.append(finalString.substring(i, i + rows).trim());
                /* dodajemo kraj u sb */
                sb.append("\n");
                /* korigiramo i pomi�u�i se preko razmaka */
                i += rows + 1;
            }
        }

        /* U stringBuilder dodamo ostatak Stringa finalString. */
        sb.append(finalString.substring(i, finalString.length()).trim());

        return sb.toString();
    }

    public static String formatedString2(String finalString, int rows) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while((i + rows) < finalString.length()) {
            if(finalString.charAt(i + rows - 1) != ' ') {
                /* nalazimo gdje prelamamo rije� */
                int C = indexRazlomaRijeci(finalString, i + rows - 1);
                /* razlamamo rijec */
                String slomljeni = finalString.substring(i, C);
                /*
                 * ukoliko zadnji znak nije razmak, zarez ili tocka
                 * dododajemo znak -
                 */
                char c = slomljeni.charAt(slomljeni.length() - 1);
                if(c != ' ' && c != '.' && c != ',') {
                    slomljeni += "-";
                }
                /* dodajemo string u sb */
                sb.append(slomljeni.trim());
                /* dodajemo kraj u sb */
                sb.append("\n");
                /* korigiramo i */
                i = C;
            }
            else {
                /* pogodili smo razmak, dodajemo sve jer nemamo �to prelamati */
                sb.append(finalString.substring(i, i + rows - 1).trim());
                /* dodajemo kraj u sb */
                sb.append("\n");
                /* korigiramo i pomi�u�i se preko razmaka */
                i += rows;
            }
        }

        /* U stringBuilder dodamo ostatak Stringa finalString. */
        sb.append(finalString.substring(i, finalString.length()).trim());

        return sb.toString();
    }

    /**
     * Pozicija lomljena je na prvom samoglasniku ili razmaku kojeg na�emo.
     * Prethodne se pozicioniramo jedan korak unatrag kako bi sprije�ili
     * lomljenje ukoliko se nalazimo na predzadnjem slovu, a ono je samoglasnik.
     *
     * @param in String u kojem tra�imo
     * @param pocetak Indeks po�etka rije�i
     * @param kraj Indeks kraja rije�i
     * @param index Indeks gdje najkasnije treba slomiti
     * @return Vra�a poziciju lomljenja
     */
    public static int indexRazlomaRijeci(String in, int index) {
        index--;
        while(!isSamoglasnik(in.charAt(index)) && (in.charAt(index) != ' ')) {
            index--;
        }
        return ++index;
    }

    /**
     * Pomo�na metoda kojom tra�imo kraj rije�i u kojoj se nalazi index. Kraj
     * rije�i može biti razmak, to�ka ili kraj stringa.
     *
     * @param in String u kojem tra�imo
     * @param index Indeks po�etka tra�enja
     * @return Indeks kraja rije�i
     */
    public static int nadjiKrajRijeci(String in, int index) {
        int tocka = in.indexOf('.', index);
        int razmak = in.indexOf(' ', index);
        if((tocka > 0 && razmak > 0 && tocka < razmak)) {
            return tocka;
        }
        if((razmak > 0)) {
            return razmak;
        }
        return in.length() - 1;
    }

    /**
     * Pomo�na metoda koja provjerava da li je znak samoglasnik (a, e, i, o, u)
     *
     * @param ch Znak koji se provjerava
     * @return Vra�a true ukoliko je znak koji se provjerava samoglasnik
     */
    public static boolean isSamoglasnik(char ch) {
        switch(ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return true;
        }
        return false;
    }

    /**
     * Pomo�na metoda koja provjerava uneseni string da li je zadnji kojeg trebamo.
     * Zadnji string s kojim se prekida unos je onaj koji sadr�i zadani podstring.
     *
     * @param in String koji provjeravamo postoji li u njemu delim.
     * @param delim String koji ozna�ava kraj unosa, u na�em slu�aju to je EOF.
     * @return Vra�a true ukoliko je delim podstring stringa in.
     */
    public static boolean isFinalString(String in, String delim) {
        if(in.lastIndexOf(delim) < 0) {
            return false;
        }
        return true;
    }

    /**
     * Pomo�na metoda koja iz unsenog stringa vra�a lijevi podsting od mjesta
     * na kojem je prvi put prona�en podstring delim. Metoda tako�er bri�e sve
     * po�etne i zavr�ne razmake (whitespace)
     *
     * @param in String koji provjeravamo postoji li u njemu delim.
     * @param delim String koji ozna�ava kraj unosa, u na�em slu�aju to je EOF.
     * @return Podstring stringa in do mjesta na kojem se pojavljuje string.
     * delim uz brisanje po�etnih i zavr�nih razmaka.
     */
    public static String trimFinalString(String in, String delim) {
        return in.substring(0, in.indexOf(delim)).trim();
    }
}
