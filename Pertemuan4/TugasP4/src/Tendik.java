import java.time.*;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tglLahir,
                  LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungPensiun(){
        return tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan(){
        int masaKerja = Period.between(tmt, LocalDate.now()).getYears();
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP              : " + nip);
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + formatTanggal(tglLahir));
        System.out.println("TMT              : " + formatTanggal(tmt));
        System.out.println("Jabatan          : Tendik");
        System.out.println("Bidang           : " + bidang);
        System.out.println("Masa Kerja       : " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun  : " + formatTanggal(hitungPensiun()));
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : " + hitungTunjangan());
    }
}