/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 NetAkademija
 */
package Poglavlje05.Rjesenja;

/**
 * VB0501 <br/> 
 * Napisati program koji sa konzole u�itava jedan niz znakova koriste�i objekt 
 * klase Scanner. Njegovu vrijednost sprema u objekt klase String. Vrijednost 
 * tog objekta sprema u objekt klase StringBuilder. Na kraju ispisuje 
 * vrijednosti objekata String i StringBuilder.
 */
import java.util.Scanner;

public class VB0501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st;
        StringBuilder sb = new StringBuilder();

        st = sc.nextLine();
        sb.append(st);

        System.out.println("String: " + st);
        System.out.println("StringBuilder: " + sb);

    }
}
