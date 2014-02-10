/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje12.Zadaci.Z1201;

/**
 *
 * @author Celestin
 */
public enum Znakovi {

    SPADE("\u2660"),
    HEART("\u2665"),
    CLUB("\u2663"),
    DIAMOND("\u2666");

    private String znak;

    Znakovi(String s) {
        this.znak = s;
    }

    @Override
    public String toString() {
        return znak;
    }
}
