public class Member {
    private static final String DEFAULT_NAMA = "Member Tanpa Nama";
    private static final String DEFAULT_NO_TELEPON = "0000000000";
    private static final String DEFAULT_TANGGAL = "01-01-2026";
    private static final String DEFAULT_JENIS_PAKET = "Basic";
    private static final int MIN_PANJANG_TELEPON = 10;

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Constructor lengkap untuk membuat objek Member dengan empat parameter.
     * Pengisian atribut memanfaatkan setter agar melalui proses validasi.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pertama kali daftar
     * @param jenisPaket jenis paket keanggotaan (Basic, Premium, VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        // Set nilai awal ke default aman terlebih dahulu
        this.nama = DEFAULT_NAMA;
        this.noTelepon = DEFAULT_NO_TELEPON;
        this.tanggalDaftar = DEFAULT_TANGGAL;
        this.jenisPaket = DEFAULT_JENIS_PAKET;

        // Panggil setter agar lolos validasi
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor tanpa paket keanggotaan.
     * Menggunakan constructor chaining untuk mengisi jenisPaket secara otomatis menjadi "Basic".
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pertama kali daftar
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_JENIS_PAKET);
    }

    /**
     * Mengambil nama lengkap member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member. Nama tidak boleh null, kosong, atau hanya berisi spasi.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("[VALIDASI GAGAL] Nama tidak boleh kosong atau hanya berisi spasi!");
        } else {
            this.nama = nama.trim();
        }
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }
}
