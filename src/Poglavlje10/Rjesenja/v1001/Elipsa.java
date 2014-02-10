/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1001;

import static java.lang.Math.*;

/**
 * Geometrijski lik Elipsa naslijeđuje baznu klasu GeometrijskiLik
 */
public class Elipsa extends GeometrijskiLik {

    private double a, b;

    /**
     * Konstruktor koji prima duljine obje poluosi elipse.
     *
     * @param a duljina velike poluosi
     * @param b duljina male poluosi
     */
    public Elipsa(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double racunajOpseg() {

        return 2 * PI * sqrt((pow(a, 2) * pow(b, 2)) / 2);
    }

    @Override
    public double racunajPovrsinu() {

        return PI * a * b;
    }

    @Override
    public String toString() {

        return "Elipsa, " + super.toString();
    }
}
