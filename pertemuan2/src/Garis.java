/* Nama File        : Garis.java
 * Deskripsi        : berisi atribut dan method dalam class garis
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 26 Februari 2026
 */

public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris;

    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Garis(){
        this(new Titik(0,0), new Titik(1,1));
    }
}
