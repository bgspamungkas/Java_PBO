/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author Gamaliel Agung
 */
public class MainClass {
    public static void main(String[] args) {
            //BangunDatar b1 = new BangunDatar();
            Persegi p = new Persegi();
            Lingkaran l = new Lingkaran();
            PersegiPanjang pp = new PersegiPanjang();
            
            Tabung t = new Tabung();
            Balok b = new Balok();
            Bola bl = new Bola();
            
            //persegi
            p.sisi = 5;
            System.out.println("\nPersegi dengan panjang sisi " + p.sisi);
            p.hitungluas();
            p.hitungkeliling();
            p.tampilHasil();
            
            //lingkaran
            l.jarijari = 10;
            System.out.println("\nLingkaran dengan panjang jari - jari " + l.jarijari);
            l.hitungluas();
            l.hitungkeliling();
            l.tampilHasil();
            
            //persegi panjang
            pp.lebar = 4;
            pp.panjang = 5;
            System.out.println("\nPersegi Panjang dengan panjang " + pp.panjang + " dan lebar " + pp.lebar);
            pp.hitungluas();
            pp.hitungkeliling();
            pp.tampilHasil();
            
            //tabung
            t.jarijari = 10;
            t.tinggi = 10;
            System.out.println("\nTabung dengan panjang jari - jari " + t.jarijari + " dan tinggi " + t.tinggi);
            t.hitungvolume();
            t.hitungluaspermukaan();
            t.tampilHasil();
            
            //balok
            b.lebar = 3;
            b.panjang = 4;
            b.tinggi = 5;
            System.out.println("\nBalok dengan panjang " + b.panjang + ", lebar " + b.lebar + ", dan tinggi " + b.tinggi);
            b.hitungvolume();
            b.hitungluaspermukaan();
            b.tampilHasil();
            
            //bola
            bl.jarijari = 10;
            System.out.println("\nBola dengan panjang jari - jari " + t.jarijari);
            bl.hitungvolume();
            bl.hitungluaspermukaan();
            bl.tampilHasil();
    }
}
