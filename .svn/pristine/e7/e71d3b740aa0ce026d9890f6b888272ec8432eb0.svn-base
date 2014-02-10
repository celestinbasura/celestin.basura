/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje13.Vjezbe.V1302;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cbasura
 */
public class Main {

    public static void main(String[] args) {
        int[] polje = new int[10];
        int index = 0;
        int vrijednost = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                index = sc.nextInt();
                vrijednost = sc.nextInt();
                polje[index] = vrijednost;

            } catch (InputMismatchException e) {
                System.out.println("Scanner je prazan");
                sc.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                if (index != -1) {
                    System.out.println("Polje je premalo za tebe");
                }
            }

        } while (index != -1);

        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d ", polje[i]);
        }
    }

}
