import java.util.Scanner;

public class DosenDemo25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen25 data = new DataDosen25();
        int pilihan;

        do {
            System.out.println("\n====== MENU DATA DOSEN ======");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (termuda ke tertua)");
            System.out.println("4. Sorting DSC (tertua ke termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Kode          : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    boolean jk = sc.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int usia = Integer.parseInt(sc.nextLine());

                    data.tambah(new Dosen25(kode, nama, jk, usia));
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n====== DATA DOSEN ======");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
