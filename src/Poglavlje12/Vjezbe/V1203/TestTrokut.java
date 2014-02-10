/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje12.Vjezbe.V1203;

/**
 *
 * @author Celestin
 */
public class TestTrokut {
    public static void main(String[] args) {
        
        Trokut t = new Trokut();
        
        t.setTocka(32, 2);
        t.setTocka(1, 98);
        t.setTocka(36, 342);
        System.out.println(t.getOpseg());
        System.out.println(t.getTocka());
    }
}
