/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Vjezbe.v1002;

import Poglavlje10.Vjezbe.v1001.Elipsa;

/**
 * Geometrijski lik Kruznica naslijeđuje klasu Elipsa
 */
public class Kruznica extends Elipsa {

    /**
     * Konstruktor koji prima duljnu polumjera kruznice.
     *
     * @param a duljina polumjera.
     */
    public Kruznica(double a) {

        super (a, a);
    }

    @Override
    public String toString() {

        return "Kruznica = " + super.toString();
    }

}
