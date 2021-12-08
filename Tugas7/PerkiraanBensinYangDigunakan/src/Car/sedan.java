/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Gamaliel Agung
 */
public class sedan extends car {
    public double kecepatan, jarak;
    
    @Override
    public double hitungbensinmin() {
        
        double bensinmin = jarak / 10;
        return bensinmin;
    }

    @Override
    public double hitunglamaperjalanan() {
        
        double durasi = jarak / kecepatan;
        return durasi;
    }
}
