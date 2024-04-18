import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Item {


    int itemId;
    String textOfItem;

    public Item(int id, String text){
        this.itemId = id;
        this.textOfItem = text;

    }

    public String getTextOfItem() {
        return textOfItem;
    }

    public int getItemId() {
        return itemId;
    }
}
