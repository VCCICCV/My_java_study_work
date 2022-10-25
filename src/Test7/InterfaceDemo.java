package Test7;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/25 8:46
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        bike.start();
        bike.stop();
        bus.start();
        bus.stop();
    }
}
class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike started~");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped~");
    }
}
class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bus started~");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped~");
    }
}
interface Vehicle{
    void start();
    void stop();
}