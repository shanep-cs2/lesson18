package lesson;

public class ListItem {
    private String item;

    public ListItem() {
        item = "";
    }

    public ListItem(String itemInit) {
        this.item = itemInit;
    }
    
    @Override
    public String toString(){
        return item;
    }
}
