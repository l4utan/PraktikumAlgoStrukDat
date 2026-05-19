public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size;
    int max;
    int totalDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void cekKosong() {
        System.out.println(isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
    }

    public void cekPenuh() {
        System.out.println(isFull() ? "Antrian penuh" : "Antrian belum penuh");
    }

    public void kosongkan() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int dipanggil = Math.min(2, size);
        System.out.println("Memanggil " + dipanggil + " mahasiswa untuk proses KRS:");
        for (int i = 0; i < dipanggil; i++) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDiproses++;
            System.out.print((i + 1) + ". ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int tampil = Math.min(2, size);
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Mahasiswa paling akhir:");
        data[rear].tampilkanData();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void cetakTotalDiproses() {
        System.out.println("Total mahasiswa yang sudah proses KRS: " + totalDiproses);
    }

    public void cetakBelumProses() {
        // max DPA = 30, sisa yang belum diproses dari kuota DPA
        int belum = 30 - totalDiproses;
        System.out.println("Mahasiswa belum proses KRS (dari kuota DPA): " + belum);
    }
}