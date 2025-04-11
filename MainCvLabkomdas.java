// Import library Scanner untuk input dari user
import java.util.Scanner;
// Kelas utama program
public class MainCvLabkomdas {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);
        // Membuat objek dari kelas CvLabkomdas untuk mengakses method hitungHargaTotal
        CvLabkomdas jaket = new CvLabkomdas();
        // Meminta user memasukkan tipe jaket
        System.out.print("Masukkan tipe jaket (A/B/C): ");
        // Membaca input tipe jaket, mengubah ke huruf kapital, dan mengambil karakter pertama
        char tipe = scanner.next().toUpperCase().charAt(0);
        // Meminta user memasukkan jumlah jaket yang ingin dibeli
        System.out.print("Masukkan jumlah jaket: ");
        // Membaca input jumlah jaket
        int jumlah = scanner.nextInt();
        // Menghitung total harga berdasarkan input tipe dan jumlah
        int total = jaket.hitungHargaTotal(tipe, jumlah);
        // Jika total lebih dari 0 (input valid), tampilkan total harga
        if (total > 0) {
            System.out.println("Total harga: Rp " + total);
        }
    }
}
