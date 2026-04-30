package Anabul;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung bernama " + nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung bernama " + nama + " berbunyi cuit.");
    }
}