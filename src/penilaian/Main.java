package penilaian;


public class Main {
    public static void main(String[] args) {
        NilaiAkhir NilaiAkhir = new NilaiAkhir("Elyhan Sirait", "2110010617",82,84,86);
        
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : "+NilaiAkhir.getNama());
        System.out.println("NPM : "+NilaiAkhir.getNpm());
        System.out.println("Nilai Akhir : "+NilaiAkhir.hitungNilaiAkhir());
    }
}
