/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Primjeri;

import Poglavlje08.Primjeri.paket.Klasa31;
//import Poglavlje08.Primjeri.paket.podpaket.Klasa31;

/**
 * p0831
 * Grupe klasa, paketi.
 */
class P0831 {

    public static void main(String[] args) {

       Klasa31 obj1 = new Klasa31();
       Poglavlje08.Primjeri.paket.podpaket.Klasa31 obj2;
        obj2 = new Poglavlje08.Primjeri.paket.podpaket.Klasa31();

       // obj1.ime = "Marko";
        obj1.prezime = "Wong";
      //
        obj2.broj = 9;

    }
}
