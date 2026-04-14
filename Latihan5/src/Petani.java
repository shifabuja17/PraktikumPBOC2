import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunKerja = (int) ChronoUnit.YEARS.between(this.tgl_mulai_kerja, LocalDate.now());
        int C = 1; 
        return tahunKerja + C;
    }

    @Override
    public double hitungPajak() {
        return 0.0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("--- Data Petani ---");
        super.cetakInfo();
        System.out.println("Asal Kota       : " + asal_kota);
    }
}