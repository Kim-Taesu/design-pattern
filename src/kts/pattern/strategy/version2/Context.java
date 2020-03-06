package kts.pattern.strategy.version2;

public class Context {
    private int totalCost = 0;
    private boolean isClosed = false;

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
