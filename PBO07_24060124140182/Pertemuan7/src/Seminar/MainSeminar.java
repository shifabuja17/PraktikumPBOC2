package Seminar;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class MainSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();

        // e. Buat 2 objek dosen dan 5 objek mahasiswa
        Dosen d1 = new Dosen("Dr. Budi", "19700101");
        Dosen d2 = new Dosen("Prof. Siti", "19650202");

        Mahasiswa m1 = new Mahasiswa("Shifa Buja Jauza", "24060124140182");
        Mahasiswa m2 = new Mahasiswa("Andi", "24060124000001");
        Mahasiswa m3 = new Mahasiswa("Bagas", "24060124000002");
        Mahasiswa m4 = new Mahasiswa("Citra", "24060124000003");
        Mahasiswa m5 = new Mahasiswa("Dewi", "24060124000004");

        // Set Dosen Wali untuk beberapa mahasiswa
        m1.setWali(d1);
        m2.setWali(d2);

        System.out.println("=== Proses Registrasi ===");
        // f. Uji prosedur Registrasi dengan ketujuh objek
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        // Uji fungsi countPeserta
        System.out.println("\nTotal Peserta saat ini: " + sem.countPeserta());

        // g. Tampilkan daftar peserta
        sem.tampilPeserta();

        // h. Uji fungsi countMahasiswa
        System.out.println("\nTotal Peserta Mahasiswa: " + sem.countMahasiswa() + " orang");

        // Uji prosedur tampilDataMahasiswa (khusus untuk objek m1)
        System.out.println("\n=== Detail Data Mahasiswa M1 ===");
        m1.tampilDataMahasiswa();
    }
}