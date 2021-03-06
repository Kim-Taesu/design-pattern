package kts.pattern.decorator.decorator;

import kts.pattern.decorator.base.IceCream;

public class Melon extends Decorator {

    IceCream iceCream;

    public Melon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int price() {
        return 500 + iceCream.price();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 메론";
    }
}
