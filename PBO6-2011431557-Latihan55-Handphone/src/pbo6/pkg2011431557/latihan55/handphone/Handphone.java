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
public class Handphone {
     protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct() {
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStrore("234ibfd3840fo");
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        
        System.out.println("Manufaktur  : " + a.manufacture);
        System.out.println("OS  : " + a.operatingSystem);
        System.out.println("Model   : " + a.model);
        System.out.println("Harga   : " + a.harga);
        System.out.println("Android Key Store   : " + a.getKeyStore());
        System.out.println("");
        
        System.out.println("Manufaktur  : " + bb.manufacture);
        System.out.println("OS  : " + bb.operatingSystem);
        System.out.println("Model   : " + bb.model);
        System.out.println("Harga   : " + bb.harga);
        System.out.println("PIN   : " + bb.getPinBB());
        System.out.println("");
        
        System.out.println("Manufaktur  : " + wp.manufacture);
        System.out.println("OS  : " + wp.operatingSystem);
        System.out.println("Model   : " + wp.model);
        System.out.println("Harga   : " + wp.harga);
        System.out.println("Wp Key Store   : " + wp.getWpKeyStore());
        System.out.println("");
    }
    
}
