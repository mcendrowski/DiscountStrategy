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
public interface ReceiptLineStrategy {

    public Product getProduct();

    public int getQuantity();

    public void setProduct(Product product);

    public void setQuantity(int quantity);
    
    public double getTotalDiscount();
    
}
