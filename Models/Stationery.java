package Models;

public  class Stationery extends Product{
    private String thuong_hieu;
    private String type;

    public Stationery(String id, String name, int quantity, double purchase_price, double selling_price, String thuong_hieu, String type){
        super(id, name, quantity, purchase_price, selling_price);
        this.thuong_hieu = thuong_hieu;
        this.type= type;
    }


    @Override
     public void displayinfo(){
        System.out.println("Văn phòng phẩm: " + name + " - Thương hiệu: " + thuong_hieu + " - Loại: " + type);

    }
}
