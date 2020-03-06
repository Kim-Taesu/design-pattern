package kts.pattern.adaptor.usingClass;

public class TestPattern {
    public static void main(String[] args) {
        Stick stick = new StickImpl();
        stick.fight();

        Gun gun = new GunImpl();
        gun.fight();


        System.out.println("Gun User kill Stick User");
        stick.run();

        gun = new GunToStickAdaptor(stick);
        gun.fight();
        gun.run();
    }
}
