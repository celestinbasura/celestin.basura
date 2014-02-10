/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Zadatak Z0303
 * Napisati program za poga�anje brojeva. Program generira slu�ajni broj u
 * rasponu 1 do 99, korisniku nudi mogu�nost poga�anja te mu daje hint: vas
 * broj je veci, vas broj je manji. Ispisati broj pokusaja.
 *
 * Napomena: kako bi generirali slu�ajni broj koristimo metodu random klase
 * Math koja vra�a slu�ajni broj tipa double u intervalu od 0 do 1.
 *
 * int slucajniBroj = (int)(Math.random() * 100);
 */
public class Z0303 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int slucajniBroj = (int)(Math.random() * 100);
        int brojac = 0;
        int pokusaj;

        do {
            System.out.print("Pokusajte pogoditi broj:");
            pokusaj = sc.nextInt();
            brojac++;
            if(pokusaj < slucajniBroj) {
                System.out.println("Vas broj je manji!");
                continue;
            }
            if(pokusaj > slucajniBroj) {
                System.out.println("Vas broj je veci!");
                continue;
            }
            if(pokusaj == slucajniBroj) {
                System.out.println("Bravo! Uspjeli ste u " + brojac + " pokusaja.");
                break;
            }
        } while(true);

    }
}
