package praktikum5.tugas;

public class MainDiary {
    public static void main(String[] args) {
        // Instansiasi satu objek BukuHarian
        BukuHarian diary = new BukuHarian("Bening_Aqilla");

        // Panggil method tulisCtatan minimal Menulis 2 catatan harian dengan tanggal berbeda
        diary.tulisCatatan("01-10-2026", "Hari ini saya mengikuti kelas PBO.");
        diary.tulisCatatan("02-09-2026", "Mengerjakan tugas praktikum modul 5.");
        //uji ccoba berhasil: output run kedua tetap menampilkan kedua catatan karena sudah tersimpan di
        
        
        // Panggil method bacaCatatn: Menampilkan data tersebut
        diary.bacaCatatan();
    }
}
