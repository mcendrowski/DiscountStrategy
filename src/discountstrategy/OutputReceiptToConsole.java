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
    public final void outputReceipt(String receiptDetails) {
        System.out.println(receiptDetails);        
    }
    @Override
    public final void outputMessage(String messageDetails) {
        System.out.println(messageDetails);        
    }
    
}
