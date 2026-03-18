/* Nama File        : BangunDatar.java
 * Deskripsi        : berisi atribut dan method dalam class Bangun Datar
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 12 Maret 2026
 */


// public final class BangunDatar {
//     /******ATRIBUT******/
//     private int jmlSisi;
//     private String Warna;
//     private String border;
//     private static int CounterBangunDatar = 0;


public class BangunDatar {
    /******ATRIBUT******/
    protected int jmlSisi;
    protected String Warna;
    protected String border;
    protected static int CounterBangunDatar = 0;

    /******METHOD******/

    //KONSTRUKTOR
    public BangunDatar(){
        this.jmlSisi = 0;
        this.Warna = "";
        this.border = "";
        CounterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String Warna, String border){
        this.jmlSisi = jmlSisi;
        this.Warna = Warna;
        this.border = border;
        CounterBangunDatar++;
    }
    //SELEKTOR
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return Warna;
    }

    public String getBorder(){
        return border;
    }

    //MUTATOR
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String Warna){
        this.Warna = Warna;
    }

    public void setBorder(String border){
        this.border = border;
    }


    // public final void printInfo(){
    //     System.out.println("Jumlah Sisi= " + getJmlSisi());
    //     System.out.println("Warna=" + getWarna());
    //     System.out.println("Border=" + getBorder());
    // }

    public void printInfo(){
        System.out.println("Jumlah Sisi= " + getJmlSisi());
        System.out.println("Warna=" + getWarna());
        System.out.println("Border=" + getBorder());
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + CounterBangunDatar);
    }
}
