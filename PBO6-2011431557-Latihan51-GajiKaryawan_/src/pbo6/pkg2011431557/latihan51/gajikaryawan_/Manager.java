/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011431557.latihan51.gajikaryawan_;

/**
 *
 * @author
 * Nama : Rido Dwi Laksono
 * Kelas : PBO FS112B
 * NIM : 2022436243
 */


import java.util.Scanner;  // Import the Scanner class


public class Manager extends Karyawan {
    
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran, totalGaji;

    public int getKehadiran() {
        return kehadiran;
    }
    
    public void setKehadrian(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    
    public float TunjanganGolongan(int golongan) {
       
        switch (golongan) {
            case 1:
                return tunjanganGolongan = 500000;
            case 2:
                return tunjanganGolongan = 1000000;
            case 3:
                return tunjanganGolongan = 1500000;
            default:
                return tunjanganGolongan = 0;
         }
    }
    
    public float TunjanganJabatan(String jabatan) {
        switch (jabatan) {
            case "Manager":
                return tunjanganJabatan = 2000000;
            case "Kabag":
                return tunjanganJabatan = 1000000;
            default:
                return tunjanganJabatan = 0;
         }
    }
    
    public float TunjanganKehadiran(int kehadiran) {
       return tunjanganJabatan = kehadiran * 10000;
    }
    
    public float totalGaji(float golongan, float kehadiran, float jabatan) {
        
        return totalGaji = golongan + kehadiran + jabatan;
    }
 
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager data;
        data = new Manager();
        System.out.println("====== Program Penghitungan Gaji Karyawan  ======");
        System.out.println("");
        System.out.print("Masukan Nik : ");
        data.setNik(input.nextLine());
        System.out.print("Masukan Nama : ");
        data.setNama(input.next());
        System.out.print("Masukan Golongan (1/2/3) : ");
        data.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        data.setJabatan(input.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        data.setKehadrian(input.nextInt());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        data.tampilKaryawan();
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN   :" + data.TunjanganGolongan(data.getGolongan()));
        System.out.println("TUNJANGAN JABATAN    :" + data.TunjanganJabatan(data.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN  :" + data.TunjanganKehadiran(data.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL :" + data.totalGaji(data.TunjanganGolongan(data.getGolongan()), data.TunjanganJabatan(data.getJabatan()), data.TunjanganKehadiran(data.getKehadiran())));
        
    }
    
}
