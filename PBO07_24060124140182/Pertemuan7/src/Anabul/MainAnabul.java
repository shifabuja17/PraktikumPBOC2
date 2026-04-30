package Anabul;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {
        // Polimorfisme Inclusion: Parent reference mengarah ke Child object
        Anabul peliharaan1 = new Kucing("Mochi");
        Anabul peliharaan2 = new Anjing("Boni");
        Anabul peliharaan3 = new Burung("Rio");

        System.out.println("=== Simulasi Gerakan ===");
        peliharaan1.gerak();
        peliharaan2.gerak();
        peliharaan3.gerak();

        System.out.println("\n=== Simulasi Suara ===");
        peliharaan1.bersuara();
        peliharaan2.bersuara();
        peliharaan3.bersuara();
    }
}