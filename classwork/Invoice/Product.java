package Invoice;
public class Product {
    private String description;
    private float unitPrice;

    public Product() {

    }

    public Product(String description,float price){
        this.description=description;
        unitPrice=price;
    }

    public String getDescription(){
        return description;
    }

    public float getUnitPrice(){
        return unitPrice;
    }

    public static void main(String[] args) {
        Product pepsi = new Product("Pepsi",20f);
        Product Lays = new Product("Lays",35f);
    }
}
