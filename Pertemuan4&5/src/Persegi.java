/* Nama File        : BangunDatar.java
 * Deskripsi        : berisi atribut dan method dalam class Persegi
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 12 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    /******ATRIBUT******/
    private double sisi;

    /******METHOD******/

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }
    @Override
    public void zoom(int percent){
        sisi = sisi * (percent/100);
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }
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
