/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje09.Primjeri.p0910;

import Poglavlje09.Primjeri.p0910.klase.Asistent;
import Poglavlje09.Primjeri.p0910.klase.Profesor;
import Poglavlje09.Primjeri.p0910.klase.Student;

/**
 * Primjer p0911
 * Nasljeđivanje klasa
 */
public class p0911 {

    public static void main(String[] args) {

        Student st = new Student();
        Asistent as = new Asistent();
        Profesor pf = new Profesor();

        st.setIme("Charlie Sheen");
        as.setIme("Bruce Lee");
        pf.setIme("Chuck Norris");

        System.out.println(st.statusStudenta());
        System.out.println("Ime: " + st.getIme());
        
        System.out.println(as.statusStudenta());
        System.out.println("Ime: " + as.getIme());

        System.out.println(pf.statusProfesora());
        System.out.println("Ime: " + pf.getIme());

    }
}
