package kts.pattern.strategy_pattern.obj;

public class Client {
    private String name;
    private Integer cash;
    private Integer card;

    public Client(String name, Integer cash, Integer card) {
        this.name = name;
        this.cash = cash;
        this.card = card;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }


    @Override
    public String toString() {
        return "Client " + "\t이름: " + name +
                ", \tmoney: " + cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }
}
