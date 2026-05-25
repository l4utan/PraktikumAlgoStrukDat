public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + " | Nama: " + nama + " | Kelas: " + kelas + " | IPK: " + ipk;
    }
} 