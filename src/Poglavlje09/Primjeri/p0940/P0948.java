/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak @ NetAkademija.
 */

package Poglavlje09.Primjeri.p0940;


/**
 * Program koji
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class P0948{
    public static void main(String[] args) {
        
        Klasa1 o11 = new Klasa1();
        Klasa1 o12 = new Klasa2();
        Klasa2 o22 = new Klasa2();
        System.out.printf("o11: %d\no12: %d\no22: %d\n", o11.a,o12.a, o22.a);
        //Klasa2 o22 = new Klasa1();
        
    }
}
class Klasa1 {
    int a = 5;
}

class Klasa2 extends Klasa1{
    int a = 6;
}
