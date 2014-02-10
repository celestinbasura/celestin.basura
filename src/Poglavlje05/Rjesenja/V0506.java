/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak @ NetAkademija.
 */
 
package Poglavlje05.Rjesenja;

/**
 * V0506
 * Program koji odgovara na sljede�a pitanja:
 * Da li je legalno overloadanje ako imamo metode istog imena gdje jedna prima int kao parametar, a druga prima kao parametar Integer?
 * Koja �e biti pozvana ako nam je argument kod poziva primitivni tip?
 *
 * @author Tomislav Novak
 * @version 1.0
 */
public class V0506 {
    public static void main(String[] args) {
            
        method(5);
        
    }
    
    /**
     * Metoda koja prima Wrapper klasu primitivnog tipa int.
     * @param parametar Integer tip.
     */
    static void method(Integer parametar) {
        System.out.println("Izabrao je Integer!");
    }
    
    /**
     * Metoda koja prima primitivni tip int.
     * @param parametar primitivni tip int.
     */
    static void method(int parametar) {
        System.out.println("Izabrao je int!");
    }
    
}
