package uts_oop_2301010024;

import java.util.Scanner;

/**
 *
 * @author NI LUH YATI SUGIRI PUTRININGSIH
 * Ulangan Tengah Semester
 * TGL: 10 Mei 2025
 */
public class UTS_OOP_2301010024 {
    static Barang[] data = new Barang[100];
    static int jumlah = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Tambah\n2. Tampilkan\n3. Ubah\n4. Hapus\n5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> {
                    return;
                }
                default -> System.out.println("Menu tidak valid");
            }
        }
    }

    static void tambah() {
        System.out.print("ID: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble(); input.nextLine();
        data[jumlah++] = new Barang(id, nama, harga);
        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampil() {
        if (jumlah == 0) {
            System.out.println("Data kosong");
            return;
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println(data[i]);
        }
    }

    static void ubah() {
        System.out.print("Masukkan ID yang ingin diubah: ");
        int id = input.nextInt(); input.nextLine();
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getId() == id) {
                System.out.print("Nama baru: ");
                String nama = input.nextLine();
                System.out.print("Harga baru: ");
                double harga = input.nextDouble(); input.nextLine();
                data[i].update(nama, harga);
                System.out.println("Data berhasil diubah.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }

    static void hapus() {
        System.out.print("Masukkan ID yang ingin dihapus: ");
        int id = input.nextInt(); input.nextLine();
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getId() == id) {
                for (int j = i; j < jumlah - 1; j++) {
                    data[j] = data[j + 1];
                }
                jumlah--;
                System.out.println("Data dihapus.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan");
    }
}