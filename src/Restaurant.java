import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {
    
    private List<Table> tableList;
    private List<Table> occupiedTables;
    private int maxSpace;
    
    public Restaurant(){

        tableList = new ArrayList<Table>();
        occupiedTables = new LinkedList<Table>();

        tableList.add(new Table(4, TableType.BOOTH, true));
        tableList.add(new Table(4, TableType.BOOTH, true));
        tableList.add(new Table(4, TableType.BOOTH, true));
        tableList.add(new Table(4, TableType.BOOTH, true));

        tableList.add(new Table(4, TableType.NORMAL, true));
        tableList.add(new Table(4, TableType.NORMAL, true));
        tableList.add(new Table(3, TableType.NORMAL, true));
        tableList.add(new Table(3, TableType.NORMAL, true));

        tableList.add(new Table(3, TableType.HIGHTOP, true));
        tableList.add(new Table(3, TableType.HIGHTOP, true));
        tableList.add(new Table(2, TableType.HIGHTOP, true));
        tableList.add(new Table(2, TableType.HIGHTOP, true));

        tableList.add(new Table(4, TableType.NORMAL, false));
        tableList.add(new Table(4, TableType.NORMAL, false));
        tableList.add(new Table(4, TableType.NORMAL, false));
        tableList.add(new Table(4, TableType.NORMAL, false));

        int max = 2;
        for (Table table : tableList){
            if (table.getSpace() > max) max = table.getSpace();
        }

        this.maxSpace = max;
    }

    public List<Table> getTableList(){
        return tableList;
    }

    public List<Table> getOccupiedTables(){
        return occupiedTables;
    }

    public int getMaxSpace(){
        return maxSpace;
    }

    public String toString(){
        String tables = "\n";

        for (int i = 0; i < tableList.size(); i++){
            tables += "table " + (i + 1) + ", occupied: " + tableList.get(i).isOccupied() + "\n";
        }

        return tables;
    }

}
