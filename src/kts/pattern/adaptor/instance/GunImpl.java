package kts.pattern.adaptor.instance;

public class GunImpl implements Gun {

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
