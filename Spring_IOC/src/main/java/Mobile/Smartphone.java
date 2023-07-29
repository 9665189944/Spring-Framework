package Mobile;

public class Smartphone  implements Mobile{
    Battery battery;

    public Smartphone(Battery battery){
        this.battery=battery;
    }


    @Override
    public void getType() {
        System.out.println("Mobile type Smartphone");
    }

    @Override
    public void getBattery() {
        battery.getType();
    }
}