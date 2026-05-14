/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

import java.util.ArrayList;

public class Teman {
    private int NbElm;
    private ArrayList<String> Lnama;

    public Teman() {
        this.NbElm = 0;
        Lnama = new ArrayList<>();
    }

    public int getNbElm() {
        return NbElm;
    }

    public String getNama(int index) {
        return Lnama.get(index);
    }

    public void setNama(int index, String nama) {
        Lnama.set(index, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        NbElm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            NbElm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}