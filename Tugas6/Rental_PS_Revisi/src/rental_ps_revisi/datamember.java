/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_ps_revisi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gamaliel Agung
 */
public class datamember {
    static Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    static int rentTime;
    
    // insert data member values paired with id member key hashmap
    static void insertMember() {
        
        // insert M001 to value list
        List<String> valueOne = new ArrayList<String>();
        valueOne.add("Mr. X");
        valueOne.add("Silver");
        
        // insert M002 to value list
        List<String> valueTwo = new ArrayList<String>();
        valueTwo.add("Mr. Y");
        valueTwo.add("Gold");
        
        // insert M003 to value list
        List<String> valueThree = new ArrayList<String>();
        valueThree.add("Mr. Z");
        valueThree.add("Platinum");
        
        // insert all values paired to key
        dataMember.put("M001", valueOne);
        dataMember.put("M002", valueTwo);
        dataMember.put("M003", valueThree);
    }
    
    
    // search data on arrayList
    static void searchMember(String idMember) {       
         
        if(dataMember.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\n| ID Member                        | : " + key);
                System.out.println("| Nama Member                      | : " + values.get(0));
                System.out.println("| Jenis Member                     | : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    static String getJenisMember(String idMember) {
        
        String jenisMember = null;
        if(dataMember.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int rentDuration(int dateRent, int monthRent, int yearRent, int dateReturn, int monthReturn, int yearReturn) {
        
        if(yearReturn >= yearRent) {
            if(monthReturn >= monthRent) {
                
                    LocalDateTime rent = LocalDateTime.of(yearRent, monthRent, dateRent, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(yearReturn, monthReturn, dateReturn, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                    rentTime = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        
        return rentTime;
    }
}
