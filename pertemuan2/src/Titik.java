/* Nama File        : Titik.java
 * Deskripsi        : berisi atribut dan method dalam class titik
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 26 Februari 2026
 */

public class Titik {
    /******ATRIBUT******/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    /******METHOD******/
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
        counterTitik++;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return this.absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return this.ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double absis){
        this.absis = absis;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Overloading
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

        //Mengembalikan nilai counterTitik
    static int getcounterTitik(){
        return counterTitik;
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Jarak ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Jarak ke titik lain
    double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Refleksi terhadap sumbu X (mengubah objek ini)
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Refleksi terhadap sumbu Y (mengubah objek ini)
    void refleksiY() {
        this.absis = -this.absis;
    }

    // Menghasilkan objek baru hasil refleksi X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghasilkan objek baru hasil refleksi Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    static int getCounterTitik() {
        return counterTitik;
    }
}

