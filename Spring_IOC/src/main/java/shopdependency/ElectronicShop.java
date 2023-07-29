package shopdependency;

public class ElectronicShop implements shop {

    private ElectronicItem item;


    public void setItem(ElectronicItem item) {
        this.item = item;
    }

    @Override
    public void getshopType() {
        System.out.println("Electronic shop");
    }

    @Override
    public void getProduct() {
             item.getProductType();
    }
}
