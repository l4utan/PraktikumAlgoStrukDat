public class DataDosen25 {

    Dosen25[] dataDosen = new Dosen25[10];
    int idx;

    void tambah(Dosen25 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            System.out.println("--- Dosen ke-" + (i + 1) + " ---");
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort ASC (usia termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen25 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (termuda ke tertua).");
    }

    // Insertion Sort DSC (usia tertua ke termuda)
    void sortingDSC() {
        insertionSort();
        System.out.println("Data berhasil diurutkan DSC (tertua ke termuda).");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen25 tmp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < tmp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }
}
