/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje04.Rjesenja;

/**
 *
 */
public class Z0411 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        /** Odabir ra�unske operacije. */
        int operacija;
        do {
            System.out.print("Unesite broj racunske operacije: ");
            operacija = sc.nextInt();
        } while(!provjeriOdabirOperacije(operacija));

        /** Ra�unanje i ispis rezultata. */
        double sum = postaviPocetnuVrijednost(operacija);
        int broj;
        System.out.print("Unesite brojeve: ");
        do {
            broj = sc.nextInt();
            if(provjeriUneseniBroj(broj)) {
                sum = racunaj(broj, sum, operacija);
            }
        } while(provjeriUneseniBroj(broj));

        System.out.printf("Rezultat je %.13f \n", sum);
        System.out.println("Kraj programa.");

    }

    private static boolean provjeriUneseniBroj(int broj) {
        return broj != 0;
    }

    private static double racunaj(int broj, double sum, int operacija) {

        /*
         * metoda racunaj vra�a vrijednost izra�una ovisno
         * o operaciji.
         */
        switch(operacija) {
        case 1:
            return zbrajaj(sum, broj);
        case 2:
            return oduzimaj(sum, broj);
        case 3:
            return mnozi(sum, broj);
        case 4:
            return djeli(sum, broj);
        }
        return 0;
    }

    private static double postaviPocetnuVrijednost(int operacija) {
        if((operacija == 1) || (operacija == 2)) {
            return 0;
        }
        if((operacija == 3) || (operacija == 4)) {
            return 1;
        }
        return 0;
    }

    private static boolean provjeriOdabirOperacije(int operacija) {

        switch(operacija) {
        case 0:
            System.out.println("Odabrali ste kraj programa.");
            return true;
        case 1:
            System.out.println("Odabrali ste zabrajanje.");
            return true;
        case 2:
            System.out.println("Odabrali ste oduzimanje.");
            return true;
        case 3:
            System.out.println("Odabrali ste mnozenje.");
            return true;
        case 4:
            System.out.println("Odabrali ste djeljenje.");
            return true;
        case 5:
            System.out.println("Opcije za odabir racunske operacije, kraj ili "
                    + "pomoc:");
            System.out.println("Zbrajanje: 1");
            System.out.println("Oduzimanje: 2");
            System.out.println("Mnozenje: 3");
            System.out.println("Djeljenje: 4");
            System.out.println("Pomoc: 5");
            System.out.println("Kraj: 0");
            return false;
        default:
            System.out.println("Odabrali ste pogresnu opciju, unesite 5 za "
                    + "pomoc.");
            return false;
        }
    }

    private static double zbrajaj(double sum, int broj) {
        return sum += broj;
    }

    private static double oduzimaj(double sum, int broj) {
        return sum -= broj;
    }

    private static double mnozi(double sum, int broj) {
        return sum *= broj;
    }

    private static double djeli(double sum, int broj) {
        return sum /= broj;
    }
}
