package Models;
public class Book extends Product {
    private String Author_Name;
    private String NXB;

    public Book(String id, String name, int quantity, double purchase_price, double selling_price, String Author_Name, String NXB){
        super(id, name, quantity, purchase_price, selling_price);
        this.Author_Name = Author_Name;
        this.NXB = NXB;
    }
    public void displayinfo() {
            System.out.println("ID:" + this.id);
            System.out.println("Tên sách:" + this.name);
            System.out.println("Tên tác giả:" + this.Author_Name);
            System.out.println("Nhà xuất bản: "+ this.NXB);
    }
}
