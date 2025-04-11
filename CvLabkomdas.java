// Kelas CvLabkomdas yang berisi logika perhitungan harga jaket
public class CvLabkomdas {
    // Deklarasi harga tetap untuk masing-masing tipe jaket
    public final int hargaA = 100000;
    public final int hargaB = 125000;
    public final int hargaC = 175000;
    // Method untuk menghitung total harga berdasarkan tipe jaket dan jumlah
    public int hitungHargaTotal(char tipe, int jumlah) {
        int harga = 0; // Variabel untuk menyimpan harga per jaket
        // Struktur kontrol switch untuk menentukan harga berdasarkan tipe
        switch (tipe) {
            case 'A':
                // Jika jumlah lebih dari 100, diskon berlaku (harga jadi 95000)
                harga = (jumlah > 100) ? 95000 : hargaA;
                break;
            case 'B':
                // Jika jumlah lebih dari 100, diskon berlaku (harga jadi 120000)
                harga = (jumlah > 100) ? 120000 : hargaB;
                break;
            case 'C':
                // Jika jumlah lebih dari 100, diskon berlaku (harga jadi 160000)
                harga = (jumlah > 100) ? 160000 : hargaC;
                break;
            default:
                // Jika tipe tidak valid, cetak pesan error dan kembalikan 0
                System.out.println("Tipe jaket tidak valid!");
                return 0;
        }
        // Mengembalikan hasil perkalian harga per jaket dengan jumlah
        return harga * jumlah;
    }
}