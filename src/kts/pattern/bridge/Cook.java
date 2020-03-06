package kts.pattern.bridge;

public class Cook extends IAction {
    public Cook(IRobot robot) {
        super(robot);
    }

    public void doCook() {
        System.out.println("Cooking...");
    }
}
