/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan5.kambingglobal;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara menambah nilai
 */
public class IF110119016Latihan5KambingGlobal {

    // Variabel jumlahkambing menjadi variable instance
    
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    IF110119016Latihan5KambingGlobal kambingSusu = new IF110119016Latihan5KambingGlobal();
    
    // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
     kambingSusu.getJumlahKambing();
     
    // Menambah satu kambing
     kambingSusu.tambahKambing();
     
    // Menampilkan jumlah kambing yang ada
     kambingSusu.getJumlahKambing();
    }
    
}
