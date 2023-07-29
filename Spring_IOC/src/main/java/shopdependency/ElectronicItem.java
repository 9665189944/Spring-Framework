package shopdependency;

public class ElectronicItem implements Product{
    @Override
    public void getProductType() {
        System.out.println("Selling Electronic Item");
    }
}
