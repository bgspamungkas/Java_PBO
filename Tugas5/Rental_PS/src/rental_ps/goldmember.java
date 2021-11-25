/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_ps;

/**
 *
 * @author Gamaliel Agung
 */
public class goldmember extends silvermember {
    
    int cashback;
    
    goldmember() {
        rentCost = 30000;
        point = 5;
        disc = 2;
        cashback = 5000;
    }
}

