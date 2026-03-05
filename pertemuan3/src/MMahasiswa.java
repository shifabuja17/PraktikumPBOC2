public class MMahasiswa {
    public static void main(String[] args) {
        Dosen A1 = new Dosen();
        A1.setNIP("1234");
        A1.setnama("yazid");
        A1.setprodi("hukum");

        System.out.println(A1.getNIP());
        System.out.println(A1.getNama());
        System.out.println(A1.getProdi());


        MataKuliah B1 = new MataKuliah();
        B1.setidMatkul("ABC");
        B1.setnama("yazid");
        B1.setsks(3);

        System.out.println(B1.getidMatkul());
        System.out.println(B1.getNama());
        System.out.println(B1.getsks());

        Kendaraan C1 = new Kendaraan();
        C1.setNoPlat("0878");
        C1.setjenis("Motor");

        System.out.println(C1.getNoPlat());
        System.out.println(C1.getJenis());

        Mahasiswa D1 = new Mahasiswa();
        D1.setNIM("123444");
        D1.setNama("hanzo");
        D1.setProdi("informatika");

        System.out.println(D1.getNIM());
        System.out.println(D1.getNama());
        System.out.println(D1.getProdi());
    }
}
