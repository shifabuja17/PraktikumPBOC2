/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis 
 * Pembuat      : Muhammad Abhista Pratama Sava / 24060124130058
 * Tanggal      : Kamis, 26 Februari 2026
*/

public class Garis {

    /********** ATRIBUT **********/
    Titik titik_awal;
    Titik titik_akhir;
    static int counterGaris = 0;

    /********** METHOD ***********/
    /* Konstruktor */
    public Garis(Titik t1, Titik t2) {
        this.titik_awal = t1;
        this.titik_akhir = t2;
        counterGaris++;
    }

    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    /* Mutator */
    void setTitikAwal(Titik t) {
        this.titik_awal = t;
    }

    void setTitikAkhir(Titik t) {
        this.titik_akhir = t;
    }

    /* Selektor */
    Titik getTitikAwal() {
        return this.titik_awal;
    }

    Titik getTitikAkhir() {
        return this.titik_akhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double getPanjang() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    double getGradien() {
        double deltaY = getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat();
        double deltaX = getTitikAkhir().getAbsis() - getTitikAwal().getAbsis();

        double gradien = deltaY / deltaX;
        return gradien;
    }

    Titik getGarisTengah() {
        double absis = (getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2;
        double ordinat = (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    /*********************************/
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    /*********************************/
    void printGarisTitik() {
        System.out.println("Titik Awal: (" + getTitikAwal().getAbsis() + ", " + getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + getTitikAkhir().getAbsis() + ", " + getTitikAkhir().getOrdinat() + ")");
    }

    void persamaanGradien() {
        double m = this.getGradien();
        double c = getTitikAwal().getOrdinat() - m * getTitikAwal().getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
