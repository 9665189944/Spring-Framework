package shopdependency;

public class GroceryShop implements shop{

     private GroceryItem item;

    public void setItem(GroceryItem item) {
        this.item = item;
    }

    @Override
    public void getshopType() {
        System.out.println("shop type is grocery");
    }

    @Override
    public void getProduct() {
        item.getProductType();
    }


}
