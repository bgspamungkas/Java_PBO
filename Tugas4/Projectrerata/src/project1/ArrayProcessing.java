/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author Gamaliel Agung
 */
public class ArrayProcessing {

    int [] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyak data (n) : ");
        this.n = input.nextInt();
            for(int i=0; i<this.n; i++){
                System.out.print("Masukan bil ke - " + (i+1)+ " : ");
                this.dataBil[i] = input.nextInt();
            }
    }
    double hitungrerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int carimin(int[] data){
        int min = data[0];
        for(int i = 0; i < this.n; i++) {
            if(data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    int carimax(int[] data){
        int max = data[0];
        for(int i=0; i < this.n; i++){
            if (data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    
    void output(){
    System.out.println("\n------- Hasil Perhitungan -------");
    System.out.println("Nilai Rata-Rata  : " + hitungrerata(this.dataBil));
    System.out.println("Nilai minimum    : " + carimin(this.dataBil));
    System.out.println("Milai maximum    : " + carimax(this.dataBil));
    }
    
}
