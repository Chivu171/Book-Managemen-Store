
import Models.Product;
import java.util.ArrayList;
import java.util.List;




public class ProductManager {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Đã thêm sản phẩm " + product.get_name());
    }   
    public void updateProduct (String id, String new_name, double newPrice){
        for (Product p : products){
            if (p.get_id().equals( id)){
                p.name = new_name;
                p.selling_price= newPrice;
                System. out.println("Đã cập nhật sản phẩm " + p.get_name());
                return;
            }
            else  System. out.println("Không tìm thấy sản phẩm ");
        }

    }
    public void deleteProduct (String id){
        Product p;
        products.removeIf(p->p.get_id().equals(id));
        System.out.println("Đã xoá sản phẩm có Id là: " + id);
    }
    
    public Product searchProduct(String name){
        for (Product p : products){
            if (p.get_name().equals(name)){
                return p;
            } 
            
        }
         return null;
    }
}
