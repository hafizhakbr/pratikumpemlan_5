public class BahanOperasiMatematika {
    public static void main(String[] args) {
      OperasiMatematika OperasiMatematika = new OperasiMatematika();
        // Contoh penggunaan method static
        System.out.println("Penjumlahan: " + OperasiMatematika.tambah(10, 5));
        System.out.println("Pengurangan: " + OperasiMatematika.kurang(10, 5));
        // Contoh penggunaan method non-static
        System.out.println("Perkalian: " + OperasiMatematika.kali(10, 5));
        System.out.println("Pembagian: " + OperasiMatematika.bagi(10, 5));
        // Contoh penggunaan method sederhana
        System.out.println("Pecahan 4/8 disederhanakan menjadi: " + OperasiMatematika.sederhana(4, 8));
    }
}