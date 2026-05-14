/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman A1 = new Teman();
        
        System.out.println("--- Uji Kelas Teman ---");
        A1.addNama("Dimas");
        A1.addNama("Budi");
        A1.addNama("Ayu");
        A1.addNama("Budi");

        System.out.println("Jumlah Teman: " + A1.getNbElm());
        System.out.println("Nama Teman indeks ke-0: " + A1.getNama(0));
        
        System.out.println("\nDaftar Teman (showTeman):");
        A1.showTeman();

        System.out.println("\nApakah 'Ayu' member? " + A1.isMember("Ayu"));
        System.out.println("Jumlah nama 'Budi': " + A1.countNama("Budi"));

        System.out.println("\nMengganti nama 'Dimas' menjadi 'Dika'...");
        A1.gantiNama("Dimas", "Dika");
        
        System.out.println("Menghapus nama 'Ayu'...");
        A1.delNama("Ayu");
        
        System.out.println("\nDaftar Teman Update:");
        A1.showTeman();
        System.out.println("Jumlah Teman sekarang: " + A1.getNbElm());
    }
}