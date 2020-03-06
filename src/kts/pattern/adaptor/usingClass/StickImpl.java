package kts.pattern.adaptor.usingClass;

public class StickImpl implements Stick {
    private final String tool = "Stick";

    @Override
    public void fight() {
        System.out.printf("%s User Fight\n", this.tool);
        action();
    }

    private void action() {
        System.out.println("\tSmash");
    }

    @Override
    public void run() {
        System.out.printf("%s User Run\n", this.tool);
    }
}
