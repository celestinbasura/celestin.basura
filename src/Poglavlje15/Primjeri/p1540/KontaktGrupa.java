/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1540;

import Poglavlje15.Primjeri.p1530.Adresa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class KontaktGrupa implements Serializable {

    private Adresa kucnaAdresa = new Adresa("Slovenska", "Zagreb");
    private Adresa poslovnaAdresa = new Adresa("Konavoska", "Zagreb");
    private transient Grupa grupa = new Grupa();

    public void setGrupa(int g) {
        grupa.modify(g);
    }

    @Override
    public String toString() {
        return String.format("kucnaAdresa: %s\nposlovnaAdresa: %s\ngrupa: %s", 
                kucnaAdresa, poslovnaAdresa, grupa);
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeInt(grupa.getGrupa());
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            grupa = new Grupa(is.readInt());
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}
