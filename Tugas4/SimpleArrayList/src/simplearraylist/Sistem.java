/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;

/**
 *
 * @author Gamaliel Agung
 */
public class Sistem {
    ArrayList<String> data = new ArrayList<>();
    
    void tambahdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin ditambahkan : ");
        data.add(input.next());
        System.out.println("Daftar data keseluruhan : "+ data);
        System.out.println("");
    }
    
    void caridata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dicari : ");
        String cari = input.next();
        boolean ans = data.contains(cari);
        if (ans) {
            System.out.println("Ada data "+ cari+ " dalam array list pada index "+ data.indexOf(cari));
        }
        else {
            System.out.println("Tidak ada data "+ cari+ " dalam list array");
            System.out.println("Daftar data keseluruhan : "+ data);
        }
        System.out.println("");
    }
    
    void hapusdata(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar data keseluruhan : "+ data);
        System.out.print("Masukkan data yang ingin dihapus : ");
        String hapus = input.next();
        boolean ans = data.contains(hapus);
        if (ans) {
            data.remove(data.indexOf(hapus));
            System.out.println(hapus +" Data berhasil dihapus dari array");
            System.out.println("Update data keseluruhan : "+ data);
        }
        else {
            System.out.println("Tidak ada "+ hapus+ " dalam data array");
        }
        System.out.println("");
    }
    
    void tampildata(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string yang ada dalam list array : "+ data);
        System.out.println("");
    }
}
