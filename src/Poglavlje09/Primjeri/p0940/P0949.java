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
public class P0949 {
    public static void main(String[] args) {
        
        KlasaA oaa = new KlasaA();
        KlasaA oab = new KlasaB();
        KlasaB obb = new KlasaB();
//        System.out.printf("o11: %d\no12: %d\no22: %d\n", oaa.a,oab.a, obb.a);
        System.out.printf("o11: %d\no12: %d\no22: %d\n", oaa.getA(),oab.getA(), obb.getA());
        //Klasa2 o22 = new Klasa1();
        
    }
}
class KlasaA {
    private int a = 5;//probaj staviti public - ista stvar

    public int getA() {
        return a;
    }
    
}

class KlasaB extends KlasaA{
    private int a = 6;

    public int getA() {
        return a;
    }
    
}
