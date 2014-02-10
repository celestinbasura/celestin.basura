/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje13.Vjezbe.V1301;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cbasura
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj = 0;
        int rez = 0;
        System.out.println("Unesite broj :");

        try {
            broj = sc.nextInt();
            rez = (int) Math.pow(broj, 2);
            System.out.println("Kvadrat broja " + broj + " je " + rez);
            
        } catch (InputMismatchException ex) {
            System.out.println("Morate unijeti broj ");
            
        } finally {
            System.out.println("Hvala na koristenju programa. ");
        }
    }
}
