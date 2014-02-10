/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje13.Vjezbe.VJ1Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Celestin
 */
public class Main {

    public static void main(String[] args) throws IOException {
        CharLogger testChar = new CharLogger();
        Logger log = Logger.getLogger("Loger");
        try {
            log.addHandler(new FileHandler("spoookyTipke.log"));
        } catch (IOException e) {
            log.log(Level.SEVERE, "Greska sa file-om", e);
        }
        Level logLevel = Level.ALL;
        InputStreamReader inStream = new InputStreamReader(System.in);
        while (true) {
            char charValue = (char) inStream.read();

            if (testChar.isSamoglasnik(charValue)) {
                log.log(Level.SEVERE, "Ovo je samoglasnik");
                System.out.println(charValue);
            }
            if (Character.isAlphabetic(charValue) && !testChar.isSamoglasnik(charValue)) {
                log.log(Level.FINER, "Ovo je suglasnik");
                System.out.println(charValue);
            }
            if (!Character.isAlphabetic(charValue)) {
                log.log(Level.INFO, "Ovo je sve osim slova");
                System.out.println(charValue);
            }

        }

    }

}
