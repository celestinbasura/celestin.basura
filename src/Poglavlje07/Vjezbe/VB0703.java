/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje07.Vjezbe;

import java.util.Scanner;

/**
 *
 * @author Celestin
 */
public class VB0703 {    
 public static void main(String[] args) {
   int[] polje = new int[10];
   for(int i = 0; i < 10; i++){
       polje[i] = (int) (Math.random() * 100);
   }  
   int i = 0;
   while(i < polje.length-1){
       i++;
       System.out.println(polje[i]);
  }
}
}
