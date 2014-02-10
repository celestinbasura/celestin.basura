/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1001;

/**
 * Klasa GeometrijskiLik služi kao bazna klasa za sve geometrijske likove.
 */
public abstract class GeometrijskiLik {

    /**
     * Metoda računa i vraća vrijednost opsega geometrijskog lika.
     *
     * @return vrijednost opsega.
     */
    public abstract double racunajOpseg();

    /**
     * Metoda računa i vraća vrijednost površine geometrijskog lika.
     *
     * @return vrijednost površine.
     */
    public abstract double racunajPovrsinu();

    /**
     * Metoda vraća string za ispis bilo kojeg geometrijskog lika u koji
     * je uključen opseg i površina.
     * @return string za ispis.
     */
    @Override
    public String toString() {
        return String.format("Opseg: %.4f, Povrsina: %.4f",
                racunajOpseg(), racunajPovrsinu());
    }
}
