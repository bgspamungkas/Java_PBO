/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.pendataan.karyawan;

/**
 *
 * @author Asus
 */
public abstract class menu extends variabel {
    abstract void tambahData(karyawan n);
    abstract void hapusData(String n);
    abstract void cariData(String n);
    abstract void lihatData();
}
