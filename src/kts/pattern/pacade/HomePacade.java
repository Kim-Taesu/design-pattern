package kts.pattern.pacade;

public class HomePacade {
    private Computer computer;
    private Television television;
    private Radio radio;

    public HomePacade(Computer computer, Television television, Radio radio) {
        this.computer = computer;
        this.television = television;
        this.radio = radio;
    }

    public void homeIn() {
        computer.turnOn();
        television.turnOn();
        radio.turnOn();
    }

    public void homeOut() {
        computer.turnOut();
        television.turnOut();
        radio.turnOut();
    }
}
