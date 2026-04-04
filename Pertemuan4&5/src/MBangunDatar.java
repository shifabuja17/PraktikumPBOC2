public class MBangunDatar {
    public static void main(String[] args){
        Persegi A1 = new Persegi();
        A1.setSisi(43);
        A1.setWarna("Kuning");
        A1.setBorder("Merah");

        System.out.println(A1.getSisi());
        System.out.println(A1.getWarna());
        System.out.println(A1.getBorder());

        Lingkaran B1 = new Lingkaran();
        B1.setJari(6);
        B1.setWarna("Biru");
        B1.setBorder("Hijau");

        System.out.println(B1.getJari());
        System.out.println(B1.getWarna());
        System.out.println(B1.getBorder());
        System.out.println(B1.getKeliling());
        System.out.println(B1.getLuas());

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Putih");

        

        System.out.println(P1.getLuas());
        System.out.println(L1.getKeliling());
        System.out.println(P1.isEqualLuas(L1));
        System.out.println(P1.isEqualKeliling(L1));


        
        ((IResize) P1).zoomIn();
        ((IResize) L1).zoomOut();
        ((IResize) P1).zoom(150);
        System.out.println(P1.getLuas());
        System.out.println(L1.getLuas());

    }
}
