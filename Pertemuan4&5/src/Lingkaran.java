/* Nama File        : Lingkaran.java
 * Deskripsi        : berisi atribut dan method dalam class Lingkaran
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 12 Maret 2026
 */



public class Lingkaran extends BangunDatar implements IResize {
    /******ATRIBUT******/
    private double Jari;

    /******METHOD******/
    @Override
    public void zoomIn(){
        Jari = Jari * 1.1;
    }
    @Override
    public void zoomOut(){
        Jari = Jari * 0.9;
    }
    @Override
    public void zoom(int percent){
        Jari = Jari * (percent/100);
    }

    //KONSTRUKTOR
    public Lingkaran(){
        setJmlSisi(0);
    }

    //KONSTRUKTOR OVERLOAD
    public Lingkaran(double Jari, String Warna, String border){
        super(0,Warna,border);
        this.Jari = Jari;
    }


    //GETTER & SETTER

    public double getJari(){
        return Jari;
    }

    public void setJari(double Jari){
        this.Jari = Jari;
    }

    public double getLuas(){
        return Math.PI * Jari * Jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * Jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-Jari= " + Jari);
    }

}
