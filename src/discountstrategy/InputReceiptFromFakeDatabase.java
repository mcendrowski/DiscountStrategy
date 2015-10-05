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
public class InputReceiptFromFakeDatabase implements InputReceiptStrategy {

    
    
    @Override
    public Receipt inputReceipt() {
        
        FakeDatabase fd = new FakeDatabase();
        fd.findCustomer("100");
        
        Receipt r = new Receipt(1,fd.findCustomer("100"));
        r.addReceiptLine("1111", 20);
         r.addReceiptLine("2222", 30);
         r.addReceiptLine("1111", 10); 
         return r;
    }
//    public Receipt inputReceipt(){
//        Receipt r = new Receipt();
//        return r;
//    }
}
