import java.util.Scanner;

public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa25(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
            "NIM    : " + nim +
            "\nNama     : " + nama +
            "\nKelas    : " + kelas +
            "\nIPK  : " + ipk);
    }

    public static Mahasiswa25 inputMahasiswa25(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // buang newline sisa
        return new Mahasiswa25(nim, nama, kelas, ipk);
    }

}