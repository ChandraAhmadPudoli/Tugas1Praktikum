package Pertemuan4;

public class Nilai {
    int absen, tugas, UTS, UAS, akhir;
    long nim;
    String nama;

    int Nilai(){

        akhir = (absen * 10/100) + (tugas * 20/100) + (UTS * 30/100) + (UAS * 40/100);
        return akhir;
    }
        void CetakNilai(){


            System.out.println("NIM             : " + this.nim);
            System.out.println("NAMA            : " + this.nama);
            System.out.println("Nilai Absen     : " + this.nim);
            System.out.println("Nilai UTS       : " + this.UTS);
            System.out.println("Nilai UAS       : " + this.UAS);
            System.out.println("Nilai Akhir     : " + Nilai());
    }
    
}
