public class TesFitTrack {
    /**
     * Method utama untuk menjalankan program pengujian.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== 1. SKENARIO PEMBUATAN OBJEK DENGAN DATA SALAH ===");
        // Sengaja memasukkan nomor telepon salah dan paket salah saat instansiasi
        Member mGagal = new Member("Budi Santoso", "12345", "10-08-2026", "Gold");
        System.out.println("Data mGagal yang terbentuk saat ini:");
        System.out.println(mGagal);
        System.out.println();

        System.out.println("=== 2. SKENARIO MEMBUAT 4 OBJEK VALID DAN DISIMPAN DALAM ARRAY ===");
        Member[] daftarMember = new Member[4];

        // Object 1: Paket Basic
        daftarMember[0] = new Member("Andi Wijaya", "081234567890", "15-01-2026", "Basic");
        // Object 2: Paket Premium
        daftarMember[1] = new Member("Siti Rahma", "085678901234", "01-02-2026", "Premium");
        // Object 3: Paket VIP
        daftarMember[2] = new Member("Citra Dewi", "087890123456", "10-03-2026", "VIP");
        // Object 4: Menggunakan Constructor tanpa paket (otomatis Basic)
        daftarMember[3] = new Member("Dedi Pratama", "089012345678", "20-03-2026");

        System.out.println("\n=== 3. SKENARIO UJI SETTER DENGAN DATA TIDAK VALID ===");
        System.out.println("Nomor telepon awal Siti: " + daftarMember[1].getNoTelepon());
        System.out.print("Mencoba mengubah nomor telepon Siti dengan format salah ('123'): ");
        daftarMember[1].setNoTelepon("123");
        System.out.println("Nomor telepon Siti setelah percobaan gagal: " + daftarMember[1].getNoTelepon());
        System.out.println("(Terbukti nilai lama tetap dipertahankan)");

        System.out.println("\n=== 4. MENAMPILKAN SELURUH MEMBER MENGGUNAKAN PERULANGAN FOR ===");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}