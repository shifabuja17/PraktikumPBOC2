/* Nama File        : Kendaraan.java
 * Deskripsi        : berisi atribut dan method dalam class Kendaraan
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 5 Maret 2026
 */

public class Kendaraan {
    /******ATRIBUT******/
    private String noPlat;
    private String jenis;

    /******METHOD******/
    //konstruktor tanpa parameter//
    Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor
    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /******GETTER & SETTER******/
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String X) {
        noPlat = X;
    }

    public void setjenis(String Y) {
        jenis = Y;
    }
}
