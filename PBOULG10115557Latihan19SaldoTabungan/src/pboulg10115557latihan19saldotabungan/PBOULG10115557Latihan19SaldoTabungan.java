/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan19saldotabungan;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 19
 */
public class PBOULG10115557Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int bulan = 6;
        int i = 1;
        int saldoTabungan = 2500000;
        double bunga = 0.15;
        double saldoBulanan;
        
        for (i = 1; i <= bulan; i++) {
            saldoBulanan = bunga * saldoTabungan;
            saldoTabungan = (int)(saldoTabungan + saldoBulanan);
            System.out.println("Saldo bulan ke-" + i + " Rp."
                    + (int) saldoTabungan);
        }
    }    
}
