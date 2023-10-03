interface MarketBehaviour {
    void customerArrival(Actor actor);
    void customerDeparture(Actor actor);
    void updateMarketStatus();
}
