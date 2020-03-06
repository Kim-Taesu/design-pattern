package kts.pattern.bridge;

public class Clean extends IAction {
    public Clean(IRobot robot) {
        super(robot);
    }

    public void doClean() {
        System.out.println("Cleaning...");
    }
}
