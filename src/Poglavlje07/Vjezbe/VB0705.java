/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje07.Vjezbe;

import java.util.Arrays;
import java.util.Scanner;
/**0
 * 
 *
 * @author Celestin
 */
public class VB0705 {
   public static void main(String[] args) {
   int[] polje = new int[10];
   int[] udaljenosti = new int[9];
   int suma = 0;
   for(int i = 0; i < 10; i++){
            System.out.printf("Unesite %d clan polja ", i);
           Scanner sc = new Scanner(System.in);
            polje[i] = sc.nextInt();
   }  
   Arrays.sort(polje);
   for (int i = 0; i < polje.length-1; i++){
       udaljenosti[i] = polje[i+1] - polje[i];
   }
   
   for(int i = 0; i < polje.length; i++){
            System.out.println(polje[i]);
  }
  for (int i = 0; i < udaljenosti.length; i++){
      suma += udaljenosti[i];
  }
  
  System.out.printf("Srednja udaljenost elemenata je %d", suma/9);
   }
}

