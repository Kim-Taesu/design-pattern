package kts.pattern.bridge;

public class Robot1 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type 1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type 1 : power off");
    }
}
