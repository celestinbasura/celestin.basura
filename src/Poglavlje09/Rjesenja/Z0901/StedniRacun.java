/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Zadaci.Z0901;

/**
 * Stedni racun klijenta. Ovaj racun naslijedjue sve od Osnovnog racuna
 * {@link Racun} uz dodatak iznosa godisnje kamate i iznosa trajanja stednje u
 * mjesecima.
 * @see Racun
 */
public class StedniRacun extends Racun {

    private double kamataPrinosa;
    private int brojMjeseciStednje;

    /**
     * Metoda postavlja godisnju kamatu prinosa.
     * @param kamataPrinosa godisnja kamata prinosa.
     */
    public void setKamataPrinosa(double kamataPrinosa) {
        this.kamataPrinosa = kamataPrinosa;
    }

    /**
     * Metoda postavlja ukupan broj mjeseci trajanja stednje.
     * @param brojMjeseciStednje ukupan broj mjeseci stednje.
     */
    public void setBrojMjeseciStednje(int brojMjeseciStednje) {
        this.brojMjeseciStednje = brojMjeseciStednje;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public double getStanje() {
        return stanje + iznosPrinosa();
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", dobitak: %.2f", iznosPrinosa());
    }

    /**
     * Metoda racuna iznos prinosa.
     * @return iznos prinosa
     */
    private double iznosPrinosa() {
        return (kamataPrinosa/1200.0)*brojMjeseciStednje*stanje;
    }

}
