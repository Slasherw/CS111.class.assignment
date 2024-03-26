package Invoice;

public class LineItem {
    private int qty;
    private Product product;
   
    public LineItem(){

    }

    public LineItem(Product p,int qty){
        product=p;
        this.qty=qty;
    }

    public double getTotal(){
        return (double)(qty*product.getUnitPrice());
    }
}
