package Models;

public class Toy extends Product {
    
    private String thuong_hieu;
    private String do_tuoi_phu_hop;

    public Toy(String id, String name, int quantity, double purchase_price, double selling_price, String thuong_hieu, String do_tuoi_phu_hop){
        super(id, name, quantity, purchase_price, selling_price);
        this.thuong_hieu = thuong_hieu;
        this.do_tuoi_phu_hop = do_tuoi_phu_hop;

    }
    @Override
    public void displayinfo() {
        System.out.println("Đồ chơi: " + name + " - Thương hiệu: " + thuong_hieu + " - Độ tuổi: " + do_tuoi_phu_hop + "+");
    }
    
}