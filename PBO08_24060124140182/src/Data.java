public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data(T[] contohRuang) {
        ruang = contohRuang;
        banyak = 0;
    }

    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T objek) {
        if (ruang[posisi - 1] == null) {
            banyak++;
        }

        ruang[posisi - 1] = objek;
    }

    public int getSize() {
        return banyak;
    }
}