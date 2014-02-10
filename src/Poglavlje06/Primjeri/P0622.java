/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0622
 * Primjer metoda String objekta, pogledati API
 */
public class P0622 {

    public static void main(String[] args) {

        String str1 = "dobro jutro ";
        String str2 = "DOBRO JUTRO !";

        int duzina = str1.length();

        boolean bo1 = str1.equals(str2);
        boolean bo2 = str1.equalsIgnoreCase(str2);
        boolean bo3 = str1.contains("bro");
        boolean bo4 = str1.endsWith("!");

        String sub1 = "bro";
        char chr1 = 'o';
        char c1 = str1.charAt(3);
        int pos1 = str1.indexOf(chr1);
        int pos2 = str1.indexOf(sub1);
        int pos3 = str1.lastIndexOf(chr1);
        int pos4 = str1.lastIndexOf(sub1);

        String s1 = str1.substring(2);
        String s2 = str1.substring(3, 7);
        String s3 = str1.toUpperCase();
        String s4 = str2.toLowerCase();

        System.out.printf("Duzina stringa je: %d \n", duzina);
        System.out.printf("str1 je jednak str2: %b \n", bo1);
        System.out.printf("str1 je jednak str2 (zanemarujuci velicine slova)"
                + ": %b \n", bo2);
        System.out.printf("str1 sadrzi podstring \"bro\": %b \n", bo3);
        System.out.printf("str1 zavrsava za znakom (char) !: %b \n", bo4);

        System.out.printf("u stringu \"%s\" na poziciji 3 se nalazi "
                + "znak: %c \n", str1, c1);
        System.out.printf("u stringu \"%s\" prvo pojavljivanje znaka '%c' "
                + "je na poziciji: %d \n", str1, chr1, pos1);
        System.out.printf("u stringu \"%s\" prvo pojavljivanje podstringa \"%s\""
                + " je na poziciji: %d \n", str1, sub1, pos2);
        System.out.printf("u stringu \"%s\" zadnje pojavljivanje znaka '%c' je "
                + "na poziciji: %d \n", str1, chr1, pos3);
        System.out.printf("u stringu \"%s\" zadnje pojavljivanje podstringa"
                + " \"%s\" je na poziciji: %d \n", str1, sub1, pos4);

        System.out.printf("\"%s\"\n", s1);
        System.out.printf("\"%s\"\n", s2);
        System.out.printf("\"%s\"\n", s3);
        System.out.printf("\"%s\"\n", s4);

    }
}
