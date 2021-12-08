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
public class PersegiPanjang extends BangunDatar {
    
    public double panjang, lebar;
     
    // method untuk hitung luas lingkaran
    public double hitungluas(){
        
        double luas = panjang * lebar;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungkeliling(){
 	  
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
