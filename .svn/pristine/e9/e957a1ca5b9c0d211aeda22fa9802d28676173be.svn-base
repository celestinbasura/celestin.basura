/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Zadaci.Z0911.Kutije;

import Poglavlje09.Zadaci.Z0911.Stvari.Cipele;
import Poglavlje09.Zadaci.Z0911.Stvari.Kazete;
import Poglavlje09.Zadaci.Z0911.Stvari.Knjige;

/**
 *
 * @author cbasura
 */
public class FactoryKutija {
    
    private static int izdano = 0;
    
    public static Kutija napraviKutiju(Cipele nekeCip, String tipCipele, int velSportske){
         
        
        
        Kutija k = new KutijaCipela(); 
        
        switch(tipCipele){
            
            case "Cizme": k.setKapacitet(35);
                
                break;
                
            case "Sandale": k.setKapacitet(10);
                
                break;
                
            case "Sportske": 
                
                if(velSportske < 35){
                    k.setKapacitet(10);
                    
                }
                if(velSportske > 35 && velSportske <= 38){
                    k.setKapacitet(12);  
                   
                }
                 if(velSportske > 39 && velSportske <= 42){
                    k.setKapacitet(14); 
                    
                }
                 if(velSportske > 43 && velSportske <= 46){
                    k.setKapacitet(16); 
                    
                }
                if(velSportske > 46){
                    k.setKapacitet(18);
                    
                }
                
        }   
        if(izdano + k.getKapacitet() > 100){
            
            return null;
        }       
        izdano += k.getKapacitet();
        return k;
    }
    
    public static Kutija napraviKutiju(Kazete nekeKaz){
        
        if(izdano + 15 > 100){
            
            return null;
        }
        Kutija k = new KutijaKazeta();
        k.setKapacitet(15);
        izdano += 15;
        return k;
    }
    
    public static Kutija napraviKutiju(Knjige nekeKnj){
        
        
        if(izdano + 20 > 100){
            
            return null;
        }
        
        Kutija k = new KutijaKnjiga();
        k.setKapacitet(20);
        izdano += 20;
        return k;
    }
    
    
}
