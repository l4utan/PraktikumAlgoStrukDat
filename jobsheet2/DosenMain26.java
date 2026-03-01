package jobsheet2;

public class DosenMain26 {
    public static void main(String[] args) {
        Dosen26 dsn1 = new Dosen26();
        dsn1.nama = "Samsul Sulaiman";
        dsn1.idDosen = "SS";
        dsn1.bidangKeahlian = "Algoritma Struktur Data";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2017;

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("Agama");
        dsn1.hitungMasaKerja(2026);
        System.out.println("-----------------------------------");
        dsn1.tampilInformasi();
        System.out.println("--------------------");

        Dosen26 dsn2 = new Dosen26("Mubarok Muslim", "MM", false, "Desain Antarmuka", 2012);
        dsn2.tampilInformasi();
        dsn2.ubahKeahlian("Fiqih");
        dsn2.hitungMasaKerja(2026);
        dsn2.setStatusAktif(true);
        System.out.println("-----------------");
        dsn2.tampilInformasi();
        
    }
}
