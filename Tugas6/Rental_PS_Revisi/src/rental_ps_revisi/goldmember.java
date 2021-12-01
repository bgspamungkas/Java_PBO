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
public class goldmember extends silvermember {
    
    private int cashback;
    
    // setter method
    public void setCashback(int cb) {
        this.cashback = cb;
    }
    
    //getter method
    public int getCashback() {
        return this.cashback;
    }
    
    
    // constructor
    goldmember() {
        setRentCost(30000);
        setPoint(5);
        setDisc(2);
        setCashback(5000);
    }
}

