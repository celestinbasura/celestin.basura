/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0920.klase;

public class SuperHeroj {

    /* primjer p0821 */
    public String mojProgram(){
        return "Ja sam Heroj ulice. ";
    }

    /* primjer p0822 */
    private String ime = "Superheroj ";
    public final String getIme() {
        return ime;
    }

    /* primjer p0823 */
    protected String prezime = "Suljo ";
    public String getPrezime() {
        return prezime;
    }

}
