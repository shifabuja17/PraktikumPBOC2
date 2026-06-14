import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        // 2. Mengisi data ke dalam Map
        mahasiswaMap.put("240601230001", "Adi");
        mahasiswaMap.put("240601230002", "Bambang");
        mahasiswaMap.put("240601230003", "Cici");
        mahasiswaMap.put("240601230004", "Didi");

        System.out.println("Daftar Mahasiswa (NIM dan Nama):");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " -> Nama: " + nama);
        });
    }
}