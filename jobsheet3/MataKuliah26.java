package jobsheet3;

import java.util.Scanner;

public class MataKuliah26 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah26(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah26() {

    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam    : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + kode);            
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("------------------------------");
    }
}
