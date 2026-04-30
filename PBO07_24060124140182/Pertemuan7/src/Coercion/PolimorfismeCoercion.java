package Coercion;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class PolimorfismeCoercion {
    public static void main(String[] args) {
        // a. Ilustrasi konsep polimorfisme (Coercion) dasar
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = nilaiInt;
        
        System.out.println("--- Poin A: Ilustrasi Dasar ---");
        System.out.println("Nilai Integer : " + nilaiInt);
        System.out.println("Nilai Karakter: " + nilaiChar);
        System.out.println("Nilai Double  : " + nilaiDouble);

        // b. Mengembalikan real ke integer di variabel berbeda
        double nilaiReal = 65.0;
        int nilaiKembali = (int) nilaiReal;
        
        System.out.println("\n--- Poin B: Real ke Integer ---");
        System.out.println("Nilai Real    : " + nilaiReal);
        System.out.println("Kembali ke Int: " + nilaiKembali);

        // c. Konkatenasi vs Penjumlahan (String X dan Y)
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // Konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // Penjumlahan angka
        
        System.out.println("\n--- Poin C: String X dan Y ---");
        System.out.println("Konkatenasi S : " + S);
        System.out.println("Penjumlahan Z : " + Z);

        // d. Konkatenasi vs Penjumlahan (String P dan Q)
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // Konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // Penjumlahan angka
        
        System.out.println("\n--- Poin D: String P dan Q ---");
        System.out.println("Konkatenasi R : " + R);
        System.out.println("Penjumlahan D : " + D);

        // e. Objek Integer A dari konversi nilai S
        // Perlu try-catch atau Long karena "12345678" masih masuk batas int, tapi jika melebihi batas bisa error.
        // Di sini nilainya 12345678, masih aman untuk Integer.
        Integer A = Integer.parseInt(S);
        System.out.println("\n--- Poin E: Konversi S ke Integer A ---");
        System.out.println("Nilai A       : " + A);

        // f. Objek String T dari konversi nilai A
        String T = A.toString();
        System.out.println("\n--- Poin F: Konversi A ke String T ---");
        System.out.println("Nilai T       : " + T);
    }
}