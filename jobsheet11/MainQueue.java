import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        QueueMahasiswa queue = new QueueMahasiswa();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Daftar antrian (enqueue)");
            System.out.println("2. Panggil mahasiswa (dequeue)");
            System.out.println("3. Cek antrian kosong");
            System.out.println("4. Cek antrian penuh");
            System.out.println("5. Lihat antrian terdepan");
            System.out.println("6. Lihat antrian paling akhir");
            System.out.println("7. Tampilkan semua antrian");
            System.out.println("8. Jumlah mahasiswa mengantri");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : "); String nim = sc.nextLine();
                    System.out.print("Nama   : "); String nama = sc.nextLine();
                    System.out.print("Kelas  : "); String kelas = sc.nextLine();
                    System.out.print("IPK    : "); double ipk = sc.nextDouble(); sc.nextLine();
                    queue.enqueue(new Mahasiswa(nim, nama, kelas, ipk));
                    break;
                case 2: queue.dequeue(); break;
                case 3: System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong."); break;
                case 4: System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh."); break;
                case 5: queue.lihatTerdepan(); break;
                case 6: queue.lihatTerakhir(); break;
                case 7: queue.tampilAntrian(); break;
                case 8: queue.jumlahAntrian(); break;
                case 9: queue.clear(); break;
                case 0: System.out.println("Keluar..."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
