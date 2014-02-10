/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Vjezbe.V0902.klase;

/**
 * Tekuci racun klijenta. Ovaj racun naslijedjue sve od Osnovnog racuna
 * {@link Racun} uz dodatak odobrenog minusa koji se pribraja raspolozivoj svoti
 * klijenta za isplatu.
 * @see Racun
 */
public class TekuciRacun extends Racun {

    private double dozvoljeniMinus;

    /**
     * Metoda postavlja dozvoljeni minus tekuceg racuna.
     * @param minus iznos dozvoljenog minusa.
     */
    public void setDozvoljeniMinus(double minus) {
        this.dozvoljeniMinus = minus;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public double getStanje() {
        return super.getStanje() + dozvoljeniMinus;
    }

    /*
     * Metodu toString nije potrebno overridati da bi dobili ispis novog stanja.
     * Ukoliko ne overridamo metodu toString u klasi TekuciRacun naslijedit ce
     * se iz klase Racun ali ce se implementaciju uzeti iz klase TekuciRacun jer
     * je metoda getStanje overridana i implementirana.
     */

}
