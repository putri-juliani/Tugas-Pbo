/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431557.latihan58.tambahkurang;

/**
 *
 * Nama : Harris Munahar
 * Kelas : PBO FS112B
 * NIM : 2022436280
 */
public class Bilangan {
    
    private int x;
    private int y;
    
    public int getX() {
        return 3;
    }
    
    public int getY() {
        return 4;
    }
    
    public void JumlahBilangan() {
        Bilangan b = new Bilangan();
        
        int total;
        total = b.getX() + b.getY();
        
        System.out.println("Hasil Penjumlahan = " + total);
    
    }
    public void SelisihBilangan() {
        Bilangan b = new Bilangan();
        
        int total;
        total = b.getX() - b.getY();
        
        System.out.println("Hasil Selisih " + b.getX() + " - " + b.getY() + " = " + total);
        
    }
    
     public static void main(String[] args) {
         
         Bilangan b = new Bilangan();
         
         b.JumlahBilangan();
         b.SelisihBilangan();
     
     }
    
    
    
    
}
