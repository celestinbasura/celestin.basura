/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje09.Vjezbe.V0991;

/**
 *
 * @author Celestin
 */
public class Osoba {
    
    private String oib;
    private String ime;
    private String prezime;
    private boolean isSet = false;
    
    public String stanje(){
    
        return this.ime + "  " + this.prezime + "  " + this.getOIB();
    }
    
    public void setOIB(String noviOIB){
        if(!isSet){
            oib = noviOIB;
            isSet = true;
        }
    }
    public String getOIB(){
        return oib;
    }
    
    public void setIme(String novoIme, String novoPrezime){
        ime = novoIme;
        prezime = novoPrezime;
    }
    @Override
    public boolean equals (Object obj){
        
        Osoba o = (Osoba)obj;
        
        if(!(obj instanceof Osoba)){
            return false;
        }
        if(obj == null){
            return false;
        }
        if(this.oib.equals(o.getOIB()) ){
           return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Osoba o1 = new Osoba();
        Osoba o2 = new Osoba();
        Osoba o3 = new Osoba();
        
        o1.setIme("Marko", "Marulic");
        o1.setOIB("7898");
        o2.setIme("Ivan", "Ivancek");
        o2.setOIB("7898");
        o3.setIme("Stjepan", "Mile");
        o3.setOIB("787");
        o1.setOIB("785555");
        System.out.println(o1.stanje());
        System.out.println(o2.stanje());
        System.out.println(o3.stanje());
        
        
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));
        System.out.println(o1.equals(o2));
        
        
        
    }
}
