/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0940;


/**
 * Primjer p0947
 * Primjer nasljeđivanja i skrivanja statičkih metoda klase.
 */
public class p0947 {

    public static void main(String[] args) {

        System.out.println("Primjer 1.:");
        Foo f = new Boo();
        f.drugaMetoda();
        /* ukoliko uzmemo u obzir da statička metoda drugaMetoda u klasi Boo
         * skriva statičku metodu istog imena u klasi Foo ovakvim pozivanjem
         * statičkih metoda nije u potpunosti jasno koja metoda će biti pozvana.
         *
         * Statičke metode nije moguće prekriti(override) već sakriti(hide),
         * pa je metoda koja se izvršava ona koja je deklarirana i
         * implementirana u klasi reference.
         */


        System.out.println("Primjer 2.:");
        Foo.prvaMetoda();
        Foo.drugaMetoda();
        Boo.prvaMetoda();
        Boo.drugaMetoda();
        
        Foo f2 = new Boo();
        f2.drugaMetoda();
        

    }
}
class Foo {

    public static void prvaMetoda() {
        System.out.println("prva metoda Foo klase");
    }

    public static void drugaMetoda() {
        System.out.println("u Foo klasi");
    }
}

class Boo extends Foo {

    public static void drugaMetoda() {
        System.out.println("u Boo klasi");
        
    }
}
