/* Nama File    : MGaris.java
 * Deskripsi    : Main driver untuk menguji class Garis dan interaksinya dengan class Titik
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(4, 6);

        System.out.println("=== 1. Menguji Konstruktor Default ===");
        Garis g1 = new Garis();
        System.out.print("Garis g1: ");
        g1.printGarisTitik();
        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Gradien g1: " + g1.getGradien());
        g1.persamaanGradien();

        System.out.println("\n=== 2. Menguji Konstruktor dengan Parameter ===");
        Garis g2 = new Garis(t1, t2);
        System.out.print("Garis g2: ");
        g2.printGarisTitik();
        System.out.println("Panjang g2: " + g2.getPanjang());
        System.out.println("Gradien g2: " + g2.getGradien());
        
        System.out.print("Titik Tengah g2: ");
        Titik tengahG2 = g2.getGarisTengah();
        tengahG2.printTitik();
        g2.persamaanGradien();

        System.out.println("\n=== 3. Menguji Mutator (Setter) dan Selektor (Getter) ===");
        Titik t3 = new Titik(2, 5);
        System.out.println("Mengubah titik akhir g1 menjadi (2,5)...");
        g1.setTitikAkhir(t3);
        System.out.println("Titik akhir g1 sekarang: (" + g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n=== 4. Menguji Hubungan Dua Garis ===");
        Garis gSejajar = new Garis(new Titik(0, 1), new Titik(1, 2)); // Gradien = 1
        Garis gTegakLurus = new Garis(new Titik(0, 1), new Titik(1, 0)); // Gradien = -1

        System.out.print("Garis Sejajar: ");
        gSejajar.printGarisTitik();
        System.out.print("Garis Tegak Lurus: ");
        gTegakLurus.printGarisTitik();

        System.out.println("Apakah gSejajar sejajar dengan gTegakLurus? " + gSejajar.isSejajar(gTegakLurus));
        System.out.println("Apakah gSejajar tegak lurus dengan gTegakLurus? " + gSejajar.isTegakLurus(gTegakLurus));

        System.out.println("\n=== 5. Menguji Counter Objek Static ===");
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}