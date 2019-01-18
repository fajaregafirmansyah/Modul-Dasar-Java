package Belajar_Array;

import java.util.Scanner;

public class Aplikasi_Simpan_Data {

    public static void main(String[] args) {
        // TODO code application logic here

        for (String b = "y"; b.equals("y") || b.equals("Y");) {
            float[][] nilai = new float[3][3];
            Scanner scan = new Scanner(System.in);
            String input;

            // mengisi setiap nilai
            for (int bar = 0; bar < nilai.length; bar++) {
                for (int kol = 0; kol < nilai[bar].length; kol++) {
                    System.out.format("Masukkan nilai index (%d,%d): ", bar, kol);
                    input = scan.nextLine();
                    nilai[bar][kol] = Float.parseFloat(input);;
                }
            }

            // menampilkan isi Array
            System.out.println("-----------------------------------------------");

            for (float[] nilai1 : nilai) {
                for (int kol = 0; kol < nilai1.length; kol++) {
                    System.out.format("| %s | \t", nilai1[kol]);
                }
                System.out.println("");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Nama          : Fajar Ega Firmansyah");
            System.out.println("Program Studi : Sistem Informasi");
            System.out.println("-------------------------------------------------------");

            System.out.print("Apakah anda mau input data lagi ? (Y/T) ");
            //untuk menginput apakah inhin memilih lagi atau tidak
            b = scan.next();
        }
    }

}
