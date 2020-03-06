package kts.pattern.adaptor.usingClass;

public class GunToStickAdaptor extends Gun implements Stick {

    private Stick stick;

    public GunToStickAdaptor(Stick stick) {
        this.stick = stick;
    }

    // Gun 사용자는 Stick의 사용법을 모르지만 Adaptor를 사용하여 Stick을 사용
    @Override
    public void fight() {
        System.out.print("Gun User Using Adaptor : ");
        stick.fight();
    }

    @Override
    public void run() {
        System.out.print("Gun User Using Adaptor : ");
        stick.run();
    }
}
