/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 NetAkademija
 */
package Poglavlje05.Rjesenja;

import java.util.Scanner;

/**
 * VB0503 <br/> 
 * Napisati program koji za uneseni cijeli broj ispisuje njegovu
 * vrijednost u hexadecimalnom brojevnom sustavu. Ukoliko korisnik ne unese
 * cijeli broj program ispisuje grešku i prekida rad.
 */
public class VB0503 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi cijeli broj: ");
        if (sc.hasNextInt()) {
            int br = sc.nextInt();
            System.out.println("Hex zapis: 0x" + Integer.toHexString(br));
        } else {
            System.out.println("Error, uneseni niz nije cijeli broj");
        }

    }

}
