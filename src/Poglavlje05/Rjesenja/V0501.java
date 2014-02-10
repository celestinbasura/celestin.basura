/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje05.Rjesenja;

/**
 * V0501 
 * Napisati program koji učitava cijelu liniju teksta sa konzole, te u
 * učitanom nizu znakova mijenja sve samoglasnike u velika slova. Koristiti
 * objekt klase StringBuilder.
 * 
 * primjer:
 * Unesite tekst i potvrdite sa Enter: moramo upisati neki tekst
 * Rezultat: mOrAmO UpIsAtI nEkI tEkst
 */
import java.util.Scanner;

public class V0501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite tekst i potvrdite sa Enter: ");

        String s = sc.nextLine();
        StringBuilder sBuilder = new StringBuilder(s);

        for (int i = 0; i < sBuilder.length(); i++) {

            switch (sBuilder.charAt(i)) {
                case 'a':
                    sBuilder.replace(i, i + 1, "A");
                    break;
                case 'e':
                    sBuilder.replace(i, i + 1, "E");
                    break;
                case 'i':
                    sBuilder.replace(i, i + 1, "I");
                    break;

                case 'o':
                    sBuilder.replace(i, i + 1, "O");
                    break;

                case 'u':
                    sBuilder.replace(i, i + 1, "U");
                    break;
            }
        }
        
        System.out.println("Rezultat: " + sBuilder.toString());
    }
}
