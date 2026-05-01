public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    private static void tampilkanAnabul(Anabul anabul) {
    anabul.gerak();
    anabul.bersuara();

    if (anabul instanceof Kucing) {
        ((Kucing) anabul).printbobot();
    }
}   
}
