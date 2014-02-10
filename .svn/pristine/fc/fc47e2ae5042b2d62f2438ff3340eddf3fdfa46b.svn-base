/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje08.Zadaci.Z0802;

/**
 * Imenik sa kontaktima
 */
public class Imenik {

    public final int KAPACITET = 20;
    private Kontakt[] imenik = new Kontakt[KAPACITET];

    /**
     * Metoda vraća imenik.
     *
     * @return imenik sim kartice.
     */
    public Kontakt[] getImenik() {

        return imenik;
    }

    /**
     * Metoda koja pretražuje kontakte po imenu. Metoda vraća prvi kontakt koji
     * odgovara upitu. Ukoliko ne pronađe niti jedan kontakt metoda vraća null.
     *
     * @param ime ime koje tražimo, uvijet pretrage.
     * @return kontakt sa istim imenom ili null ukoliko niti jedan kontak ne
     * odgovara traženom upitu.
     */
    public Kontakt pretraziPoImenu(String ime) {

        for(int i = 0; i < imenik.length; i++) {
            if((imenik[i] != null) && (imenik[i].getIme().equals(ime))) {
                return imenik[i];
            }
        }

        return null;
    }

    /**
     * Metoda koja pretražuje kontakte po broju. Metoda vraća prvi kontakt koji
     * odgovara upitu. Ukoliko ne pronađe niti jedan kontakt metoda vraća null.
     *
     * @param broj broj koje tražimo, uvijet pretrage.
     * @return kontakt sa istim brojem ili null ukoliko niti jedan kontak ne
     * odgovara traženom upitu.
     */
    public Kontakt pretraziPoBroju(String broj) {

        for(int i = 0; i < imenik.length; i++) {
            if((imenik[i] != null) && (imenik[i].getBroj().equals(broj))) {
                return imenik[i];
            }
        }

        return null;
    }

    /**
     * Metoda vraća slobodni kapacitet memorije imenika.
     *
     * @return slobodni kapacitet memorije.
     */
    public int slobodniKapacitet() {

        int brojac = 0;
        for(int i = 0; i < imenik.length; i++) {
            if(imenik[i] == null) {
                brojac++;
            }
        }
        return brojac;
    }

    /**
     * Dodavanje kontakta na prazno mijesto u imeniku.
     *
     * @param kon instanca klase Kontakt koju dodajemo u imenik.
     */
    public void dodajKontakt(Kontakt kon) {

        if(slobodniKapacitet() > 0) {
            for(int i = 0; i < imenik.length; i++) {
                if(imenik[i] == null) {
                    imenik[i] = kon;
                    return;
                }
            }
        }
    }

    /**
     * Metoda briše sve kontakte koji imaju isto ime kao i kontakt koji smo
     * proslijedili kao parametar.
     *
     * @param kon kontakt koji sadrži ime po kojem brišemo.
     */
    public void brisiKontaktPoImenu(Kontakt kon) {

        for(int i = 0; i < imenik.length; i++) {
            if((imenik[i] != null)
                    && (imenik[i].getIme().equals(kon.getIme()))) {

                imenik[i] = null;
            }
        }
    }

    /**
     * Metoda briše sve kontakte koji imaju isti broj kao i kontakt koji smo
     * proslijedili kao parametar.
     *
     * @param kon kontakt koji sadrži broj po kojem brišemo.
     */
    public void brisiKontaktPoBroju(Kontakt kon) {

        for(int i = 0; i < imenik.length; i++) {
            if((imenik[i] != null)
                    && (imenik[i].getBroj().equals(kon.getBroj()))) {

                imenik[i] = null;
            }
        }
    }

    public String ispisImenika() {

        StringBuilder sb = new StringBuilder("Sadrzaj imenika: \n");
        for(int i = 0; i < imenik.length; i++) {
            if(imenik[i] != null)  {

                sb.append("Ime: ");
                sb.append(imenik[i].getIme());
                sb.append(", ");

                sb.append("Broj: ");
                sb.append(imenik[i].getBroj());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}