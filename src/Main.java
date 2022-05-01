public class Main {
    public static void main(String[] args) {

        OrderCollection collection = new OrderCollection();
        Restaurant restaurant = new Restaurant();

        collection.addOrder(restaurant, 15.00, 4, TableType.BOOTH, true);
        collection.addOrder(restaurant, 20.00, 4, TableType.BOOTH, true);
        collection.addOrder(restaurant, 25.00, 4, TableType.BOOTH, true);
        collection.addOrder(restaurant, 23.75, 3, TableType.HIGHTOP, true);
        collection.addOrder(restaurant, 25.00, 2, TableType.HIGHTOP, true);
        collection.addOrder(restaurant, 27.50, 3, TableType.NORMAL, false);
        collection.addOrder(restaurant, 40.00, 4, TableType.NORMAL, false);

        System.out.println(collection);
        System.out.println(restaurant);

        int count = collection.getTotalCount();
        for (int i = 0; i < count; i++)
        	collection.removeOrder(restaurant);

        System.out.println(collection);
        System.out.println(restaurant);
    }
}
