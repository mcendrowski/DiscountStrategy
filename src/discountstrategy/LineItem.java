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
public class LineItem implements LineItemStrategy {

    private Product product;
    private int quantity;
    private ReceiptDataAccessStrategy database;
//    private FakeDatabase fd;

    public LineItem(String prodId, int quantity, ReceiptDataAccessStrategy productData) {
        this.product = productData.findProduct(prodId);
        this.quantity = quantity;
        this.database = productData;
    }

    public LineItem() {
    }

    public LineItem(LineItem rl) {
        this.product = rl.product;
        this.quantity = rl.quantity;
    }

    @Override
    public final Product getProduct() {
        return product;
    }

    @Override
    public final void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public final int getQuantity() {
        return quantity;
    }

    @Override
    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final double getValueAfterDiscount() {
        return this.getValueBeforeDiscount() - this.getTotalDiscount();
    }

    public final double getValueBeforeDiscount() {
        return this.product.getUnitPrice() * this.quantity;
    }

    @Override
    public final double getTotalDiscount() {
        return this.product.getDiscount().getAmountSaved(this.product.getUnitPrice(), this.quantity);
    }

    @Override
    public final String toString() {
        String lineDetails = "";
        lineDetails += this.product.getProdId() + "\t";
        lineDetails += this.product.getName() + "\t\t";
        lineDetails += this.product.getUnitPrice() + "\t";
        lineDetails += this.getQuantity() + "\t";
        lineDetails += this.getValueBeforeDiscount() + "\t\t";
        lineDetails += getTotalDiscount() + "\t";
//        lineDetails+=getValueAfterDiscount();
        return lineDetails;
    }

}
