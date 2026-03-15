public class Nilai {
    double nilaiUts[], nilaiUas[];
    
    Nilai(int el) {
        nilaiUts = new double[el];
        nilaiUas = new double[el];
    }

    double nilaiTertinggiDC(double arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lmax = nilaiTertinggiDC(arr, l, mid);
        double rmax = nilaiTertinggiDC(arr, mid+1, r);
        return Math.max(lmax, rmax);
    }
    double nilaiTerendahDC(double arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lmin = nilaiTerendahDC(arr, l, mid);
        double rmin = nilaiTerendahDC(arr, mid+1, r);
        return Math.min(lmin, rmin);
    }

    double nilaiRataRataBF() {
        double total = 0;
        for (int i = 0; i < nilaiUas.length; i++) {
            total += nilaiUas[i];
        }
        double rataRata = total/nilaiUas.length;
        return rataRata;
    }
}
