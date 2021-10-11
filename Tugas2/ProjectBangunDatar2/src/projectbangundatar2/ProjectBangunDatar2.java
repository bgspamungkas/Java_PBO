/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Gamaliel Agung
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    persegipanjang pp = new persegipanjang();
        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang: 10, Lebar :5");
        System.out.println("Luas : " + pp.hitungluas(10, 5));
        System.out.println("Keliling : " + pp.hitungkeliling(10, 5));
        
        System.out.println("Panjang: 3.6, Lebar :8");
        System.out.println("Luas : " + pp.hitungluas(3.6, 8));
        System.out.println("Keliling : " + pp.hitungkeliling(3.6, 8));
        
        System.out.println("Panjang: 6, Lebar :8.3");
        System.out.println("Luas : " + pp.hitungluas(6, 8.3));
        System.out.println("Keliling : " + pp.hitungkeliling(6, 8.3));
        
        System.out.println("Panjang: 5.6, Lebar :8.8");
        System.out.println("Luas : " + pp.hitungluas(5.6, 8.8));
        System.out.println("Keliling : " + pp.hitungkeliling(5.6, 8.8));
        System.out.println("============================");
        
        persegi p = new persegi();
        System.out.println("PERSEGI");
        System.out.println("Panjang sisi: 4.5");
        System.out.println("Luas : " + p.hitungluas(4.5));
        System.out.println("Keliling : " + p.hitungkeliling(4.5));
        
        System.out.println("Panjang sisi: 7");
        System.out.println("Luas : " + p.hitungluas(7));
        System.out.println("Keliling : " + p.hitungkeliling(7));
        System.out.println("============================");
        
        lingkaran lo = new lingkaran();
        System.out.println("LINGKARAN");
        System.out.println("Jejari: 5");
        System.out.println("Luas : " + lo.hitungluas(5));
        System.out.println("Keliling : " + lo.hitungkeliling(5));
        
        System.out.println("Jejari: 7.4");
        System.out.println("Luas : " + lo.hitungluas(7.4));
        System.out.println("Keliling : " + lo.hitungkeliling(7.4));
        System.out.println("============================");
        
        segitiga sgt = new segitiga();
        System.out.println("SEGITIGA");
        System.out.println("Panjang alas: 8, Tinggi: 10");
        System.out.println("Luas : " + sgt.hitungluas(8, 10));
        System.out.println("Keliling : " + sgt.hitungkeliling(8, 10));
        
        System.out.println("Panjang alas: 8, Tinggi: 11.5");
        System.out.println("Luas : " + sgt.hitungluas(8, 11.5));
        System.out.println("Keliling : " + sgt.hitungkeliling(8, 11.5));
        
        System.out.println("Panjang alas: 12.2, Tinggi: 9");
        System.out.println("Luas : " + sgt.hitungluas(12.2, 9));
        System.out.println("Keliling : " + sgt.hitungkeliling(12.2, 9));
        
        System.out.println("Panjang alas: 13.9, Tinggi: 20.7");
        System.out.println("Luas : " + sgt.hitungluas(13.9, 20.7));
        System.out.println("Keliling : " + sgt.hitungkeliling(13.9, 20.7));
        System.out.println("============================");
    }
    
}
