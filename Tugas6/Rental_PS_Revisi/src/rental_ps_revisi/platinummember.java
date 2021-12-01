/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_ps_revisi;

/**
 *
 * @author Gamaliel Agung
 */
public class platinummember extends goldmember{
    
    private int bonus;
    
    platinummember() {
        setRentCost(45000);
        setPoint(10);
        setDisc(3);
        setCashback(10000);
    }
    
    //getter method
    public int getBonus(int rentalDuration) {
        
        this.bonus = rentalDuration * 5000;
        return bonus;
    }
}
