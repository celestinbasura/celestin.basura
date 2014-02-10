/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje11.Primjeri.p1130.classes;

import Poglavlje11.Primjeri.p1130.interfaces.Pitak;

public class Cedevita extends Hrana implements Pitak {

    public Cedevita() {
        super("Ceda", 56);
    }

    @Override
    public String kakoKonzumirati() {
        return "just drink it";
    }

    @Override
    public String kakoPripremiti() {
        return "one tablespoon in one glass of water";
    }
}
