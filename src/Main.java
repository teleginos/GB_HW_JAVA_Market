public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр магазина
        Market market = new Market();

        // Массив из 10 человек с реальными именами
        Human[] humans = {
                new Human("Alice"),
                new Human("Bob"),
                new Human("Charlie"),
                new Human("David"),
                new Human("Eva"),
                new Human("Frank"),
                new Human("Grace"),
                new Human("Hannah"),
                new Human("Ivan"),
                new Human("Jasmine")
        };

        // Несколько человек одновременно заходят в магазин
        for (int i = 0; i < 3; i++) {
            market.customerArrival(humans[i]);
        }

        // Каждый человек делает заказ по очереди и затем уходит из магазина
        for (int i = 0; i < 3; i++) {
            Human currentHuman = humans[i];

            // Человек делает заказ
            currentHuman.setReadyToOrder(true);
            currentHuman.makeOrder();

            // Магазин принимает заказ
            market.acceptOrder(currentHuman);

            // Магазин передает заказ
            market.handOverOrder(currentHuman);

            // Человек уходит из магазина
            market.customerDeparture(currentHuman);

            // Проверяем статус магазина после ухода каждого человека
            market.updateMarketStatus();
        }

        // Если вы хотите продолжить этот процесс для всех 10 человек,
        // просто повторите вышеуказанные шаги для каждой группы из 3 человек.
    }
}
