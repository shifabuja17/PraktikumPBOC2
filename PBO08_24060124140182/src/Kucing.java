/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Kucing extends Anabul {
    protected double bobot;
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public void printbobot() {
        System.out.println("Bobot: " + bobot + " kg");
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