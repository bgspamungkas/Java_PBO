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
public class segitiga {
   int hitungluas(int a, int t){
        return (a*t/2);
    }
    
    int hitungkeliling(int a, int t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    }
    
    double hitungluas(double a, double t){
        return (a*t/2);
    }
    
    double hitungkeliling(double a, double t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    } 
}
