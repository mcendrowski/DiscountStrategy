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
        
//        Customer customer = new Customer();
//        customer.setCustomerAddress(null);
        
        
        
        
        CashRegister cr = new CashRegister();
        try{
        cr.startNewSale("100",new FakeDatabase()); }
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
            
        }

        try{
        cr.addItemLine("1111", 5);}
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
        }
        
         try{
        cr.addItemLine("2222", 10);}
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
        }
         
          try{
        cr.addItemLine("3333", 20);}
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
        }       
               
        
        try{
        cr.provideReceiptOutput(new OutputReceiptToConsole());}
        catch (MandatoryEntryException mee) {
            System.out.println(mee.getMessage());
        }
        cr.outputReceipt();
        
        
        try {
         cr.startNewSale("200",new FakeDatabase());}
          catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
            
        }
        
         try{
        cr.addItemLine("3333", 1);}
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
        }
         
          try{
        cr.addItemLine("1111", 5);}
        catch (MandatoryEntryException | NotFoundInDatabaseException mee){
            System.out.println(mee.getMessage());
        }       
        
               
        
        try{
        cr.provideReceiptOutput(new OutputReceiptToConsole());}
        catch (MandatoryEntryException mee) {
            System.out.println(mee.getMessage());
        }
        cr.outputReceipt();
        
        
 
    }
}
