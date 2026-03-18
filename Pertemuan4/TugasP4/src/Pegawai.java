import java.time.*;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String formatTanggal(LocalDate tgl){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tgl.format(format);
    }

    public String hitungMasaKerja(){
        Period p = Period.between(tmt, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public abstract void printInfo();
}