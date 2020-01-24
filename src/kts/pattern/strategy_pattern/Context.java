package kts.pattern.strategy_pattern;

public class Context {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
