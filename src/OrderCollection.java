import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class OrderCollection {
    private Queue<Order> orderQueue;
    private int totalCount;

    public OrderCollection(){
        orderQueue = new LinkedList<Order>();
        totalCount = 1;
    }

    public void addOrder(Restaurant rs, double price, int orderSize, TableType type, boolean inside){

        if (rs.getMaxSpace() < orderSize){
            System.out.println("Restaurant has no tables large enough");
            return;
        }
        
        List<Table> tableList = rs.getTableList();
        for (int i = 0; i < tableList.size(); i++){
            Table currTable = tableList.get(i);
            if (!(rs.getOccupiedTables().contains(currTable)) && currTable.getSpace() >= orderSize && currTable.getType() == type && currTable.isInside() == inside){
                Order order = new Order(price, totalCount, orderSize);
                orderQueue.offer(order);

                System.out.println("Order added: " + order.getOrderNum());
                System.out.println("Table " + (i + 1) + " is now occupied");

                rs.getOccupiedTables().add(currTable);
                currTable.setOccupied(true);
                currTable.setOrderContained(order.getOrderNum());
                totalCount++;
                return;
            }
        }
        
        System.out.println("No tables qualify currently");
    }

    public void removeOrder(Restaurant rs){
        if(orderQueue.size() <= 0){
            System.out.println("No more orders in queue");
            return;
        }

        Order currOrder = orderQueue.poll();
        System.out.println("Order done: " + currOrder.getOrderNum());
        for (int i = 0; i < rs.getTableList().size(); i++){
            Table currTable = rs.getTableList().get(i);
            if (currTable.getOrderContained() == currOrder.getOrderNum()){
                rs.getOccupiedTables().set(rs.getOccupiedTables().size() - 1, null);
                currTable.setOrderContained(0);
                currTable.setOccupied(false);
                break;
            }
        }
    }
    
    public int getTotalCount() {
    	return totalCount;
    }

    public String toString(){
        String orders = "\n";

        for (Order order : orderQueue){
            orders += order + "\n";
        }

        return orders;
    }
}
