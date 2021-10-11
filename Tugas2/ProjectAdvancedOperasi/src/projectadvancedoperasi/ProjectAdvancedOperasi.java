/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Gamaliel Agung
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Operasi b = new Operasi();
        System.out.println("PENJUMLAHAN");
        System.out.println("3 + 4 = " + b.jumlahkan(3, 4));
        System.out.println("4 + 7 + (-9) = " + b.jumlahkan(4, 7, -9));
        System.out.println("3.4 + (-0.002) + 0.12313 = " + b.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println("PERKALIAN");
        System.out.println("3 x 4 = " + b.kalikan(3, 4));
        System.out.println("4 x 7 x (-9) = " + b.kalikan(4, 7, -9));
        System.out.println("3.4 x (-0.002) x 0.12313 = " + b.kalikan(3.4, -0.002, 0.12313));
    }
    
}
