import Models.Book;
import Models.Product;
import Models.Stationery;
import Models.Toy;

public class main1 {
    
    public static void main (String args[]){
        Book book = new Book("B001", "Lập trình Java", 10, 50.0, 80.0, "Nguyễn Văn A", "NXB XYZ", "123456789");
        Stationery pen = new Stationery("S001", "Bút bi xanh", 50, 2.0, 5.0, "Thiên Long", "Bút bi");
        Toy lego = new Toy("T001", "Bộ xếp hình Lego", 20, 100.0, 150.0, "Lego", 6);
        productManager.addProduct(book);
        
    }
}
