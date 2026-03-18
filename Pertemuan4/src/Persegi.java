/* Nama File        : BangunDatar.java
 * Deskripsi        : berisi atribut dan method dalam class Persegi
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 12 Maret 2026
 */

public class Persegi extends BangunDatar {
    /******ATRIBUT******/
    private double sisi;

    /******METHOD******/
    // KONSTRUKTOR
    public Persegi(){
        setJmlSisi(4);
    }

    //KONSTRUKTOR OVERLOAD
    public Persegi(double sisi, String Warna, String border){
        super(4,Warna,border);
        this.sisi = sisi;
    }

    /******GETTER & SETTER******/

    //SELEKTOR
    public double getSisi(){
        return sisi;
    }
    //MUTATOR
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi= " + sisi);
    }

}
