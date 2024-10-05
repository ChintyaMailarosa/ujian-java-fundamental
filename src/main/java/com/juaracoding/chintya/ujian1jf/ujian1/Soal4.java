package com.juaracoding.chintya.ujian1jf.ujian1;

import java.util.Scanner;
public class Soal4 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] film = new String[5];

            // Meminta pengguna untuk memasukkan nama film
            for (int i = 0; i < film.length; i++) {
                System.out.print("Masukkan nama film ke-" + (i + 1) + ": ");
                film[i] = scanner.nextLine();
            }

            // Mencetak nama-nama film yang telah dimasukkan
            System.out.println("\nDaftar film yang ingin Anda tonton:");
            for (String namaFilm : film) {
                System.out.println(namaFilm);
            }

            scanner.close();
        }
    }


