/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Gamaliel Agung
 */
public abstract class BangunRuang {
    public abstract double hitungvolume();
    public abstract double hitungluaspermukaan();
    public void tampilHasil(){
        System.out.println("Volumenya: " + this.hitungvolume());
        System.out.println("Luas Permukaannya: " + this.hitungluaspermukaan());
    }
}
