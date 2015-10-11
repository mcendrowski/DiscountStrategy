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
public class Customer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    
    

    public Customer(String customerId, String customerName,String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        
    }

    public final String getCustomerAddress() {
        return customerAddress;
    }

    public final void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    } 
    


    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
}
