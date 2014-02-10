/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0621
 * Primjer neefikasnog koristenja string objekta. Za svaku iteraciju petlje
 * stvaramo novi string literal u string poolu.
 */
public class P0621 {

    public static void main(String[] args) {

        String str = "dobro jutro !";

        for(int i = 1; i < 1000; i++) {
            str = str + i;
        }

        System.out.println(str);

    }
}
