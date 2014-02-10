/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje10.Primjeri.p1020;


/**
 * Primjer P1023
 * Primjer pozivanja i korištenja superkonstruktora.
 */
class P1023 {

    public static void main(String[] args) {

        Osoba[] osobe = {
            new Student("Marko"),
            new Osoba("Stanko"),
            new Osoba("Franko"),
        };

        for (Osoba element : osobe) {
            System.out.println(element.getIme());
        }

    }
}

class Osoba {

    private String ime;

    public Osoba(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }
}

class Student extends Osoba {

    public Student(String ime) {
      super(ime);
    }

    public Student() {
//        super();
        this("Pero");
    }

}