package jobsheet3;

public class Dosen26 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen26() {

    }

    public Dosen26(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;

    }

    public void cetakInfo() {
        System.out.println("Kode          : " + this.kode);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + this.usia);
        System.out.println("------------------------------");
    }

    public void dataSemuaDosen(Dosen26[] arrayDosen){
        System.out.println("\n===== DATA DOSEN =====");
        int nomor = 1;
        for (Dosen26 dosen : arrayDosen) {
            System.out.println("Data Dosen ke-" + nomor);
            dosen.cetakInfo();
            nomor++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen26[] arrayDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen26 dosen : arrayDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
        System.out.println("------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayDosen) {
        int totalUsiaPria = 0, jumlahPria = 0;
        int totalUsiaWanita = 0, jumlahWanita = 0;

        for (Dosen26 dosen : arrayDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria   = jumlahPria   > 0 ? (double) totalUsiaPria / jumlahPria     : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\n===== RATA-RATA USIA DOSEN PER JENIS KELAMIN =====");
        System.out.println("Rata-rata Usia Dosen Pria   : " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rerataUsiaWanita);
        System.out.println("--------------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen26[] arrayDosen) {
        Dosen26 palingTua = arrayDosen[0];

        for (Dosen26 dosen : arrayDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }

        System.out.println("\n===== DOSEN PALING TUA =====");
        palingTua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen26[] arrayDosen) {
        Dosen26 palingMuda = arrayDosen[0];

        for (Dosen26 dosen : arrayDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }

        System.out.println("\n===== DOSEN PALING MUDA =====");
        palingMuda.cetakInfo();
    }
}
