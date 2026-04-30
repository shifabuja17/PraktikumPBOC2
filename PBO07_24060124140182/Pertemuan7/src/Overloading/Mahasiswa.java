package Overloading;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    // c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // d. Konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // e. Konstruktor kloning (1 parameter objek Mahasiswa lain)
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Varian 1: Set Program Studi tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // Varian 2: Set Program Studi dengan 1 parameter string
    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    // Varian 3: Set Program Studi dengan 1 parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void cetakData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programStudi);
    }
}