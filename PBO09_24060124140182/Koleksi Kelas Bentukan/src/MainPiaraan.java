/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinikHewan = new Piaraan();
        
        Anggora a1 = new Anggora("Ciko", 4.5);
        Kembangtelon k1 = new Kembangtelon("Belang", 3.2);
        Anjing d1 = new Anjing("Heli");
        Burung b1 = new Burung("Rio");

        klinikHewan.enqueueAnabul(a1);
        klinikHewan.enqueueAnabul(d1);
        klinikHewan.enqueueAnabul(k1);
        klinikHewan.enqueueAnabul(b1);

        System.out.println("--- Antrean Klinik Pemeliharaan Hewan ---");
        System.out.println("Jumlah anabul dalam antrean: " + klinikHewan.getNbElm());
        
        System.out.println("\nDaftar Panggilan Anabul (showAnabul):");
        klinikHewan.showAnabul();

        System.out.println("\nDetail Jenis Anabul (showJenisAnabul):");
        klinikHewan.showJenisAnabul();

        System.out.println("\nStatistik Kucing dalam Antrean:");
        System.out.println("Banyaknya keluarga kucing: " + klinikHewan.countKucing() + " ekor");
        System.out.println("Total bobot keluarga kucing: " + klinikHewan.bobotKucing() + " kg");

        System.out.println("\nMemanggil anabul pertama (dequeue)...");
        Anabul dipanggil = klinikHewan.dequeueAnabul();
        System.out.println("Anabul yang dipanggil masuk ruang rawat: " + dipanggil.getNama());
        
        System.out.println("Sisa anabul dalam antrean: " + klinikHewan.getNbElm());
    }
}