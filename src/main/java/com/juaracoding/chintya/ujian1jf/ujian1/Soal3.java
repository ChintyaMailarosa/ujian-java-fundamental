package com.juaracoding.chintya.ujian1jf.ujian1;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hargaWeekday = 35000.00;
        double hargaWeekend = 45000.00;

        System.out.print("Masukkan jenis hari (weekday/weekend): ");
        String jenisHari = scanner.nextLine().toLowerCase();

        // Menentukan harga tiket per tiket
        double hargaTiket;

        if (jenisHari.equals("weekday")) {
            hargaTiket = hargaWeekday;
        } else if (jenisHari.equals("weekend")) {
            hargaTiket = hargaWeekend;
        } else {
            System.out.println("Jenis hari tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        double totalHarga = hargaTiket * jumlahTiket;

        // Pemberian diskon jika jumlah tiket lebih dari 5
        if (jumlahTiket > 5) {
            totalHarga *= 0.9; // Diskon 10%
        }

        // Menampilkan total harga
        System.out.println("Total harga tiket: " + totalHarga);

        scanner.close();

    }
}
