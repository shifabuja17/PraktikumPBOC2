package Anabul;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing bernama " + nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing bernama " + nama + " berbunyi meong.");
    }
}