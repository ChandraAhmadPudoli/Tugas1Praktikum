package Pertemuan4;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai hasil = new Nilai();

        hasil.nim = 2210631170114l;
        hasil.nama = "Chandra Ahmad Pudoli";
        hasil.absen = 98;
        hasil.tugas = 95;
        hasil.UTS = 97;
        hasil.UAS = 98;

        new Nilai();

        hasil.CetakNilai();
    }
}
