package com.juaracoding.chintya.ujian1jf.ujian1;

import java.util.Scanner;
public class Soal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tiket = new String[5];
        double hargaTiket = 0;

        // Meminta pengguna untuk memasukkan nama film
        for (int i = 0; i < tiket.length; i++) {
            System.out.print("Masukkan harga tiket film " + (i + 1) + ": ");
            tiket[i] = scanner.nextLine();
        }

        System.out.print("Total harga tiket: ");
        int jumlahTiket = scanner.nextInt();

        double totalHarga = hargaTiket * jumlahTiket;
        System.out.println("Total harga tiket: " + totalHarga);
        }
    }


