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
public class StartUp {
    
    
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("100",new FakeDatabase());        

        
        cr.addItemLine("1111", 5);
        cr.addItemLine("2222", 10);
        cr.addItemLine("3333", 20);        
        
        
        cr.provideReceiptOutput(new OutputReceiptToConsole());
        cr.outputReceipt();
        
        
        
         cr.startNewSale("200",new FakeDatabase());

        
        cr.addItemLine("3333", 1);
        cr.addItemLine("1111", 5);
               
        
        
        cr.provideReceiptOutput(new OutputReceiptToConsole());
        cr.outputReceipt();
        
        
 
    }
}
