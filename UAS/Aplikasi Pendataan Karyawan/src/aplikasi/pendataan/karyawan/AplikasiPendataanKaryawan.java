/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.pendataan.karyawan;
import java.util.Scanner;

/**
 *
 * @author Gamaliel Agung
 */
public class AplikasiPendataanKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        datakaryawan n = new datakaryawan();
        while(true){
                       
            System.out.println("==================================");
            System.out.println( "MENU UTAMA - APLIKASI MANAGEMENT KARYAWAN");
            System.out.println("----------------------------------");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            
            Scanner input = new Scanner( System.in );
            System.out.print("Menu Pilihan  : ");
            int mainmenu = input.nextInt();
            
            switch(mainmenu){
                case 1 : 
                    while(true ){
                        System.out.println("==================");
                        System.out.println(" Menu Tambah Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan  : ");
                        String kode = input.nextLine();
                        System.out.print("Masukan Nama Karyawan  : ");
                        String nama = input.nextLine();
                        System.out.print("Masukan Alamat         : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukan Tanggal Lahir  :");
                        String tanggal = input.nextLine();
                        System.out.print("Masukan Golongan (A,B,C)       : ");
                        String golongan = input.nextLine();
                        System.out.print("Masukkan Status Menikah ( 0 jika belum, 1 jika sudah) : ");
                        String status = input.nextLine();
                        String anak;
                        if( "1".equals(status) ){
                            System.out.print("Jumlah Anak            : ");
                            anak = input.nextLine();
                        } else {
                            anak = "0";
                        }
                        
                        karyawan karyawan = new karyawan(kode,nama+"        ",alamat,tanggal,golongan,status,anak);
                        n.tambahData(karyawan);
      
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Tambah data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_tambah = input.nextInt();
                        if(submenu_tambah != 2 ){
                            break;
                        }
                        
                        
                    }
                
                    break;
                
                case 2 : 
                    while( true) {
                        System.out.println("==================");
                        System.out.println(" Menu Hapus Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan kode karyawan yg ingin dihapus : ");
                        String kode_karyawan = input.nextLine();
                        
                        n.hapusData(kode_karyawan);
                        
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Hapus data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_hapus = input.nextInt();
                        if( submenu_hapus != 2 ){
                            break;
                        }
                        
                    }
                    break;
                
                case 3 :                     
                    while(true){
                        // input 
                        System.out.println("==================");
                        System.out.println(" Menu Cari Data");
                        System.out.println("------------------");
                        
                        input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan untuk dicari : "+"");
                        
                        String kode= input.nextLine();

                        n.cariData(kode);

                        System.out.println("");

                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Cari data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int submenu_cari = input.nextInt();
                        if( submenu_cari != 2 ){
                            break;
                        } 
                    }
                    break;
                
                case 4 : 
                    
                    n.lihatData();
                        
                    System.out.println("");
                        
                    input.nextLine();

                    System.out.println("Pilih Submenu : ");
                    System.out.println("1. Kembali ke menu utama");
                    System.out.println("");
                    System.out.print("Menu Pilihan : ");

                    input.nextInt();
                    break;
                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println(" !invalid input data salah");
                
            }   
        }
    }
}
