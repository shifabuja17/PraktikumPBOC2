/* Nama File        : Mahasiswa.java
 * Deskripsi        : berisi atribut dan method dalam class Mahasiswa
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 5 Maret 2026
 */

public class Mahasiswa {
    /******ATRIBUT******/
    private String NIM;
    private String nama;
    private String prodi;

    /******METHOD******/
    //Konstruktor tanpa parameter
    Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor
    Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    /******GETTER & SETTER******/
    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNIM(String X){
        NIM = X;
    }

    public void setNama(String Y) {
        nama = Y;
    }

    public void setProdi(String Z) {
        prodi = Z;
    }


}
