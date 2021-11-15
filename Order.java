public class Order {
    private final double TAX = 0.07;
    private double price;
    private int orderNum;

    private int orderSize;

    public Order(double price, int orderNum, int orderSize){
        this.price = (price * TAX) + price;
        this.orderNum = orderNum;
        this.orderSize = orderSize;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = (price * TAX) + price;
    }

    public int getOrderNum(){
        return orderNum;
    }
    public void setOrderNum(int orderNum){
        this.orderNum = orderNum;
    }

    public int getOrderSize(){
        return orderSize;
    }

    public String toString(){
        return "order " + orderNum + ", cost: " + price;
    }

}
