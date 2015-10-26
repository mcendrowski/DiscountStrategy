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
public class Receipt {

    private int receiptNumber;
    private Customer customer;
    private LineItem[] lineItems;
    private int lineItemsCount;
    private static int receiptCount;
    private ReceiptDataAccessStrategy database;
    private OutputReceiptStrategy output;

    public Receipt(String custId, ReceiptDataAccessStrategy productData) {
        this.lineItems = new LineItem[0];
        this.database = productData;
        this.customer = findCustomer(custId);
        this.receiptNumber = ++receiptCount;
    }

    private final Customer findCustomer(final String custId) throws MandatoryEntryException,NotFoundInDatabaseException {
//        if(custId == null || custId.length() == 0) {
//            output.outputMessage("Customer can't be empty.");
//        }
        ExceptionTest.stringMandatoryEntryTest(custId);
        

        Customer cust = this.database.findCustomer(custId);
//        if(cust == null) {
//            output.outputMessage("Customer not found.");
//        }
        ExceptionTest.objectNotFoundInDatabaseTest(cust);
        return cust;
    }


    public final ReceiptDataAccessStrategy getProductData() {
        return database;
    }

    public final void setProductData(ReceiptDataAccessStrategy productData) throws MandatoryEntryException {
        ExceptionTest.objectMandatoryEntryTest(productData);
        this.database = productData;
    }

    public final OutputReceiptStrategy getOutput() {
        return output;
    }

    public final void setOutput(OutputReceiptStrategy output) throws MandatoryEntryException {
         ExceptionTest.objectMandatoryEntryTest(output);
        this.output = output;
    }

    public final void outputReceipt() {

        String outputText = "";
        outputText += "Sold to: " + this.customer.getCustomerName() + "\n";
        outputText += "Receipt number: " + this.getReceiptNumber() + "\n\n";
//        outputText += this.customer.getCustomerName() + "\n";
        outputText += "ProdId\tDescription\tPrice\tQty\tSubtotal\tDiscount\n";
        outputText += "-------------------------------------------------------------------\n";
        for (int i = 0; i < this.getLineItems().length; i++) {
            outputText += this.getLineItem(i) + "\n";

        }
        outputText += "\t\t\t\t\t----------------------\n";
        outputText += "\t\t\t\t\tNet total: \t" + this.getNetTotalOfLineItems() + "\n";
        outputText += "\t\t\t\t\tTotal discount: " + this.getTotalDiscountOfLineItems() + "\n";
        outputText += "\t\t\t\t\tTotal due: \t" + this.getTotalDue() + "\n";

        this.output.outputReceipt(outputText);

    }

    public final double getNetTotalOfLineItems() {
        double subtotal = 0;
        for (int i = 0; i < this.getLineItems().length; i++) {
            subtotal += this.getLineItem(i).getValueBeforeDiscount();
        }
        return subtotal;
    }

    public final double getTotalDiscountOfLineItems() {
        double totalDiscount = 0;
        for (int i = 0; i < this.getLineItems().length; i++) {
            totalDiscount += this.getLineItem(i).getTotalDiscount();
        }
        return totalDiscount;
    }

    public final double getTotalDue() {
        return this.getNetTotalOfLineItems() - this.getTotalDiscountOfLineItems();
    }

    public final int getReceiptNumber() {
        return receiptNumber;
    }

    public final void setReceiptNumber(int receiptNumber) throws MandatoryEntryException {
        ExceptionTest.positiveNumberMandatoryEntryTest(receiptNumber);
        this.receiptNumber = receiptNumber;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) throws MandatoryEntryException {
        ExceptionTest.objectMandatoryEntryTest(customer);
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final LineItem getLineItem(int lineNumber) {
        return this.lineItems[lineNumber];
    }

    public final void setLineItems(LineItem[] lineItems) throws MandatoryEntryException {
        ExceptionTest.objectMandatoryEntryTest(lineItems);
        this.lineItems = lineItems;
    }

    public final int getLineItemsCount() {
        return lineItemsCount;
    }

    public final void setLineItemsCount(int lineItemsCount) throws MandatoryEntryException {
        ExceptionTest.positiveNumberMandatoryEntryTest(lineItemsCount);
        this.lineItemsCount = lineItemsCount;
    }

    private void increaseArrayLength() {

        LineItem[] temp = new LineItem[this.lineItems.length + 1];
        for (int i = 0; i < this.lineItems.length; i++) {
            temp[i] = this.lineItems[i];
        }
        lineItems = temp;
        temp = null;

    }

    public final void addLineItem(final String prodId, final int qty) throws MandatoryEntryException {
        // needs validation
        increaseArrayLength();
        ExceptionTest.stringMandatoryEntryTest(prodId);
        ExceptionTest.positiveNumberMandatoryEntryTest(qty);
        LineItem item = new LineItem(prodId, qty, this.database);
        this.lineItems[this.lineItems.length - 1] = item;

    }

}
