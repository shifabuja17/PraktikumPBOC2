package Seminar;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    // b. Konstruktor Seminar
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    // c. Fungsi countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // d. Prosedur registrasi (kontigu)
    public void registrasi(Civitasakademika pesertaBaru) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = pesertaBaru;
            banyakPeserta++;
            System.out.println("Berhasil registrasi: " + pesertaBaru.getNama());
        } else {
            System.out.println("Maaf, kuota seminar sudah penuh!");
        }
    }

    // g. Prosedur tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n=== Daftar Peserta Seminar ===");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }

    // h. Fungsi countMahasiswa (menggunakan instanceof)
    public int countMahasiswa() {
        int hitung = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                hitung++;
            }
        }
        return hitung;
    }
}