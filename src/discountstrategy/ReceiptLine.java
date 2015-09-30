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

    public ReceiptLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ReceiptLine() {
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setProduct(Product product) {
        this.product = product;
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
        Product product = new Product("1111","ABCD",2.50,new QtyDiscount(0.10,3));
        ReceiptLineStrategy rl = new ReceiptLine();
        rl.setProduct(product);
        rl.setQuantity(20);
        System.out.println(rl);
        
        Product product2 = new Product("2222","EFGH",4,new PercentOffDiscount(0.30));
        ReceiptLineStrategy rl2 = new ReceiptLine();
        rl2.setProduct(product2);
        rl2.setQuantity(20);
        System.out.println(rl2);
        
    }

    
    
    
}
