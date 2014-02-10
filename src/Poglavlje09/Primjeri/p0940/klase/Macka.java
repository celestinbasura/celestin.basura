/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0940.klase;

public class Macka extends Zivotinja {

    /* p0843 */
    @Override
    public String govori() {
        return "Mijau";
    }

    /* p0844 */
    public int nivoIgonoriranjaVlasnika() {
        return 58;
    }

    /* p0845 i p0846 */
    public String naziv = "Ja sam u klasi Macka";
}
