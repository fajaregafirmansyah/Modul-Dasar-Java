package Belajar_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        //import fungsi untuk input menggunakan Scanner
        Scanner input = new Scanner(System.in);

        //header atau bisa disebut judul program yang menjelaskan isi program
        System.out.println("=======================================");
        System.out.println("Program penjumlahan menggunakan Scanner");
        System.out.println("=======================================");

        //input nilai ke-1 tipe data integer
        System.out.print("Masukan Angka pertama : ");
        int nilai1 = input.nextInt();

        //input nilai ke-2 tipe data integer
        System.out.print("Masukan Angka kedua   : ");
        int nilai2 = input.nextInt();

        //nilai ke-1 dan nilai ke-2 di ditambahkan
        int hasil = nilai1 + nilai2;

        //hasil
        System.out.println("Hasil dari penjumlahan " + nilai1 + " + " + nilai2 + " adalah : " + hasil);

        System.out.println("");
        //header atau bisa disebut judul program yang menjelaskan isi program
        System.out.println("==================================================");
        System.out.println("Program perjumlahan menggunakan UserBufferedReader");
        System.out.println("==================================================");

        //import fungsi untuk input menggunakan BufferedReader
        InputStreamReader input2 = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input2);

        //deklarasi variabel
        int angka1 = 0;
        int angka2 = 0;

        //menangani jika error dalam java bisa menggunakan try..catch
        try {
            //input angka ke-1 tipe data integer
            System.out.print("Masukan Angka pertama : ");
            angka1 = Integer.parseInt(bufferedReader.readLine());

            //input angka ke-2 tipe data integer
            System.out.print("Masukan Angka kedua   : ");
            angka2 = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {

        }

        //angka ke-1 dan angka ke-2 di ditambahkan
        int hasilnya = angka1 + angka2;

        //hasil
        System.out.println("Hasil dari penjumlahan " + angka1 + " + " + angka2 + " adalah : " + hasilnya);

    }

}
