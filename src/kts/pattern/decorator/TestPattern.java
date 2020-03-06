package kts.pattern.decorator;

import kts.pattern.decorator.base.IceCream;
import kts.pattern.decorator.base.IceCreamCake;
import kts.pattern.decorator.base.IceCreamCone;
import kts.pattern.decorator.base.IcePop;
import kts.pattern.decorator.decorator.Melon;
import kts.pattern.decorator.decorator.Strawberry;

public class TestPattern {
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCreamCone();
        System.out.println(iceCream1.getDescription() + " cost : " + iceCream1.price());

        IceCream iceCream2 = new Strawberry(new IceCreamCake());
        System.out.println(iceCream2.getDescription() + " cost : " + iceCream2.price());

        IceCream iceCream3 = new Melon(new Strawberry(new IcePop()));
        System.out.println(iceCream3.getDescription() + " cost : " + iceCream3.price());
    }
}
