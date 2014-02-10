package babic.juraj.Poglavlje03.Primjeri;

/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */

/**
 * P0334 Primjer beskona�ne for petlje, blokovi for petlje mogu biti prazni.
 */
public class P0334 {

    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++)
            ;
        
        {
            System.out.println(i);
        }    
    }
}
