package kts.pattern.strategy.version1.tutorial;

public class Functions {
    Service service;

    public Functions() {
        this.service = new ServiceImpl();
    }

    // 기능 위임
    public void function1() {
        service.function1();

    }
}
