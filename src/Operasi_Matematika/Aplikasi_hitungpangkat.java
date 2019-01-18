package Operasi_Matematika;

public class Aplikasi_hitungpangkat {

    //membuat fungsi fasil penjumlahan()
    //static : kita membuat fungsi yang dapat dipanggil nggak harus membuat instansiasi objek
    //void : tipe data kosong, fungsi tersebut nggak mengembalikan nilai apa-apa
    //hasilpenjumlahan() : nama fungsi
    static void hasilpenjumlahan() {
        //membuat variabel x dan y bertipe integer
        int x = 1;
        int y;

        //fungsi Match.pow digunakan untuk menghitung bilangan berpangkat
        //rumus : Match.pow(angka,pangkat)
        y = (int) ((int) Math.pow(5 * x, 4) - Math.pow(2 * x, 3) + Math.pow(x, 2) + 7 * x + 10);

        //hasil akhir variabel y
        System.out.println("Hasil dari y = 5x^4 - 2x^3 + x^2 + 7x + 10 adalah : " + y);

        System.out.println("Nama          : Fajar Ega Firmansyah");
        System.out.println("Program Studi : Sistem Informasi");
    }

    public static void main(String[] args) {
        //memanggil atau eksekusi fungsi hasilpenjumlahan()
        hasilpenjumlahan();
    }

}
