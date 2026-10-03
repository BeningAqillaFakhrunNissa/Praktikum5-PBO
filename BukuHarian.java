package praktikum5.tugas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    //Atribut
    String namaPemilik;
    String namaFile;

    // Constructor:  Menginisiasi namaPemilik dan menentukan namaFile berdasarkan nama pemilik
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replace(" ", "_") + ".txt";
    }

    // Method tulisCatatan: Menambahkan catatan baru ke file (mode append agar catatan lama tidak terhapus)
    public void tulisCatatan(String tanggal, String isi) {
        // Parameter true pada FileWriter = mode append
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {

            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine(); // Pindah baris

            System.out.println("Catatan tanggal " + tanggal + " berhasil disimpan ke file: " + namaFile);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }

    // Method bacaCatatan(): Membaca dan mencetak seluruh isi file ke konsol
    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {

            String baris;
            boolean adaIsi = false;

            System.out.println("--- Buku Harian " + namaPemilik + " ---");

            // Membaca per baris hingga habis (null)
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }

            // Jika file ada tetapi kosong
            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }

        } catch (IOException e) {
            // Jika file belum ada
            System.out.println("Belum ada catatan harian.");
        }
    }
}