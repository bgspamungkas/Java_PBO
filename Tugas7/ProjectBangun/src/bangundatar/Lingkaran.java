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
public class Lingkaran extends BangunDatar {
    public double jarijari;
     
    // method untuk hitung luas lingkaran
    public double hitungluas(){
        
        double luas = Math.PI * jarijari * jarijari;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungkeliling(){
 	  
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}
