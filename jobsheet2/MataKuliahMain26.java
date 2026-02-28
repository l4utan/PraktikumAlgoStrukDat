package jobsheet2;

public class MataKuliahMain26 {
    public static void main(String[] args) {
        MataKuliah26 matkul1 = new MataKuliah26();
        matkul1.kodeMk = "ASD";
        matkul1.nama = "Algoritma Struktur Data";
        matkul1.sks = 4;
        matkul1.jumlahJam = 4;
        matkul1.tampilInformasi();

        MataKuliah26 matkul2 = new MataKuliah26("PASD", "Pratikum Algoritma Struktur Data", 4, 4);
        matkul2.tampilInformasi();

        matkul1.ubahSks(6);
        matkul1.tambahJam(3);
        matkul1.kurangiJam(1);
        matkul1.tampilInformasi();

        matkul2.ubahSks(8);
        matkul2.tambahJam(4);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
    }
}
