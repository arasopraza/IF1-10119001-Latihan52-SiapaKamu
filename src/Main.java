/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung gaji karyawan
 * berkonsep objek oriented dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        mhs.setNama("Arsy Opraza Akma");
        mhs.setUmur(20);
        mhs.setKelas("PBO1");

        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.print("\n");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
