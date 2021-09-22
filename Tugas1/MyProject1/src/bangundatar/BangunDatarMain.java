/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Gamaliel Agung
 */
public class BangunDatarMain {
   public static void main(String[] args) {
        PersegiPanjang PP;
        PP = new PersegiPanjang();
        PP.panjang = 25;
        PP.lebar = 38;
        PP.hitungLuas();
        PP.hitungKeliling();
        
        Persegi PA;
        PA = new Persegi();
        PA.sisi = 10;
        PA.hitungLuas();
        PA.hitungKeliling();
        
        Persegi PB; 
        PB = new Persegi();
        PB.sisi = 15;
        PB.hitungLuas();
        PB.hitungKeliling();
        
        Lingkaran LX; 
        LX = new Lingkaran();
        LX.r = 25;
        LX.hitungLuas();
        LX.hitungKeliling();
        
        Lingkaran LZ;
        LZ = new Lingkaran();
        LZ.r = 37;
        LZ.hitungLuas();
        LZ.hitungKeliling();
    } 
}
