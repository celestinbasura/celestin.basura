/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1130.classes;

import Poglavlje11.Primjeri.p1130.interfaces.Cookable;
import Poglavlje11.Primjeri.p1130.interfaces.Jestiv;

public class Badem extends Hrana implements Jestiv, Cookable {

    public Badem() {
        super("Badem", 159);
    }

    @Override
    public String kakoKonzumirati() {
        return "Just eat the core.";
    }

    @Override
    public String kakoPripremiti() {
        return "Throw them on some cake.";
    }
}
