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
public class CashRegister {

    private Customer customer;

    private Receipt receipt;

    public final void startNewSale(String custId,ReceiptDataAccessStrategy database) {
        
        receipt = new Receipt(custId, database);
        
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) throws MandatoryEntryException {
        ExceptionTest.objectMandatoryEntryTest(customer);        
        this.customer = customer;
    }

    public final void provideReceiptOutput(OutputReceiptStrategy outputReceipt) throws MandatoryEntryException {
        ExceptionTest.objectMandatoryEntryTest(outputReceipt);
        receipt.setOutput(outputReceipt);

    }
/**
 * Adds item line to the receipt
 * @param prodId
 * @param qty 
 */
    public final void addItemLine(String prodId, int qty) {
        receipt.addLineItem(prodId, qty);

    }
/**
 * outputs receipt
 */
    public final void outputReceipt() {
        receipt.outputReceipt();
    }

}
