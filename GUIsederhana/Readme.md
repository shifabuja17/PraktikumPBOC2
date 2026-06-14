# GUISederhana - Aplikasi GUI Java Swing & Java Collections Framework

Folder `GUISederhana` berisi serangkaian latihan praktikum pemrograman berbasis objek (PBO) yang berfokus pada pembangunan Graphical User Interface (GUI) berbasis desktop menggunakan komponen **Java Swing** di lingkungan NetBeans (menggunakan file `.form` dan `.java`). Proyek-proyek ini mendemonstrasikan bagaimana antarmuka visual berinteraksi secara dinamis dengan struktur data **Java Collections Framework** (`List`, `Set`, dan `Map`) melalui perantara `DefaultListModel`.

## 📁 Struktur Konten Folder

Folder ini terdiri dari 4 proyek/latihan utama yang masing-masing dilengkapi dengan file rancangan NetBeans (`.form`) dan file kode sumber Java (`.java`):

1. **`latihanJFrame`** (Dasar Input GUI)
   - **Deskripsi:** Antarmuka dasar untuk menambahkan elemen baru ke dalam komponen daftar visual (`JList`).
   - **Komponen Utama:** `JList` (`jListItem`), `JTextField` (`jTextFieldNamaItem`), `JButton` (`jButtonAdd`).
   - **Fitur:** Mengambil input teks dari pengguna dan menambahkannya ke model daftar (`DefaultListModel`) secara dinamis.

2. **`GUISederhana2`** (Operasi CRUD Dasar pada JList)
   - **Deskripsi:** Pengembangan dari latihan dasar untuk memanipulasi item langsung pada komponen visual secara penuh.
   - **Fitur Utama:**
     - **Insert Data:** Mengisi daftar secara otomatis dengan data bawaan (`buku`, `meja`, `kursi`, `tas`, `pintu`).
     - **Add:** Menambahkan data baru dari field teks.
     - **Update:** Mengubah item yang sedang dipilih di `JList` dengan nilai baru dari field teks.
     - **Delete:** Menghapus item tertentu yang dipilih dari daftar.
     - **Clear All:** Mengosongkan seluruh isi daftar visual.

3. **`Proyek3`** (Sinkronisasi UI dengan ArrayList)
   - **Deskripsi:** Menghubungkan visualisasi `JList` dengan penampung data internal berupa objek `List<String>` (`ArrayList`).
   - **Fitur Utama:**
     - Memuat kumpulan data awal saat program pertama kali diinisialisasi.
     - Menyediakan tombol **Save Data** yang berguna untuk menyalin data aktif dari `DefaultListModel` komponen visual ke dalam `ArrayList` internal.
     - Menampilkan indikator jumlah data aktual yang berhasil disimpan dalam koleksi lewat label (`Data tersimpan = X`).

4. **`Proyek4`** (Integrasi Multi-Collection: List, Set, & Map)
   - **Deskripsi:** Proyek komprehensif yang mensimulasikan perbandingan karakteristik perilaku tiga jenis Collection utama di Java saat berinteraksi dengan GUI.
   - **Struktur Data Terlibat:**
     - `List<String> listItems = new ArrayList<>();` (Mengizinkan duplikasi data).
     - `Set<String> setItems = new HashSet<>();` (Unik, otomatis mengeliminasi duplikasi data).
     - `Map<Integer, String> mapItems = new HashMap<>();` (Menyimpan pasangan Key-Value menggunakan indeks integer).
   - **Mekanisme Kerja:**
     - Memiliki data awal dengan beberapa nilai duplikat (seperti `"meja"` dan `"tas"` yang muncul beberapa kali).
     - Tombol **`save to ... ->`** mengekstrak item dari komponen `JList` ke koleksi pilihan. Saat disimpan ke `Set`, duplikat otomatis tereliminasi sehingga jumlah data tersimpan bernilai lebih sedikit (`7 data`) dibandingkan dengan `List` atau `Map` (`9 data`).
     - Tombol **`<- insert to ...`** memuat kembali (*append*) seluruh elemen dari koleksi internal pilihan ke dalam tampilan `JList`.

---

## 🛠️ Persyaratan Sistem & Dependensi

- **Java Development Kit (JDK):** Versi 8 atau lebih baru (mendukung Swing dan fitur lambda expression/method reference standar).
- **IDE:** NetBeans IDE (direkomendasikan) agar file rancangan tampilan GUI (`.form`) dapat terbuka dan diedit via tab *Design*.

---

## 🚀 Cara Menjalankan Proyek

1. Buka folder/project ini di dalam **NetBeans IDE**.
2. Pastikan letak file `.java` dan `.form` berada dalam package/direktori yang sama agar komponen visual NetBeans GUI builder terbaca dengan baik.
3. Klik kanan pada salah satu file master class utama (misalnya `Proyek4.java`) lalu pilih **Run File** (atau tekan tombol kombinasi `Shift + F6`).

---

## 💡 Konsep PBO Penting yang Dipelajari

- **Separation of Concerns via DefaultListModel**: Pemisahan peran antara penampung model data (`DefaultListModel`) dengan komponen presentasi visual (`JList`) mengikuti prinsip dasar arsitektur MVC (Model-View-Controller).
- **Data Binding & Sinkronisasi**: Alur bagaimana perubahan pada elemen visual ditransfer ke koleksi memori jangka pendek (`ArrayList`, `HashSet`, `HashMap`) dan sebaliknya melalui penanganan event aksi.
- **Karakteristik Koleksi**: Pembuktian langsung secara visual bahwa `Set` tidak menyimpan elemen duplikat, sedangkan `List` mempertahankan urutan masuk beserta duplikatnya.
- **Method References**: Kode program memanfaatkan referensi method gaya Java modern (seperti `this::jButtonAddActionPerformed`) untuk penanganan aksi tombol (*Event Handling*).