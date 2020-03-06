package kts.pattern.bridge;

public class Robot2 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type 2 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type 2 : power off");
    }
}
