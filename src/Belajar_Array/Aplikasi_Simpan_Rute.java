package Belajar_Array;

import java.util.Scanner;

public class Aplikasi_Simpan_Rute {

    public static void main(String[] args) {
        //deklarasi Boolean routes array 2 dimensi dan isinya 
        Boolean[][] routes = {
            {false, true, false, true, true},
            {true, false, false, false, false},
            {false, false, false, true, true},
            {true, false, true, false, true},
            {true, false, true, true, false}
        };

        for (String b = "y"; b.equals("y") || b.equals("Y");) {

            Scanner scanner = new Scanner(System.in);

            //user input rute 1 
            System.out.print("Masukkan rute 1: ");
            int route1 = scanner.nextInt();

            //user input rute 2
            System.out.print("Masukkan rute 2: ");
            int route2 = scanner.nextInt();

            //proses pengecekan input rute 1 dan input rute 2 
            if (route1 < routes.length && route2 < routes.length) {
                //deklarasi Boolean result
                //inisialisasikan hasil input 1 dan 2 ke dalam Boolean routes array

                Boolean result = routes[route1][route2];
                System.out.println("-------------------------------------------------------");
                System.out.println("Ada rute antara " + route1 + " dan " + route2 + " : " + result);
                System.out.println("-------------------------------------------------------");
            } else {

                //hasil pengecekan jika user input rute 1 dan rute 2 melebihi isi Boolean routes
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Mohon maaf kamu salah menginputkan rute,silahkan coba lagi ya..");
                System.out.println("========================SILAHKAN COBA LAGI=============================");
            }

            System.out.println("");
            System.out.println("Nama          : Fajar Ega Firmansyah");
            System.out.println("Program Studi : Sistem Informasi");
            System.out.println("-------------------------------------------------------");
            System.out.println("");

            System.out.print("Apakah anda mau input rute lainnya ? (Y/T) ");
            //untuk menginput apakah ingin memilih lagi atau tidak
            b = scanner.next();

        }
    }

}
