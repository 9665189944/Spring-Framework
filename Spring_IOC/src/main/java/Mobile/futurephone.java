package Mobile;

public class futurephone implements Mobile{

Battery battery;

public futurephone(Battery battery){
    this.battery=battery;

}

    @Override
    public void getType() {
        System.out.println("Mobile type futurephone");
    }

    @Override
    public void getBattery() {
   battery.getType();
    }
}
