/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1001;

/**
 * Geometrijski lik Trokut naslijeđuje baznu klasu GeometrijskiLik
 */
public class Trokut extends GeometrijskiLik {

    private double a, b, c;

    /**
     * Konstruktor koji prima duljine sve tri stranice trokuta.
     *
     * @param a duljina stranice trokuta
     * @param b duljina stranice trokuta
     * @param c duljina stranice trokuta
     */
    public Trokut(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double racunajOpseg() {

        return a + b + c;
    }

    @Override
    public double racunajPovrsinu() {

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {

        return "Trokut, " + super.toString();
    }

}
