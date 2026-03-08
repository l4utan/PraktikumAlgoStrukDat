package jobsheet3;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen26[] arrayDosen = new Dosen26[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            System.out.println("------------------------------");

            arrayDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        // Tampilkan data dengan FOREACH
        System.out.println("\n===== DATA DOSEN =====");
        int nomor = 1;
        for (Dosen26 dosen : arrayDosen) {
            System.out.println("Data Dosen ke-" + nomor);
            dosen.cetakInfo();
            nomor++;
        }
    }
}
