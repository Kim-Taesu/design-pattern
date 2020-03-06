package kts.pattern.decorator.base;

public abstract class IceCream {
    protected String description = "";

    public abstract int price();

    public String getDescription() {
        return description;
    }
}
