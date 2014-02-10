/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2012 Tomislav Novak - NetAkademija
 */

import java.util.Date;

/**
 * P0641
 * Primjer formatiranja stringova.
 */
public class P0641 {

    public static void main(String[] args) {

        Double d = 1234.1234;

        char c = 'x';

        String str = "Drugi string.";

        Date dt = new Date();
        
        String formatString =
                String.format("Double: %5.2f\nZnak je: %c\nString: %s\nDan: %tA\n", d, c, str, dt);

        System.out.print(formatString);

    }
}
