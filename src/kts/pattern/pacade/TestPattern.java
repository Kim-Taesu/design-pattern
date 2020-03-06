package kts.pattern.pacade;

public class TestPattern {
    public static void main(String[] args) {
        Television television = new Television();
        Radio radio = new Radio();
        Computer computer = new Computer();

        // pacade 패턴을 사용하여 한번에 전원을 켜고 끄기
        HomePacade homePacade = new HomePacade(computer, television, radio);

        homePacade.homeIn();
        homePacade.homeOut();
    }
}
