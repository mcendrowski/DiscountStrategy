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
    private ReceiptLine[] receiptLines; //= new ReceiptLine[2];
    private int receiptLinesCount;

    public Receipt() {
   
    }

//    public Receipt(int receiptNumber, String customer) {
//        this.receiptNumber = receiptNumber;
//        this.customer = customer;
//        
//    }

    public Receipt(int receiptNumber, Customer customer) {
        this.receiptNumber = receiptNumber;
        this.customer = customer;
        this.receiptLines = new ReceiptLine[0];
        this.receiptLinesCount=0;
        
    }

    public int getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ReceiptLine[] getReceiptLines() {
        return receiptLines;
    }
    public ReceiptLine getReceiptLine(int lineNumber){
        return this.receiptLines[lineNumber];
    }

    public void setReceiptLines(ReceiptLine[] receiptLines) {
        this.receiptLines = receiptLines;
    }

    public int getReceiptLinesCount() {
        return receiptLinesCount;
    }

    public void setReceiptLinesCount(int receiptLinesCount) {
        this.receiptLinesCount = receiptLinesCount;
    }
    
    
    
    
    
    public static Receipt getTestReceipt(Customer customer){
        Receipt rcpt1 = new Receipt(1,customer);
        
        rcpt1.addReceiptLine("1111",20);
        rcpt1.addReceiptLine("2222",30);
        rcpt1.addReceiptLine("1111",20);
        rcpt1.addReceiptLine("1111",20);
        return rcpt1;
    }
    
   
    
    
    
    public void addLine(){
        ReceiptLine[] temp = new ReceiptLine[this.receiptLines.length+1];
        for (int i=0;i<this.receiptLines.length;i++) {
        temp[i]=this.receiptLines[i];
        }
        receiptLines = temp;
        temp=null;       
        
    }
    
    
    
    public void addReceiptLine(String prodId,int quantity){
        
        
//        ReceiptLine rl = new ReceiptLine();
        
//        ReceiptLine rl = new ReceiptLine(ReceiptLine.getTestReceiptLine());
        
        addLine();
        ReceiptLine rl = new ReceiptLine(ReceiptLine.getReceiptLine(prodId,quantity));
//        ReceiptLint rl = new ReceiptLine()
        
        
        
//        ReceiptLine rl = getTestReceiptLine();
         
        
        
//        FakeDatabase db = new FakeDatabase();
//        rl.setProduct(db.findProduct("AAAA"));
//        rl.setQuantity(20);
        
         receiptLines[receiptLinesCount]=rl;        
        this.receiptLinesCount++;
    }
    
//    public void printReceipt(){
//        System.out.println(getTestReceipt("Jo1").receiptNumber);
//        System.out.println(getTestReceipt("Jo2").customer);
//        System.out.println("------------------------------------------------");
//        for (ReceiptLine rec : getTestReceipt("Jo3").receiptLines){
//            System.out.println(rec);
//        }
//    }
    
    
    
    
//    public static void main(String[] args) {
//        
//        FakeDatabase fd = new FakeDatabase();
//        
//        Customer customer1 = fd.findCustomer("100");
//        
//        
//        System.out.println(customer1.getCustomerName());
//        
//        Receipt rcpt1 = new Receipt(1,"John Nash");
//        
//        rcpt1.addReceiptLine("1111",20);
//        rcpt1.addReceiptLine("2222",30);
//        rcpt1.addReceiptLine("1111",20);
//        rcpt1.addReceiptLine("1111",20);
//        
//        System.out.println(rcpt1.receiptNumber);
//        System.out.println(rcpt1.customer);
//        
////        System.out.println(rcpt1.receiptLines[0].getQuantity());
////        System.out.println(rcpt1.receiptLines[0]);
//        
//        for (int j=0;j<rcpt1.receiptLines.length;j++){
//            System.out.println(rcpt1.receiptLines[j]);
//        }
//        System.out.println("------------------------------------------------");
//        for (ReceiptLine rec : rcpt1.receiptLines){
//            System.out.println(rec);
//        }
//        System.out.println("Array length: "+rcpt1.receiptLines.length);
////        System.out.println(rcpt1.receiptLines[0]);
////        System.out.println(rcpt1.receiptLines[1]);
//        
//        rcpt1.printReceipt();
//        
//    }
    
}
