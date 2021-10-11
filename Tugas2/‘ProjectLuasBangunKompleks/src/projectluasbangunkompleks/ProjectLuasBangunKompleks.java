/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Gamaliel Agung
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //project 1
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        double jumlahluas ;
        jumlahluas = Math.round(p.hitungLuas(42) + (l.hitungLuas(42/2) * 2);
                ;
        System.out.println("Jumlah luas bangun datar  adalah: " + jumlahluas);
        
        //project 2
        Lingkaran besar = new Lingkaran();
        Lingkaran kecil = new Lingkaran();
        
        double luasAbu = Math.round((besar.hitungLuas(14)/2) - kecil.hitungLuas(7));
        System.out.println("Luas daerah yang berwarna abu-abu adalah : " + luasAbu);
    }
    
}
