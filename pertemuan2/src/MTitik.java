public class MTitik {

    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = new Titik();
        System.out.print("Titik T2:");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(-3,4);
        T3.printTitik();
        System.out.println(Titik.getcounterTitik());

        System.out.println("Kuadran T3:" + T3.getKuadran());
        System.out.println("jarak pusat T2:" + T2.getJarakPusat());
        System.out.println("Jarak T3:" + T3.getJarak(T3));

    }
}
