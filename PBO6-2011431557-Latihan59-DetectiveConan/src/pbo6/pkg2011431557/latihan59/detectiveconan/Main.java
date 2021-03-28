package pbo6.pkg2011431557.latihan59.detectiveconan;

import java.util.Scanner;
/**
 * @author
 * Nama : Putri juliani
 * Kelas : PBO FS112B
 * NIM : 2011431557
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        int pilihKategori;
        int pilihTokoh;
        char lagi;

            TokohDetectiveConan tokohDC = new TokohDetectiveConan();
            TokohUtama tokohUtama = new TokohUtama();
            TokohPendukung tokohPendukung = new TokohPendukung();

//            tu.tampilDataTokoh();
        do {
            tokohDC.daftarKategoriTokoh();
            System.out.print("\nPilih nomor kategori : ");
            pilihKategori = scn1.nextInt();

                pilihTokoh = 0;
                if (pilihKategori == 1){
                    tokohUtama.daftarTokohUtama();
                    System.out.print("\nPilih nomor tokoh : ");
                    pilihTokoh = scn2.nextInt();
                }else {
                    tokohPendukung.daftarTokohPendukung();
                    System.out.print("\nPilih nomor tokoh : ");
                    pilihTokoh = scn3.nextInt();
                }

            switch (pilihTokoh) {
                case 1:
                    ShinichiKudo shiKud = new ShinichiKudo();
                    shiKud.tampilDataTokoh();
                    break;
                case 2:
                    RanMouri ranMou = new RanMouri();
                    ranMou.tampilDataTokoh();
                    break;
                case 3:
                    KogoroMouri kogMou = new KogoroMouri();
                    kogMou.tampilDataTokoh();
                    break;
                case 4:
                    AyumiYoshida ayuYos = new AyumiYoshida();
                    ayuYos.tampilDataTokoh();
                    break;
                case 5:
                    MitsuhikoTsuburaya mitTsu = new MitsuhikoTsuburaya();
                    mitTsu.tampilDataTokoh();
                    break;
                case 6:
                    GentaKojima genKoj = new GentaKojima();
                    genKoj.tampilDataTokoh();
                    break;
                case 7:
                    AiHaibara aiHai = new AiHaibara();
                    aiHai.tampilDataTokoh();
                    break;
                case 8:
                    SumikoKobayashi sumKob = new SumikoKobayashi();
                    sumKob.tampilDataTokoh();
                    break;
                case 9:
                    SonokoSuzuki sonSuz = new SonokoSuzuki();
                    sonSuz.tampilDataTokoh();
                    break;
                case 10:
                    HeijiHattori heiHat = new HeijiHattori();
                    heiHat.tampilDataTokoh();
                    break;
                case 11:
                    KazuhaToyama kazToy = new KazuhaToyama();
                    kazToy.tampilDataTokoh();
                    break;
                default:
                    System.out.println("Nomor yang Anda pilih belum tersedia");
                    break;
            }

            System.out.print("\nLagi (y/n)? : ");
            lagi = scn4.next().charAt(0);
            System.out.println(" ");

        }while (lagi != 'n');
    }
}
