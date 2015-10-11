/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author MCENDROWSKI
 */
public interface ReceiptDataAccessStrategy {

    Product findProduct(final String prodId);
    
    public abstract Customer findCustomer(String customerId);
    

    
}
