/* Nama File        : MataKuliah.java
 * Deskripsi        : berisi atribut dan method dalam class MataKuliah
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 5 Maret 2026
 */

public class MataKuliah {
    /******ATRIBUT******/
    private String idMatkul;
    private String nama;
    private int sks;
    
    /******METHOD******/
    MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    MataKuliah (String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /******GETTER & SETTER******/  
    public String getidMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getsks() {
        return sks;
    }

    public void setidMatkul(String X) {
        idMatkul = X;
    }

    public void setnama(String Y) {
        nama = Y;
    }

    public void setsks(int Z) {
        sks = Z;
    }


}
