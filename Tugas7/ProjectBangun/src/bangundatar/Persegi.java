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
public class Persegi extends BangunDatar {
    public double sisi;
    
    public double hitungluas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    public double hitungkeliling(){
        double keliling = 4 * this.sisi;
        return keliling;
    }

}
