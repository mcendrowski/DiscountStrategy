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
public class FakeDatabase {
    private Product[] products = {
        new Product("1111","AAAA",20.00,new PercentOffDiscount(0.1)),
        new Product("2222","BBBB",5.00,new QtyDiscount(0.2,10))
    
    };
      private Customer[] customers = {
        new Customer("100", "John Nash"),
        new Customer("200", "Albert Einstein"),
        new Customer("300", "Marie Curie")
    };
//    public final String showNumber(){
//        return "aaaa";
//    }
//    
     public final Product findProduct(final String prodId) {
        // validation is needed for method parameter
        if(prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
       
        
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
     
      public final Customer findCustomer(final String customerId) {
        // validation is needed for method parameter
        if(customerId == null || customerId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
      
      
      }


    
}
