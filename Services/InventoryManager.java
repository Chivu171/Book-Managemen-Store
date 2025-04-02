package Services;
import Models.Product;
import java.util.HashMap;
import java.util.Map;


public class InventoryManager {
    private Map<Product, Integer> stock = new HashMap<>();

    public void importStock(Product p , int quantity){
            stock.put(p , stock.getOrDefault(p,0) + quantity);
            System.out.println("Đã nhập hàng: "+quantity+" "+p.get_name());

    }

    public void exportStock(Product p , int quantity){
        if (stock.containsKey(p) && stock.get(p)>=quantity){
            stock.put(p,stock.get(p)-quantity);
            System.out.println("Đã xuất hàng: " + quantity + " " + p.get_name());
        }
        else {
            System.out.println("Không đủ số lượng hàng trong kho để xuất.");
        }
    }
    
    public void displayStock (){
        System.out.println("Danh sách kho hàng:");
        for (Map.entry<Product, Integer> entry : stock.entrySet()){
            System.out.println("Tên sản phẩm: "+ entry.getKey().get_name() + " Số lượng: " +entry.get(entry.getKey()));
        }
    }
}
