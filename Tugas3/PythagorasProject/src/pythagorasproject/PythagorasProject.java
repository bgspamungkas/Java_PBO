/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

/**
 *
 * @author Gamaliel Agung
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // TODO code application logic here
        System.out.println("                ___     ");
        System.out.println("       [c] ____|   |    ");
        System.out.println("       ___|        |    ");
        System.out.println("   ___|            | [a]  ");
        System.out.println("  |________________|    ");
        System.out.println("        [b]            ");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Menu Aplikasi Java Pythagoras");
        System.out.println("1.	Cek triple pythagoras");
        System.out.println("2.	Menentukan sisi miring segitiga");
        System.out.println("3.	Menentukan sisi siku-siku segitiga");
        System.out.println("4.	Exit");
        System.out.println("");
        System.out.println("Silahkan Masukan Pilihan Anda : ");
        Scanner pilihan = new Scanner(System.in);
        
        switch(pilihan.nextInt()){
            case 1 :
                triple t = new triple();
                t.input();
                t.cek();
                break;
            case 2 :
                Miring c = new Miring();
                c.input();
                c.sisiMiring();
                break;
            case 3 :
                Siku_siku siku = new Siku_siku();
                siku.input();
                siku.sisiSiku();
                break;
            case 4:
                System.out.println("Program Selesai");
  
                // Terminate JVM
                System.exit(0);
            default :
                System.out.println("Pilihan tidak tersedia");
                
        }
        
            
    }
             
        
        
}
