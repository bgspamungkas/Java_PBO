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
public class Bola extends BangunRuang {
    public double jarijari;
    
    public double hitungvolume() {
        
        double vol = (4 * Math.PI * Math.pow(jarijari, 3)) / 3;
        return vol;
    }

    public double hitungluaspermukaan() {
        double luasp = 4 * Math.PI * Math.pow(jarijari, 2);
        return luasp;
    }
}
