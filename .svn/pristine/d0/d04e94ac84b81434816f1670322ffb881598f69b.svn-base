/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje12.Vjezbe.V1212;

import java.util.ArrayList;

/**
 *
 * @author Celestin
 */
public class Adresar {

    private class Osoba {

        String ime;
        String prezime;
        String adresa;
        String mjesto;
        String telBroj;

        public Osoba(String ime, String prezime,
                String adresa, String mjesto, String telBroj) {
            this.adresa = adresa;
            this.ime = ime;
            this.mjesto = mjesto;
            this.telBroj = telBroj;
            this.prezime = prezime;
        }

        @Override
        public String toString() {

            return ime + " " + prezime
                    + ",\n" + adresa
                    + ",\n" + mjesto
                    + ",\n" + telBroj;
        }

    }

    ArrayList<Osoba> popis = new ArrayList<>();

    public void addOsoba(String ime, String prezime,
            String adresa, String mjesto, String telBroj) {

        popis.add(new Osoba(ime, prezime, adresa, mjesto, telBroj));
    }

    public void removeOsoba(int i) {
        Osoba os = popis.get(i);
        popis.remove(os);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Osoba cd : popis) {
            sb.append(cd.toString());
            sb.append("\n\n\n");
        }
        return sb.toString();
    }

    public int searchOsoba(String prezime) {

        for (int i = 0; i < popis.size(); i++) {
            if (prezime.equals(popis.get(i).prezime)) {
                return i;
            }
        }
        return -1;
    }
}
