/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0920.klase;

public class Spiderman extends SuperHeroj {

    /* primjer p0821 */
    public String mojProgram(){
        return
                super.mojProgram() +
                "Ja sam Spiderman. "
                + "Superman je mala beba za mene. "
                + "Ja se volim verati po zgradama. ";
    }

    /* primjer p0822 */
    private String ime = "Spiderman ";
    public String getMojeIme(){
        return ime;
    }

    /* primjer p0823 */
    protected String prezime = "VanillaIce ";
    public String getPrezime() {
        return prezime;
    }

}
