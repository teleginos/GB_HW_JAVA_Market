import java.util.ArrayList;
import java.util.List;

class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void addToQueue(Actor actor) {
        if (!queue.contains(actor)) {
            queue.add(actor);
            System.out.println(actor.getName() + " has been added to the queue.");
        } else {
            System.out.println(actor.getName() + " is already in the queue.");
        }
    }

    @Override
    public void removeFromQueue(Actor actor) {
        if (queue.contains(actor)) {
            queue.remove(actor);
            System.out.println(actor.getName() + " has been removed from the queue.");
        } else {
            System.out.println(actor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void acceptOrder(Actor actor) {
        if (actor.isReadyToOrder()) {
            System.out.println("Accepted order from " + actor.getName() + ".");
        } else {
            System.out.println(actor.getName() + " is not ready to order.");
        }
    }

    @Override
    public void handOverOrder(Actor actor) {
        if (actor.isReadyToOrder()) {  // Используем isReadyToOrder вместо hasReceivedOrder
            System.out.println("Handed over the order to " + actor.getName() + ".");
            actor.setReceivedOrder(true);  // Устанавливаем флаг hasReceivedOrder в true
        } else {
            System.out.println(actor.getName() + " has not made an order yet.");
        }
    }

    @Override
    public void customerArrival(Actor actor) {
        System.out.println(actor.getName() + " has arrived at the market.");
        addToQueue(actor);
    }

    @Override
    public void customerDeparture(Actor actor) {
        System.out.println(actor.getName() + " has left the market.");
        removeFromQueue(actor);
    }

    @Override
    public void updateMarketStatus() {
        System.out.println("Market Status:");
        System.out.println("Number of customers in queue: " + queue.size());
    }
}

