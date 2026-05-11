public class StackSurat {
    Surat[] stack;
    int top, size;
 
    StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }
 
    boolean isFull() {
        return top == size - 1;
    }
 
    boolean isEmpty() {
        return top == -1;
    }
 
    void push(Surat s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }
 
    Surat pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
 
    Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
 
    // Cari surat berdasarkan nama mahasiswa
    Surat cari(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }
}
