/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * VB0504 <br/> 
 * Napisati program koji učitani tekst ispisuje u obrnutom redosljedu.
 * Koristiti klasu StringBuilder. Dodatno, napisati metodu koja provjerava da li
 * je upisani tekst jednak kao i obrnuti tekst.
 */
public class VB0504 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite tekst i potvrdite sa Enter: ");
        String s = sc.nextLine();
        StringBuilder sBuilder = new StringBuilder(s);
        System.out.println("Reverse: " + sBuilder.reverse().toString());
        System.out.println("jednaki su: " + checkPalindrome(sBuilder));

    }

    public static boolean checkPalindrome(StringBuilder sb) {

        StringBuilder rev = new StringBuilder(sb);
        rev.reverse();

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) != rev.charAt(i)) {

                return false;
            }
        }
        return true;
    }
}
