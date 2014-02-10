/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0910.klase;

public class Student extends Osoba {

    protected String zanimanje;

    public void setIme(String ime) {
        this.ime = ime;
        zanimanje = "Student";
    }

    public String statusStudenta() {
        return zanimanje + " " + ime;
    }
    
}
