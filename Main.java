public class Main {
    public static void main(String[] args) {

        OrderCollection collection = new OrderCollection();
        Restaurant restaurant = new Restaurant();

        collection.addOrder(restaurant, 15.00, 4, TableType.BOOTH, true);
        collection.addOrder(restaurant, 20.00, 4, TableType.BOOTH, true);
        collection.addOrder(restaurant, 25.00, 4, TableType.BOOTH, true);

        System.out.println(collection);
        System.out.println(restaurant);

        collection.removeOrder(restaurant);
        collection.removeOrder(restaurant);
        collection.removeOrder(restaurant);
        collection.removeOrder(restaurant);

        System.out.println(collection);
        System.out.println(restaurant);
    }
}
