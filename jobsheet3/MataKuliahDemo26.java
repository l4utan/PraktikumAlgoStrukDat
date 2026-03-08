package jobsheet3;

import java.util.Scanner;
public class MataKuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMatkul;
        
        System.out.print("Masukkan jumlah matakuliah: ");
        jumlahMatkul = sc.nextInt();
        MataKuliah26[] arrayOfMataKuliah = new MataKuliah26[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah26();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("------------------------------");
            
        }

        for (int i = 0; i < jumlahMatkul; i++) {
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
