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
 * VB0502 <br/> 
 * Napisati program koji sa konzole u�itava jedan po jedan znak i tijekom
 * u�itavanja dopunjava objekt klase StringBuilder. Znakove u�itavamo sve dok
 * korisnike ne unese 0 (nula). Za kraj kreiramo jedan objekt klase String,
 * u njega zapisujemo vrijednost koju smo izgradili ranije i ispisujemo ga. Znak
 * koji se u�itava sa konzole u�itati u String.
 */
public class VB0502 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = "";
        do {
            s = sc.next();
            sb.append(s);           // isto kao sb.append(sc.next());
        } while(sb.charAt(sb.length()-1) != '0');

        sb.deleteCharAt(sb.length()-1);
        String st = sb.toString();
        System.out.println(st);

    }
}
