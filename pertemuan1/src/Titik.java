/* Nama File        : Titik.java
 * Deskripsi        : berisi atribut dan method dalam class titik
 * pembuat          : Shifa Buja Jauza
 * Tanggal          : 19 Februari 2026
 */

public class Titik {
    /******ATRIBUT******/
    double absis;
    double ordinat;
    
    /******METHOD******/
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
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
}

