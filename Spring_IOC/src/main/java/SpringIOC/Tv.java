package SpringIOC;

public class Tv implements Machine{

    @Override
    public void getMachineType() {
        System.out.println("Gadgets");
    }

    @Override
    public void getMachineName() {
        System.out.println("Machine Name TV");
    }
}
