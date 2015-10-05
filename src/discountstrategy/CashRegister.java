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
    
    private Receipt[] receipts;
    private int receiptsCount;
    


    public CashRegister() {
        this.receipts = new Receipt[2];
    }
    
    
//    public static CashRegister getTestCashRegister(){
//        CashRegister cr = new CashRegister();
//        cr.addReceipt("John Nash");
//        cr.addReceipt("John Nash");
//         cr.addReceipt("John Nash");
//        return cr;
//    }
      public void addReceipt(int number,Customer customer){
        
        
//        ReceiptLine rl = new ReceiptLine();
        
//        Receipt r = new Receipt(Receipt.getTestReceipt());
          Receipt r = new Receipt(number,customer);
          
        
        addLine();
//        Receipt r = new Receipt(Receipt.getReceipt(prodId,quantity));
        

        
         receipts[receiptsCount]=r;        
        this.receiptsCount++;
    }
      
      public void addReceipt(Receipt receipt){
          addLine();
          receipts[receiptsCount]=receipt;
          this.receiptsCount++;
      }
      
         public void addLine(){
        Receipt[] temp = new Receipt[this.receipts.length+1];
        for (int i=0;i<this.receipts.length;i++) {
        temp[i]=this.receipts[i];
        }
        receipts = temp;
        temp=null;       
        
    }
      
//      public void printCashRegister(){
//          printTestReceipt(getTestReceipt());
//           cr.receipts[0].printReceipt();
//        System.out.println("-----------------------------------");
//         cr.receipts[1].printReceipt();
//      }
      
//      public void printCashRegister(){
//for (Receipt rec : getTestCashRegister().receipts[0].printReceipt()){
//            System.out.println(rec);
//        }
//      }
      
// public void printCashRegister(){
//     for (int i=0;i<getTestCashRegister().receipts.length;i++){
//         getTestCashRegister().receipts[i].printReceipt();     }
// }  
// 
 public void inputToCashRegister(){
//     CashRegister cr = new CashRegister();
     for (int i=0;i<2;i++){
//         Receipt r = new Receipt();
         InputReceiptStrategy input = new InputReceiptFromFakeDatabase();
//         receipt.inputReceipt();
         this.receipts[i]=input.inputReceipt();
//         cr.addReceipt(input.inputReceipt());
         
//         r.inputReceipt(); 
//         addReceipt();
     }
//     return cr;
 }
 
// public void outputFromCashRegister(){
//     
// }
 
 
 
 public void outputFromCashRegister(){
     
     
//     CashRegister cr = new Cas
     for (int i=0;i<2;i++){
         OutputReceiptStrategy output = new OutputReceiptToConsole();
         
         output.outputReceipt(this.receipts[i]);
         
         
     }
 }
      
      
    
    

//    public Receipt getReceipt() {
//        return receipt;
//    }

//    public void setReceipt(Receipt receipt) {
//        this.receipt = receipt;
//    }
    
//    public static void main(String[] args) {
//        
//        CashRegister cr = new CashRegister();
//        cr.addReceipt("John Nash");
//        cr.addReceipt("John Nash");
////        cr.setReceipt(getTestReceipt());
////        cr.getReceipt().
//        
//        cr.receipts[0].printReceipt();
//        System.out.println("-----------------------------------");
//         cr.receipts[1].printReceipt();
//         
//         cr.printCashRegister();
//        
//    }
    
   
    
}
