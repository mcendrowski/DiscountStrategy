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
public interface LineItemStrategy {

    public abstract Product getProduct();

    public abstract int getQuantity();

    public abstract void setProduct(Product product);

    public abstract void setQuantity(int quantity);
    
    public abstract double getTotalDiscount();
    
}
