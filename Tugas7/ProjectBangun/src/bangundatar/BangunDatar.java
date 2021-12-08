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
public abstract class BangunDatar {
    public abstract double hitungluas();
    public abstract double hitungkeliling();
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungluas());
        System.out.println("Kelilingnya: " + this.hitungkeliling());
    }
}
