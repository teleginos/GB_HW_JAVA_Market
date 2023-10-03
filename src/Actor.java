abstract class Actor {
    protected String name;
    protected boolean isReadyToOrder;
    protected boolean hasReceivedOrder;

    public Actor(String name) {
        this.name = name;
        this.isReadyToOrder = false;
        this.hasReceivedOrder = false;
    }

    public String getName() {
        return name;
    }

    public boolean isReadyToOrder() {
        return isReadyToOrder;
    }

    public boolean hasReceivedOrder() {
        return hasReceivedOrder;
    }

    protected void setReadyToOrder(boolean isReadyToOrder) {
        this.isReadyToOrder = isReadyToOrder;
    }

    protected void setReceivedOrder(boolean hasReceivedOrder) {
        this.hasReceivedOrder = hasReceivedOrder;
    }
}
