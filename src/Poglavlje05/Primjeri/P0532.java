/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0532 Primjer kori�tenja StringBuilder klase
 */
public class P0532 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("dobro jutro !");
        for (int i = 1; i < 1000; i++) {
            str.append(i);
        }
        System.out.println(str);

        StringBuilder sb1 = new StringBuilder();
        String s1 = "a" + "b" + "c";
        sb1.append("a").append("b").append("c");
        System.out.printf("s: %s, sb: %s \n", s1, sb1);

        System.out.printf("kapacitet str: %d \n", str.length());
        System.out.printf("kapacitet str: %d \n", str.capacity());
        System.out.printf("kapacitet sb1: %d \n", sb1.length());
        System.out.printf("kapacitet sb1: %d \n", sb1.capacity());

    }
}
