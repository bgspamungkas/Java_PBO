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
public abstract class car {
    public abstract double hitungbensinmin();
    public abstract double hitunglamaperjalanan();
    public void tampilHasil() {
        
        System.out.println("Bahan Bakar Minimal yang Diperlukan adalah : " + this.hitungbensinmin());
        System.out.println("Lama Perjalanan yang Akan Ditempuh adalah : " + this.hitunglamaperjalanan());
    }
}
