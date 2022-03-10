package lesson;

/**
 * Interface to represent an Item on a purchase order. An Item is 
 * considered equal to another item if it has the same name and the same
 * quantity.
 * 
 * DO NOT MODIFY
 */
public interface Item {

    /**
     * @return The Name of this item
     */
    public String getName();

    /**
     * Sets the name of this item
     * @param name
     */
    public void setName(String name);

    /**
     * @return The items quantity.
     */
    public String getQty();

    /**
     * Sets the quantity of this item.
     * @param qty
     */
    public void setQty(String qty);
}
