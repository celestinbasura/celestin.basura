/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak @ NetAkademija.
 */

/**
 * P0613
 * Primjer usporedjivanje stringova.
 *
 */
public class P0613 {

    public static void main(String[] args) {

        //kreiranje string objekata preko literala - stavljanje u literal pool.
        String s1 = "ja sam mali string";

        /*String je nastao kao konstantni izraz - u vrijeme kompajliranja nastaje.*/
        String s2 = "ja sam " + "mali string"; 


        System.out.println("s1, s2 su jednaki (==) ? " + (s1 == s2));
        System.out.println("s1, s2 su jednaki (equals) ? " + (s1.equals(s2)));
                
        String partOne = "ja sam ";
        
        /*String NIJE nastao kao konstantni izraz - nastaje u vrijeme izvršavanja*/
        String s3 = partOne + "mali string";

        System.out.println("s1, s3 su jednaki (==) ? " + (s1 == s3));
        System.out.println("s1, s3 su jednaki (equals) ? " + (s1.equals(s3)));

    }
}
