/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje03.Rijesenja;

/**
 * Vje�ba V0315
 * Napisati program koji �ita sa konzole cijelobrojne vrijednosti u intervalu
 * od 1 do 100. U slu�aju da se vrijednost ne nalazi unutar intervala potrebno
 * je ponoviti upis. Ukoliko unesemo 0 program se zavr�ava.
 * Napomena: koristiti do-while petlju, te naredbe break i continue.
 */
public class V0315 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int broj;

        do {
            System.out.print("unesite broj: ");
            broj = sc.nextInt();
            if(broj == 0) {
                System.out.println("Program se prekida !");
                break;
            }
            if((broj < 0) || (broj > 100)) {
                System.out.println("Morate ponoviti upis !");
                continue;
            }
            System.out.println("broj: " + broj);
        } while(true);

    }
}
