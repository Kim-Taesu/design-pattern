package kts.pattern.bridge;

public class TestPattern {
    public static void main(String[] args) {
        IRobot robot = new Robot1();
        Clean clean = new Clean(robot);
        clean.powerOn();
        clean.doClean();
        clean.powerOff();

        robot = new Robot2();
        Cook cook = new Cook(robot);
        cook.powerOn();
        cook.doCook();
        cook.powerOff();
    }
}
