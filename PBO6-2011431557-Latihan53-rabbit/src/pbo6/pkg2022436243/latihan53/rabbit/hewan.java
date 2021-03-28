/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022436243.latihan53.rabbit;


/**
 *
 * @author
 * Nama : Putri juliani
 * Kelas : PBO FS112B
 * NIM : 2011431557
 */

public class hewan {
    public static void main(String[] args) {
       rabbits r = new rabbits("Peter", false, "grass", 4, "grey");
       
       System.out.println("Hello, his name is " + r.getName());
       System.out.println(r.getName() + " is vegetarian? " + r.isVegetarian());
       System.out.println(r.getName() + " eats " + r.getEats());
       System.out.println(r.getName() + " has " + r.getNoOfLegs() + " legs");
       System.out.println(r.getName() + " color is " + r.getColor());
    }
    
}
