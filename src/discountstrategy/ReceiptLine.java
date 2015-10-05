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
public class ReceiptLine implements ReceiptLineStrategy {
    private Product product;
    private int quantity;
//    private FakeDatabase fd;

    public ReceiptLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ReceiptLine() {
    }
    
    public ReceiptLine(ReceiptLine rl){
        this.product=rl.product;
        this.quantity=rl.quantity;
    }
    
//    public ReceiptLine getReceiptLine(){
//        return this.
//    }
    
    
    
    
//    public void setReceiptLine(){
//        this.product=getProduct("AAAA");
//        
//    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public static ReceiptLine getTestReceiptLine(){
        FakeDatabase fd = new FakeDatabase();        
        Product prod1 = fd.findProduct("1111");
//        this.product=prod1;
        ReceiptLine rl = new ReceiptLine();
        rl.product=prod1;
        rl.quantity=20;
        return rl;
    }
    
     public static ReceiptLine getReceiptLine(String prodId,int quantity){
        FakeDatabase fd = new FakeDatabase();        
        Product prod1 = fd.findProduct(prodId);
//        this.product=prod1;
        ReceiptLine rl = new ReceiptLine();
        rl.product=prod1;
        rl.quantity=quantity;
        return rl;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public final double getValueAfterDiscount(){
       return this.product.getUnitPrice()*this.quantity-this.getTotalDiscount();
    }
    
    @Override
    public final double getTotalDiscount(){
//        return this.product.getDiscount().getDiscountedProductTotal(this.product.getUnitPrice(), this.quantity);
        return this.product.getDiscount().getAmountSaved(this.product.getUnitPrice(),this.quantity);
//    return this.product.getDiscount().getAmountSaved(this., quantity);
//        return this.product.getDiscount().getAmountSaved(this., quantity);
    }
    
//    @Override
//    public double getTotalDiscount(double unitPrice, int qty) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    @Override
    public String toString(){
        String lineDetails="";
        lineDetails+="ProdId: "+this.product.getProdId()+"\t";
        lineDetails+="Name: "+this.product.getName()+"\t";
        lineDetails+="UnitPrice: "+this.product.getUnitPrice()+"\t";
        lineDetails+="Quantity: "+this.getQuantity()+"\t";
        lineDetails+="Discount: "+getTotalDiscount()+"\t";
        lineDetails+="Value: "+getValueAfterDiscount();
        return lineDetails;
    }
    
    public static void main(String[] args) {
        
        FakeDatabase fd = new FakeDatabase();
        
//        System.out.println(fd.showNumber());
        
        
        
        Product prod1 = fd.findProduct("1111");
        
        
        System.out.println(prod1.getName());
        
        ReceiptLineStrategy rl1 = new ReceiptLine();
        rl1.setProduct(prod1);
        rl1.setQuantity(20);
        System.out.println(rl1);
        
        Product prod2 = fd.findProduct("2222");
        
        System.out.println(prod2.getName());
        
        ReceiptLineStrategy rl2 = new ReceiptLine();
        rl2.setProduct(prod2);
        rl2.setQuantity(9);
        System.out.println(rl2);
        
        
        
       
        
        
//        Product prod1 = new Product();
        
//        Product product = copyProduct()
        
        
//        Product product = new Product("1111","ABCD",2.50,new QtyDiscount(0.10,3));
//        ReceiptLineStrategy rl = new ReceiptLine();
//        rl.setProduct(product);
//        rl.setQuantity(20);
//        System.out.println(rl);
//        
//        Product product2 = new Product("2222","EFGH",4,new PercentOffDiscount(0.30));
//        ReceiptLineStrategy rl2 = new ReceiptLine();
//        rl2.setProduct(product2);
//        rl2.setQuantity(20);
//        System.out.println(rl2);
        
        
        
    }

    
    
    
}
