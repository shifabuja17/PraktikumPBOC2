package Seminar;
/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

public class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}