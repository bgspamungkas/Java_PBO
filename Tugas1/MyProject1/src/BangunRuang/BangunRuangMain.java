/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 * @author Gamaliel Agung
 */
public class BangunRuangMain {
  public static void main(String[] args) {
        Bola bola;
        bola = new Bola();
        bola.r = 28;
        bola.hitungVol();
        bola.hitungLuasSelimut();

        Kerucut kerucut;
        kerucut = new Kerucut();
        kerucut.r = 10;
        kerucut.s = 20;
        kerucut.tinggi = 15;
        kerucut.hitungVol();
        kerucut.hitungLuasSelimut();
        
        Tabung tabung;
        tabung = new Tabung();
        tabung.r = 14;
        tabung.tinggi = 30;
        tabung.hitungVol();
        tabung.hitungLuasSelimut();
    }   
}
