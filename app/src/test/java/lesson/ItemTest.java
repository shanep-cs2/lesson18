package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ItemTest {

    @Test
    public void testEquals() {
        Item first = new MyItem("foo", "bar");
        Item second = new MyItem("foo", "bar");
        assertEquals(first, second);
        Item notequal = new MyItem("bar", "foo");
        assertNotEquals(first, notequal);
        assertNotEquals(second, notequal);

        Item nullItem = new MyItem();
        assertNotEquals(first, nullItem);
        assertNotEquals(notequal, nullItem);
    }

    @Test
    public void testName(){
        Item i = new MyItem();
        assertNull(i.getName());
        i.setName("hello");
        assertEquals(i.getName(), "hello");
    }

    @Test
    public void testQty(){
        Item i = new MyItem();
        assertNull(i.getQty());
        i.setQty("qty");
        assertEquals(i.getQty(), "qty");
    }

    @Test
    public void testParseItems() {
        List<String> rawItems  = new ArrayList<String>();
        rawItems.add("steel 4lbs");
        rawItems.add("bolts 23lbs");
        rawItems.add("aluminum 2units");

        List<Item> items = MyItem.parseItems(rawItems.iterator());
        //index 0 should be steel
        //index 1 should be bolts
        //index 2 should be aluminum
        assertEquals(items.get(0).getName(), "steel");
        assertEquals(items.get(0).getQty(), "4lbs");

        assertEquals(items.get(1).getName(), "bolts");
        assertEquals(items.get(1).getQty(), "23lbs");

        assertEquals(items.get(2).getName(), "aluminum");
        assertEquals(items.get(2).getQty(), "2units");
    }
}
