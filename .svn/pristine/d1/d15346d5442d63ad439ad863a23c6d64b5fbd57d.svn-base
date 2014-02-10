/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Primjer p1636 
 * Serializacija, citanje objekta iz datoteke
 */
class P1536 {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Tomislav\\Desktop\\kontakt.ble");
        Kontakt knt1 = null;
        Kontakt knt2 = null;
        
        try (ObjectInputStream os = new ObjectInputStream(
                        new FileInputStream(f))) {

            knt1 = (Kontakt) os.readObject();
            knt2 = (Kontakt) os.readObject();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        System.out.println("Prvi:\n" + knt1);
        System.out.println("Drugi:\n" + knt2);

        System.out.println("Home adresa je ista:" 
                + (knt1.getKuca() == knt2.getKuca()));
        System.out.println("Work adresa je ista:" 
                + (knt1.getPosao() == knt2.getPosao()));

    }
}
