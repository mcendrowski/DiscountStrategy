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
public class FakeDatabase implements ReceiptDataAccessStrategy {

    private final Product[] products = {
        new Product("1111", "AAAA", 20.00, new PercentOffDiscount(0.1)),
        new Product("2222", "BBBB", 5.00, new QtyDiscount(0.2, 10)),
        new Product("3333", "CCCC", 4.00, new QtyDiscount(0.1, 4))

    };
    
     private final Customer[] customers = {
        new Customer("100", "John Nash","1234 Greenfield, Milwaukee WI"),
        new Customer("200", "Albert Einstein","1150 Fifth Avenue, New York NY"),
        new Customer("300", "Marie Curie","2000 Washington Street, Chicago IL")
    };

    @Override
    public final Product findProduct(final String prodId) {
        // validation is needed for method parameter
        if (prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }

        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        if (product==null){
            System.out.println("Product not found in the database.");
                   
        }
        return product;
    }
       @Override
      public final Customer findCustomer(final String customerId) {
        // validation is needed for method parameter
        if(customerId == null || customerId.length() == 0) {
            System.out.println("Sorry, FakeCustomerDatabase.findCustomer method has "
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
