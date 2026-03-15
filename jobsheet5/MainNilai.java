import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int elemen = sc.nextInt();

        Nilai nl = new Nilai(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan data nilai mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nilai uts: ");
            nl.nilaiUts[i] = sc.nextDouble();
            System.out.print("Masukkan nilai uas: ");
            nl.nilaiUas[i] = sc.nextDouble();
        }
        System.out.println("Nilai UTS tertinggi: " + nl.nilaiTertinggiDC(nl.nilaiUts, 0, elemen-1));
        System.out.println("Nilai UTS terendah: " + nl.nilaiTerendahDC(nl.nilaiUts, 0, elemen-1));
        System.out.println("Rata-rata nilai: " + nl.nilaiRataRataBF());
    }
}
