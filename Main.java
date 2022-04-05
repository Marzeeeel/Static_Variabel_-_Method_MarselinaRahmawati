package com.company;

import java.lang.String;

class Mahasiswa {
    String nama;
    static String prodi; // Static Variabel
    static String universitas; // Static Variabel
    static int jumlahMahasiswa; // Static Variabel

    // Constructor
    Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
    }

    // Method
    void display() {
        System.out.println(" \n---------- Data Mahasiswa ----------");
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + Mahasiswa.prodi);
        System.out.println("Universitas   : " + Mahasiswa.universitas);
    }

    // Static Method
    static void displayJumlahMahasiswa(){
        System.out.println ("\nJumlah Mahasiswa : " + Mahasiswa.jumlahMahasiswa);
        System.out.println();
    }

    public class Main {

        public static void main(String[] args) {
            Mahasiswa.prodi = "Teknik Informatika";
            Mahasiswa.universitas = "Universitas Lampung";

            Mahasiswa Mahasiswa1 = new Mahasiswa("Marselina Rahmawati");
            Mahasiswa Mahasiswa2 = new Mahasiswa("Cahaya Tidiazmara");
            Mahasiswa Mahasiswa3 = new Mahasiswa("Nazmah Wulan Rhomadhona");

            Mahasiswa1.display();
            Mahasiswa2.display();
            Mahasiswa3.display();

            Mahasiswa.displayJumlahMahasiswa();
        }
    }
}
