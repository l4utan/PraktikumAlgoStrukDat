public class QueueMahasiswa {
    private NodeMahasiswa head;
    private NodeMahasiswa tail;
    private int size;
    private final int KAPASITAS = 5;

    public QueueMahasiswa() {
        head = null;
        tail = null;
        size = 0;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Cek antrian penuh
    public boolean isFull() {
        return size == KAPASITAS;
    }

    // Mengosongkan antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan mahasiswa ke belakang antrian (enqueue)
    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan mahasiswa.");
            return;
        }
        NodeMahasiswa newNode = new NodeMahasiswa(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    // Memanggil / mengeluarkan mahasiswa dari depan antrian (dequeue)
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil.");
            return null;
        }
        Mahasiswa dipanggil = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Mahasiswa dipanggil: " + dipanggil.nama);
        return dipanggil;
    }

    // Menampilkan antrian terdepan (peek head)
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: " + head.data);
        }
    }

    // Menampilkan antrian paling akhir (peek tail)
    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir: " + tail.data);
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantri
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    // Menampilkan seluruh isi antrian
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Antrian ===");
        NodeMahasiswa temp = head;
        int urutan = 1;
        while (temp != null) {
            System.out.println(urutan + ". " + temp.data);
            temp = temp.next;
            urutan++;
        }
    }
}
