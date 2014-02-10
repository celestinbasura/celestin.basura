/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje13.Vjezbe.VJ2Logger;

import Poglavlje13.Vjezbe.VJ1Logger.CharLogger;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Celestin
 */
public class Main {
 public static void main(String[] args) throws IOException {
        CharLogger testChar = new CharLogger();
     
        Log logercic = Log.getInstance();
        InputStreamReader inStream = new InputStreamReader(System.in);
        while (true) {
            char charValue = (char) inStream.read();

            if (testChar.isSamoglasnik(charValue)) {
                logercic.logSevere("Ovo je samoglasnik");
                System.out.println(charValue);
            }
            if (Character.isAlphabetic(charValue) && !testChar.isSamoglasnik(charValue)) {
                logercic.logInfo("Ovo je suglasnik");
                System.out.println(charValue);
            }
            if (!Character.isAlphabetic(charValue)) {
                logercic.logAll("Ovo nije slovo");
                System.out.println(charValue);
            }

        }

    }

}
   

