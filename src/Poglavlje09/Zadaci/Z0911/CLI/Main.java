/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Zadaci.Z0911.CLI;

import Poglavlje09.Zadaci.Z0911.Kutije.FactoryKutija;
import Poglavlje09.Zadaci.Z0911.Kutije.Kutija;
import Poglavlje09.Zadaci.Z0911.Stvari.Cipele;
import Poglavlje09.Zadaci.Z0911.Stvari.Kazete;
import Poglavlje09.Zadaci.Z0911.Stvari.Knjige;

/**
 *
 * @author cbasura
 */
public class Main {
    public static void main(String[] args) {
        
       
        Cipele cip = new Cipele();
        Knjige knj = new Knjige();
        Kazete kaz = new Kazete();
        
        Kutija kutijaCipela = FactoryKutija.napraviKutiju(cip, "Sandale", 0);
        Kutija kutijaKnjiga = FactoryKutija.napraviKutiju(knj);
        Kutija kutijaKazeta = FactoryKutija.napraviKutiju(kaz);
        
    }
}
