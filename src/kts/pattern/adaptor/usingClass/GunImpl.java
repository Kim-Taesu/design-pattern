package kts.pattern.adaptor.usingClass;

public class GunImpl extends Gun {

    private final String tool = "Gun";

    @Override
    public void fight() {
        System.out.printf("%s User Fight \n", this.tool);
        action();
    }

    private void action() {
        System.out.println("\tShoot");
    }

    @Override
    public void run() {
        System.out.printf("%s User Run\n", this.tool);
    }
}
