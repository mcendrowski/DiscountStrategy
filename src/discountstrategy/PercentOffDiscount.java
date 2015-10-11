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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;
    private double amtSaved;
    
    public PercentOffDiscount(double discountRate){
        this.discountRate=discountRate;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }
    
    @Override
    public final double getAmountSaved(double unitPrice,int qty){
        return unitPrice*qty*discountRate;
    }
    
    @Override
    public final double getDiscountedProductTotal(double unitPrice, int qty){
        return (unitPrice*qty)-getAmountSaved(unitPrice,qty);
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static final void main(String[] args){
        DiscountStrategy discount = new QtyDiscount(0.10,5);
//        discount.setDiscountRate(0.10);
        double amt = discount.getAmountSaved(10.00,2);
        System.out.println("Discount amount: "+ amt);
        double newTotal = discount.getDiscountedProductTotal(10.00,2);
        System.out.println (newTotal);
    }
    
}
