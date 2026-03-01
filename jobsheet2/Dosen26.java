package jobsheet2;

public class Dosen26 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen26() {

    }

    public Dosen26(String nm, String id, boolean stts, String bidAhli, int tahunGabung) {
        nama = nm;
        idDosen = id;
        statusAktif = stts;
        bidangKeahlian = bidAhli;
        tahunBergabung = tahunGabung;
    }

    void tampilInformasi() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status: " + statusAktif);
    }

    void setStatusAktif(boolean status) {
        if (statusAktif != status) {
            statusAktif = status;
        } else {
            System.out.println("Status sudah sesuai");
        }
    }

    int hitungMasaKerja(int tahunSkrng) {
        int masaKerja = tahunSkrng - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
