/**
 * NIM     : 24060124140182
 * Nama    : Shifa Buja Jauza
 * Tanggal : 30 April 2026
 */

import java.util.LinkedList;

public class Piaraan {
    private int NbElm;
    private final LinkedList<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        NbElm = 0;
    }

    public int getNbElm() {
        return NbElm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        NbElm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    public Anabul dequeueAnabul() {
        Anabul removed = Lanabul.pollFirst();
        if (removed != null) {
            NbElm--;
        }
        return removed;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " \t- Jenis: " + a.getClass().getName());
        }
    }
}