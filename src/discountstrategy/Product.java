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
public class Product {
    private String prodId;
    private String name;
    private double unitPrice;
    private DiscountStrategy discount;

    public Product() {
    }

    public Product(String prodId, String name, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = name;
        this.discount = discount;
    }

    public Product(String prodId, String name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    
    
    
     
  
    public final double getDiscountedProductTotal(double unitPrice, int qty){
        return discount.getDiscountedProductTotal(unitPrice, qty);
    }
    
    
    public final double getAmountSaved(double unitPrice,int qty){
        return discount.getAmountSaved(unitPrice, qty);
    }
    
//     public final double getAmountSaved(double unitPrice){
//        return discount.getAmountSaved(unitPrice);
//    }

    
    
    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
     public static void main(String[] args){
//         Product product = new Product("A100","hat",20.00,new PercentOffDiscount(0.10));
         Product product = new Product("A100","hat",20.00,new QtyDiscount(0.10,4));
         double amtSaved = product.getAmountSaved(2,2);
         System.out.println("Expected 4.00 and got: "+amtSaved);
     }
}