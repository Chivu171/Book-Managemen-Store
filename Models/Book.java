package Models;

public class Book extends Product {
    private String Author_Name;
    private String NXB;

    public Book(String id, String name, int quantity, double purchase_price, double selling_price, String Author_Name, String NXB){
        super(id, Author_Name, quantity, purchase_price, selling_price);
        this.Author_Name = Author_Name;
        this.NXB = NXB;
    }
    @Override
    public void displayinfo() {
            System.out.println("ID:" + id);
            System.out.println("Tên sách:" + name);
            System.out.println("Tên tác giả:" + Author_Name);
            System.out.println("Nhà xuất bản: "+NXB);
    }
}
