/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mcendrowski
 */
public interface DiscountStrategy {

    public abstract double getAmountSaved(double unitPrice, int qty);

    public abstract double getDiscountRate();

    public abstract double getDiscountedProductTotal(double unitPrice, int qty);

    public abstract void setDiscountRate(double discountRate);
    
}
