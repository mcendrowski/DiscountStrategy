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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate;
    private int minQty;
//    private double amtSaved;
    
    public QtyDiscount(double discountRate,int minQty){
        this.discountRate=discountRate;
        this.minQty=minQty;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }
    
    @Override
    public final double getAmountSaved(double unitPrice,int qty){
        if(qty>=minQty){
            
        return unitPrice*qty*discountRate;}
        else {
            return 0;
        }
    }
    
    @Override
    public final double getDiscountedProductTotal(double unitPrice, int qty){
        if(qty>=minQty){
        
        return (unitPrice*qty)-getAmountSaved(unitPrice,qty);}
        else {
            return unitPrice*qty;
        }
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static final void main(String[] args){
        DiscountStrategy discount = new QtyDiscount(0.10,2);
//        DiscountStrategy discount = new PercentOfDiscount(0.10);
        
//        discount.setDiscountRate(0.10);
        double amt = discount.getAmountSaved(10.00,2);
        System.out.println("Disount amount: "+ amt);
        double newTotal = discount.getDiscountedProductTotal(10.00,2);
        System.out.println (newTotal);
    }
    
}
