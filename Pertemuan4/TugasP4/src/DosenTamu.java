import java.time.*;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tglLahir,
                     LocalDate tmt, double gajiPokok,
                     String fakultas, String nidk,
                     LocalDate tglAkhirKontrak){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP              : " + nip);
        System.out.println("NIDK             : " + nidk);
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + formatTanggal(tglLahir));
        System.out.println("TMT              : " + formatTanggal(tmt));
        System.out.println("Jabatan          : Dosen Tamu");
        System.out.println("Fakultas         : " + fakultas);
        System.out.println("Akhir Kontrak    : " + formatTanggal(tglAkhirKontrak));
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : " + hitungTunjangan());
    }
}