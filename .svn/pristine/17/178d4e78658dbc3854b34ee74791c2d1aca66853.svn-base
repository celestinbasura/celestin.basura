/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1320;

class p1322 extends p1321 {

    /**
     * Metoda može baciti i više iznimki.
     *
     * Metoda podklase koja overrida metodu koja baca iznimku mora baciti
     * iste iznimke koje su deklarirane u metodi nadklase ili može
     * izostaviti deklaraciju iznimki, ali nesmije baciti više iznimki
     * ili šire iznimke.
     *
     * @throws MojException opis uvjeta da se iznimka pojavi
     * @throws MojDrugiException opis uvjeta da se iznimka pojavi
     */
    public void drugaMetoda() throws MojException, MojDrugiException {

        metodaBacaIznimku();
        throw new MojDrugiException();

    }

    @Override
    public void metodaBacaIznimku() throws MojDrugiException{
        
        
    }
    
    
}
