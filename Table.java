public class Table {
    private int space;
    private TableType type;
    private boolean inside;

    private boolean occupied;
    private int orderContained;

    public Table(int space, TableType type, boolean inside){
        this.space = space;
        this.type = type;
        this.inside = inside;

        this.occupied = false;
        this.orderContained = 0;
    }

    public int getSpace(){
        return space;
    }

    public TableType getType(){
        return type;
    }

    public boolean isInside(){
        return inside;
    }

    public boolean isOccupied(){
        return occupied;
    }
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public int getOrderContained(){
        return orderContained;
    }
    public void setOrderContained(int orderContained){
        this.orderContained = orderContained;
    }

    public String toString(){
        return space + " seats, " + type + ", inside: " + inside;
    }
}
