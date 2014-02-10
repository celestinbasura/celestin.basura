/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1540;

import Poglavlje15.Primjeri.p1530.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Primjer p1641 
 * Serializacija, pisanje objekta u datoteku
 */
class P1541 {

    public static void main(String[] args) throws IOException {

        KontaktGrupa knt = new KontaktGrupa();
        knt.setGrupa(2);

        try (FileOutputStream fs = new FileOutputStream("C:\\Users\\Tomislav\\Desktop\\kontaktGrupa.ble");
                ObjectOutputStream os = new ObjectOutputStream(fs)) {

            os.writeObject(knt);
        }

        System.out.println(knt);

    }
}
