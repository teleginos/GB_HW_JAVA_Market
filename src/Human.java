class Human extends Actor implements ActorBehavior {

    public Human(String name) {
        super(name);
    }

    @Override
    public void makeOrder() {
        if (!isReadyToOrder) {
            System.out.println(name + " is not ready to order yet.");
            return;
        }
        System.out.println(name + " has made an order.");
    }

    @Override
    public void receiveOrder() {
        if (!hasReceivedOrder) {
            System.out.println(name + " has not received the order yet.");
            return;
        }
        System.out.println(name + " has received the order.");
    }

    @Override
    public void waitInLine() {
        System.out.println(name + " is waiting in line.");
    }
}
