public class OperasiMatematika {    
    // Method static untuk penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }
    // Method static untuk pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }
    // Method non-static untuk perkalian
    public double kali(double a, double b) {
        return a * b;
    }
    // Method non-static untuk pembagian
    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak diizinkan.");
            return Double.NaN; // NaN (Not a Number) untuk menandakan hasil tak terdefinisi
        }
        return a / b;
    }
    // Method non-static untuk menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        int faktor = faktorPersekutuanTerbesar(pembilang, penyebut);
        return (pembilang / faktor) + "/" + (penyebut / faktor);
    }
    // Method untuk mencari faktor persekutuan terbesar (FPB)
    private int faktorPersekutuanTerbesar(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}