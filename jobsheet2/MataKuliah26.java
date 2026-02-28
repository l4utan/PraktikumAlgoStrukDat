package jobsheet2;

public class MataKuliah26 {
    String kodeMk, nama;
    int sks, jumlahJam;

    public MataKuliah26() {

    }

    public MataKuliah26(String kodeMk, String nm, int sks, int totJam) {
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = totJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (!(jumlahJam < jam)) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan");        }
    }
}
