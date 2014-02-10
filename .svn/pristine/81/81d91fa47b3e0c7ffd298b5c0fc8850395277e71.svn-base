/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje13.Vjezbe.VJ2Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Celestin
 */
public class Log {
 Logger logging1;
    
    // kreiranje singleton objekta
    
    private static Log instance = null;
    
    
    public static Log getInstance() {
    
        if(instance == null) {
        
            instance = new Log();
        }
        return instance;
    }
    private Log(){
        try{
            logging1 = Logger.getLogger("FirstLogger");
            logging1.addHandler(new FileHandler("MojLog1.log"));
            logging1.addHandler(new FileHandler("MojLog2.log"));
            Level logLevel = Level.ALL;      
            logging1.setLevel(logLevel);
        }
        catch(IOException e){
            System.out.println("File nije moguce kreirati");            
        }
        catch(SecurityException e){
            System.out.println("File nije moguce kreirati iz sigurnosnih razloga");            
        }
        
    }
   
    public void logSevere(String logText){
        logging1.log(Level.SEVERE, logText);
        System.err.println("SEVERE: " + logText);
    }
    public void logInfo(String logText){
        logging1.log(Level.INFO, logText);  
        System.err.println("INFO: " + logText);
    }
    public void logAll(String logText){
        logging1.log(Level.ALL, logText); 
        System.err.println("ALL: " + logText);
    }
}
