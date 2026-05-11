import java.util.Scanner;

public class SuratDemo {
     public static void main(String[] args) {
        StackSurat stack = new StackSurat(10);
        Scanner sc = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\n=== Menu Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
 
            switch (pilih) {
                case 1 -> {
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S=Sakit, I=Izin): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    stack.push(new Surat(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil diterima.");
                }
 
                case 2 -> {
                    Surat proses = stack.pop();
                    if (proses != null) {
                        System.out.println("\n=== Proses Surat ===");
                        System.out.println("ID Surat     : " + proses.idSurat);
                        System.out.println("Nama         : " + proses.namaMahasiswa);
                        System.out.println("Kelas        : " + proses.kelas);
                        System.out.println("Jenis Izin   : " + (proses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi       : " + proses.durasi + " hari");
                        System.out.println("Status       : Terverifikasi");
                    }
                }
 
                case 3 -> {
                    Surat terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("\n=== Surat Terakhir ===");
                        System.out.println("ID Surat     : " + terakhir.idSurat);
                        System.out.println("Nama         : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas        : " + terakhir.kelas);
                        System.out.println("Jenis Izin   : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi       : " + terakhir.durasi + " hari");
                    }
                }
 
                case 4 -> {
                    System.out.print("Nama mahasiswa: ");
                    String cari = sc.nextLine();
                    Surat hasil = stack.cari(cari);
                    if (hasil != null) {
                        System.out.println("\n=== Surat Ditemukan ===");
                        System.out.println("ID Surat     : " + hasil.idSurat);
                        System.out.println("Nama         : " + hasil.namaMahasiswa);
                        System.out.println("Kelas        : " + hasil.kelas);
                        System.out.println("Jenis Izin   : " + (hasil.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi       : " + hasil.durasi + " hari");
                    } else {
                        System.out.println("Surat atas nama " + cari + " tidak ditemukan.");
                    }
                }
 
                case 0 -> System.out.println("Keluar.");
 
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
