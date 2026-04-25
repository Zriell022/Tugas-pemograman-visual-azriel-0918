/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_penjualan;

import javax.swing.JFrame;
import tampilan.Kasir;

/**
 *
 * @author My-Lenovo
 */
public class Aplikasi_Penjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        pelanggan frame = new pelanggan("Form Barang");

        Kasir panel = new Kasir(); // panggil class kamu
//        Barang panel = new Barang();
//        panel.setContentPane(panel);
//        panel.setSize(525, 1000); // sesuaikan ukuran
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLocationRelativeTo(null); // posisi tengah
        panel.setVisible(true);
    }
    
}
