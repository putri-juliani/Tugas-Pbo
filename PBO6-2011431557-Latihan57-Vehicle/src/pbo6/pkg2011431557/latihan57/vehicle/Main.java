/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431557.latihan57.vehicle;

/**
 *
 * Nama : Harris Munahar
 * Kelas : PBO FS112B
 * NIM : 2022436280
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        Skateboard s = new Skateboard();
        
        b.setMybrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : " + b.getMybrand());
        System.out.println("Model : " + b.getmyModel());
        System.out.println("Jumlah Gear : " + b.getGearCount());
        
        s.setMybrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setBoardLength(54.4);
        
        System.out.println();
        
        System.out.println("Bicycle");
        System.out.println("Brand : " + s.getMybrand());
        System.out.println("Model : " + s.getmyModel());
        System.out.println("Jumlah Gear : " + s.getBoardLength());
        
        
        
        
    }
    
}
