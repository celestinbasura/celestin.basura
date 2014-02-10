/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1001;

/**
 * Geometrijski lik Pravokutnik naslijeđuje baznu klasu GeometrijskiLik
 */
public class Pravokutnik extends GeometrijskiLik {

    private double a, b;

    /**
     * Konstruktor koji prima duljne stranica pravokutnika.
     *
     * @param a duljina stranice
     * @param b duljina stranice
     */
    public Pravokutnik(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double racunajOpseg() {

        return 2 * (a + b);
    }

    @Override
    public double racunajPovrsinu() {

        return a * b;
    }

    @Override
    public String toString() {

        return "Pravokutnik, " + super.toString();
    }

}
