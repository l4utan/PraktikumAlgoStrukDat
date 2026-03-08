package jobsheet3;

import java.util.Scanner;
public class MataKuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, jumlahMatkul;
        
        System.out.print("Masukkan jumlah matakuliah: ");
        jumlahMatkul = sc.nextInt();
        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");
            
            arrayOfMataKuliah[i] = new MataKuliah26(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
