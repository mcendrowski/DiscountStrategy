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
public class OutputReceiptToConsole implements OutputReceiptStrategy {

    @Override
    public void outputReceipt(Receipt receipt) {
        System.out.println(receipt.getReceiptNumber());
        System.out.println(receipt.getCustomer().getCustomerName());
        for(int i=0;i<receipt.getReceiptLines().length;i++){
            System.out.println(receipt.getReceiptLine(i));
        }     
        
        
    }
    
}
