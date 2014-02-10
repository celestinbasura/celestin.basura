/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Milan Draganic, Marijan Matic - NetAkademija
 */
package Poglavlje15.Primjeri.p1530;

import java.io.Serializable;

public class Adresa implements Serializable {

    private String adresa;
    private String grad;

    public Adresa(String adresa, String grad) {
        this.adresa = adresa;
        this.grad = grad;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", adresa, grad);
    }
}
