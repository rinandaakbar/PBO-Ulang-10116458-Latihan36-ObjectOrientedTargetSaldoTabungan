/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan36.objectorientedtargetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class TargetSaldo {
    public int saldo;
    public int bunga;

    public double HitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    }

    public void HitungLamaSaldoTarget(int parSaldo, int parSaldoTarget){
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            HitungBunga(parSaldo,bunga);
            parSaldo += HitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
}
