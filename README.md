# tugas1-fittrack
# Tugas 1 Praktikum PBO - Sistem Keanggotaan Gym FitTrack

* **Nama:** Raymond
* **NPM:** [Isi NPM Kamu]
* **Kelas:** [Isi Kelas Praktikum Kamu]

## Deskripsi Singkat
Aplikasi pendataan anggota berbasis Java untuk Gym FitTrack. Sistem ini bertujuan membantu digitalisasi pencatatan data member secara terstruktur dan mencegah kesalahan input data member melalui proses validasi di tingkat objek.

## Fitur Utama
* Validasi input otomatis untuk nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
* Dukungan pembuatan akun otomatis dengan paket default "Basic" jika tidak ditentukan.
* Perlindungan data dari input tidak valid (data lama tetap terjaga saat update gagal).
* Penampilan seluruh daftar keanggotaan dalam format yang rapi.

## Konsep OOP yang Diterapkan
| Konsep OOP | Lokasi Penerapan | Alasan Penerapan |
| --- | --- | --- |
| Encapsulation | Class `Member` | Menyembunyikan atribut (`private`) dan menyediakan akses teratur melalui Getter/Setter yang tervalidasi. |
| Constructor Overloading | Class `Member` | Memudahkan pembuatan objek dengan parameter fleksibel (dengan atau tanpa paket). |
| Method Overriding | Method `toString()` | Menghasilkan representasi String berlabel yang rapi. |
| DRY (Don't Repeat Yourself) | Setter & Constructor | Memusatkan validasi di Setter sehingga Constructor tinggal memanggil Setter tanpa menduplikasi logika. |

## Penjelasan Nilai Default
Ketika data tidak valid dimasukkan saat pembuatan objek (constructor dipanggil), nilai default aman akan digunakan sementara:
* `nama`: `"Member Tanpa Nama"`
* `noTelepon`: `"0000000000"`
* `tanggalDaftar`: `"01-01-2026"`
* `jenisPaket`: `"Basic"`

*Alasan:* Hal ini bertujuan agar objek tetap bisa terbentuk dengan aman tanpa membuat program *crash* (berhenti mendadak).