/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje13.Vjezbe.V1303;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author cbasura
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        do {
            try {
                suma += parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ulaz nije pogodan za prebacaj u int");
            }
        } while (!sc.nextLine().equalsIgnoreCase("end"));

        System.out.println("Suma uneseniih brojeva je " + suma);
    }
}
