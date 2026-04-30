package Seminar;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null; // Bisa diset nanti
    }

    @Override
    public String getNomor() {
        return nim;
    }

    // i. Prosedur setWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // j. Prosedur tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum diatur";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}