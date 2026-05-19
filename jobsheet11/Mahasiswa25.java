public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa25() {

    }

    public Mahasiswa25(String nm, String nama, String kls, double ipk) {
        nim = nm;
        this.nama = nama;
        kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
