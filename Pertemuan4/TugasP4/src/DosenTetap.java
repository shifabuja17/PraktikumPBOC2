import java.time.*;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tglLahir,
                      LocalDate tmt, double gajiPokok,
                      String fakultas, String nidn){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate hitungPensiun(){
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan(){
        int masaKerja = Period.between(tmt, LocalDate.now()).getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP              : " + nip);
        System.out.println("NIDN             : " + nidn);
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + formatTanggal(tglLahir));
        System.out.println("TMT              : " + formatTanggal(tmt));
        System.out.println("Jabatan          : Dosen Tetap");
        System.out.println("Fakultas         : " + fakultas);
        System.out.println("Masa Kerja       : " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun  : " + formatTanggal(hitungPensiun()));
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : " + hitungTunjangan());
    }
}