interface QueueBehaviour {
    void addToQueue(Actor actor);
    void removeFromQueue(Actor actor);
    void acceptOrder(Actor actor);
    void handOverOrder(Actor actor);
}
