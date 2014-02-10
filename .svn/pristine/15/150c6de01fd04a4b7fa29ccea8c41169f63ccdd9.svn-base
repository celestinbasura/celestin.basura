/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer p1635 
 * Serializacija, pisanje objekta u datoteku, dijeljenje objekta
 */
class P1535 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tomislav\\Desktop\\kontakt.ble");
        Adresa work = new Adresa("Konavoska", "Zagreb");

        Kontakt knt1 = new Kontakt(new Adresa("Slovenska", "Zagreb"), work);
        Kontakt knt2 = new Kontakt(new Adresa("Zagrebacka", "Zagreb"), work);
        System.out.println("Prvi:\n" + knt1);
        System.out.println("Drugi:\n" + knt2);

        try (ObjectOutputStream os = new ObjectOutputStream(
                        new FileOutputStream(f))) {

            os.writeObject(knt1);
            os.writeObject(knt2);
        }

    }
}
