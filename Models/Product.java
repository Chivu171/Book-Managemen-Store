
public class Product {
    protected String id;
    protected String name;
    protected int quantity;
    protected double purchase_price;
    protected double selling_price;

    public Product(String id, String name, int quantity, double purchase_price, double selling_price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.selling_price= selling_price;
        this.purchase_price = purchase_price;
    }
    public abstract void displayinfo();
    
    double get_profit(){
        return quantity*(selling_price- purchase_price);
    }
    String get_id(){
        return id;
    }
    String get_name(){
        return name;
    }
}
