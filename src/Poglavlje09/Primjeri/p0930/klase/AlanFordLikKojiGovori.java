/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0930.klase;

public class AlanFordLikKojiGovori extends AlanFordLik{

    @Override
    public String toString() {        
        return String.format("%s, %s", super.getIme(), super.getGrupa());
    }

}
