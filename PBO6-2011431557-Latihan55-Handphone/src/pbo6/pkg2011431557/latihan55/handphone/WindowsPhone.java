/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431557.latihan55.handphone;

/**
 *
 * @author Funtsu
 */
public class WindowsPhone extends Handphone {
     private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getWpKeyStore() {
        return wpKeyStore;
    }
    public void setWpKeyStore(String wpKeyString) {
        this.wpKeyStore = wpKeyString;
    }
}
