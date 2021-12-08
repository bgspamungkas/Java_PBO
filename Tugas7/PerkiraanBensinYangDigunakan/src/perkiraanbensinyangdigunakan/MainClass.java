/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkiraanbensinyangdigunakan;

import Car.*;
/**
 *
 * @author Gamaliel Agung
 */
public class MainClass {
    public static void main(String [] args) {
        
        sedan sdn = new sedan();
        suv suv = new suv();
        mpv mpv = new mpv();
        
        String[][] dataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i <= dataMobil.length - 1; i++ ) {
            
            if(dataMobil[i][1] == "Sedan") {
                sdn.jarak = Double.parseDouble(dataMobil[i][2]);
                sdn.kecepatan = Double.parseDouble(dataMobil[i][3]);
                
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                sdn.hitungbensinmin();
                sdn.hitunglamaperjalanan();
                sdn.tampilHasil();
                
            } else if(dataMobil[i][1] == "SUV") {
                suv.jarak = Double.parseDouble(dataMobil[i][2]);
                suv.kecepatan = Double.parseDouble(dataMobil[i][3]);
                
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                suv.hitungbensinmin();
                suv.hitunglamaperjalanan();
                suv.tampilHasil();
                
            } else if(dataMobil[i][1] == "MPV") {
                mpv.jarak = Double.parseDouble(dataMobil[i][2]);
                mpv.kecepatan = Double.parseDouble(dataMobil[i][3]);
                
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                mpv.hitungbensinmin();
                mpv.hitunglamaperjalanan();
                mpv.tampilHasil();
                
            }
        }
    }
}
