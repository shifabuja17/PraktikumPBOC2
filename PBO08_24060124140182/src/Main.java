public class Main {
    public static void tampilkanAnabul(Anabul a) {
        a.gerak();
        a.bersuara();

    if (a instanceof Kucing) {
        ((Kucing) a).printbobot();
    }
    }

    public static void main(String[] args) {
        // KELAS GENERIK
        Datum<Anabul> data = new Datum<>(new Kucing("Mimi", 3.5));

        tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Kiki", 4.2));
        tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Kembangtelon("Momo", 5.1));
        tampilkanAnabul(data.getIsi());
        System.out.println();

         // METHOD GENERIK
        System.out.println("Prosedur Tukar");

        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kitty", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Doggy"));

        OperatorGenerik.Tukar(hewan1, hewan2);

        tampilkanAnabul(hewan1.getIsi());
        tampilkanAnabul(hewan2.getIsi());

        System.out.println();

        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        OperatorGenerik.Tukar(angka1, angka2);

        System.out.println(angka1.getIsi()); // 6
        System.out.println(angka2.getIsi()); // 3

        //3. KELAS DATA
        System.out.println("Aplikasi Kelas Data");

        Data<String> dataNama = new Data<>(new String[10]);

        dataNama.setIsi(1, "Andi");
        dataNama.setIsi(2, "Budi");
        dataNama.setIsi(10, "Citra");

        System.out.println("Isi posisi 1: " + dataNama.getIsi(1));
        System.out.println("Isi posisi 2: " + dataNama.getIsi(2));
        System.out.println("Isi posisi 10: " + dataNama.getIsi(10));
        System.out.println("Banyak elemen efektif: " + dataNama.getSize());

        // b. setIsi dengan objek Anabul
        System.out.println("Aplikasi setIsi Anabul");

        Data<Anabul> dataHewan = new Data<>(new Anabul[100]);

        dataHewan.setIsi(1, new Kucing("Mimi", 3.5));
        dataHewan.setIsi(2, new Anjing("Doggy"));
        dataHewan.setIsi(3, new Burung("Cici"));

        // c. getIsi dengan objek Anabul
        System.out.println("\nAplikasi getIsi Anabul");

        Anabul hewanA = dataHewan.getIsi(1);
        Anabul hewanB = dataHewan.getIsi(2);
        Anabul hewanC = dataHewan.getIsi(3);

        hewanA.gerak();
        hewanA.bersuara();

        hewanB.gerak();
        hewanB.bersuara();

        hewanC.gerak();
        hewanC.bersuara();

        // d. getSize dengan objek Anabul
        System.out.println("\nJumlah elemen efektif: " + dataHewan.getSize());

    }
}