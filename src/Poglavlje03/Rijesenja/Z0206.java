/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Marijan Matic - NetAkademija
 */
package Poglavlje02.Rijesenja;

/**
 * Zadatak Z0206
 * Napisati program koji ra�una nul-to�ke kvadratne jednad�be i u slu�aju da je
 * diskriminanta (D = b^2 - 4ac) manja on nule ispisuje rije�enja u kompleksnom
 * obliku.
 *
 * Napomena: Koristiti se pomo�nim metodama klase java.lang.Math za
 * izra�unavanje korijena neke vrijednosti. Ova metoda vra�a rezultat koji
 * mo�emo spremiti u neku varijablu.
 *
 * double korijen = Math.sqrt(vrijednost);
 * double kvadrat = Math.pow(baza, eksponent);
 */
public class Z0206 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();
        System.out.print("Unesite c: ");
        int c = sc.nextInt();

        double disk = Math.pow(b, 2) - 4 * a * c;
        double komp = Math.sqrt(Math.abs(disk)) / (2.0 * a);
        double x1 = ((-1.0) * b) / (2.0 * a); //-det
        double x2 = ((-1.0) * b) / (2.0 * a); //+det

        System.out.println(x1);

        if(disk > 0) {
            x1 = x1 - komp;
            x2 = x2 + komp;
            System.out.printf("Jedn. ima slijedeca REALNA rijesenja:"
                    + "\n x1 = %.3f\n x2 = %.3f", x1, x2);
        }
        else {
            System.out.printf("Jedn. ima slijedeca KOMPLEKSNA rijesenja:"
                    + "\n x1 = %.3f - %.3fi\n x2 = %.3f + %.3fi", x1, komp, x2, komp);
        }

    }
}
