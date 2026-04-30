package Overloading;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("=== Uji Konstruktor ===");
        // Uji Konstruktor c
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.cetakData();

        // Uji Konstruktor d
        Mahasiswa mhs2 = new Mahasiswa("24060124140182", "Shifa Buja Jauza", "Informatika");
        mhs2.cetakData();

        // Uji Konstruktor e (Kloning)
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        System.out.print("Hasil Kloning: ");
        mhs3.cetakData();

        System.out.println("\n=== Uji Method Overloading setProgramStudi ===");
        // Uji Varian 1
        mhs1.setProgramStudi();
        System.out.print("Varian 1 (Tanpa parameter): ");
        mhs1.cetakData();

        // Uji Varian 2
        mhs1.setProgramStudi("Sistem Informasi");
        System.out.print("Varian 2 (Parameter String): ");
        mhs1.cetakData();

        // Uji Varian 3
        mhs1.setProgramStudi(mhs2); // Mengambil prodi dari mhs2 (Informatika)
        System.out.print("Varian 3 (Parameter Objek): ");
        mhs1.cetakData();
    }
}