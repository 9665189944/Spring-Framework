package shopdependency;

public class GroceryItem implements Product{

    @Override
    public void getProductType() {
        System.out.println("selling Item is Grocery");
    }
}
