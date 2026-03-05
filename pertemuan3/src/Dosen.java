/* Nama File        : Dosen.java
 * Deskripsi        : berisi atribut dan method dalam class Dosen
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 5 Maret 2026
 */


public class Dosen {
    /******ATRIBUT******/
    private String NIP;
    private String nama;
    private String prodi;

    /******METHOD******/
    Dosen(){
        this.NIP = "";
        this.nama = "";
        this.prodi = "";
    }

    Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    /******GETTER & SETTER******/  
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNIP(String X) {
        NIP = X;
    }

    public void setnama(String Y) {
        nama = Y;
    }

    public void setprodi(String Z) {
        prodi = Z;
    }
}


