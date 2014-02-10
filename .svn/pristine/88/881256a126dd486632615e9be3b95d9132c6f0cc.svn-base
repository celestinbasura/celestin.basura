/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje12.Primjeri.p1220;

/**
 * vanjska klasa
 */
public class VanjskaKlasa {

    private String member = "neki string";

    public String getAtrVanjskeKlase() {

        final int var = 2;

        /**
         * Unutarnja klasa imenovana u metodi, mora biti deklarirana
         * prije korištenja.
         */
        class UnutarnjaKlasaMetode {

            int doubleVar = var * 2;
            String most = member;
        }

        UnutarnjaKlasaMetode u = new UnutarnjaKlasaMetode();
        return u.most;

    }

    /**
     * Staticka unutarnja klasa se smatra top level klasom.
     */
    static class StaticUnutarnjaKlasa {

        static final int MEMBER = 23;
    }

}
