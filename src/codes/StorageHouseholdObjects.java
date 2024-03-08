import java.util.ArrayList;
import java.util.List;

/**
 * Represents a storage for household objects.
 * It allows adding, removing, and displaying household objects.
 * This class can store objects of any class that extends HouseholdObjects.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */

public class StorageHouseholdObjects {
    private List<HouseholdObjects> items;

    /**
     * Constructs a new StorageHouseholdObjects instance.
     */
    public StorageHouseholdObjects()
    {
        items = new ArrayList<>();
    }

    /**
     * Adds a household object to the storage.
     * @param item The household object to add.
     */
    public void addItem(final HouseholdObjects item)
    {
        items.add(item);
    }


    /**
     * Removes a household object from the storage.
     * @param item The household object to remove.
     */
    public void removeItem(final HouseholdObjects item)
    {
        items.remove(item);
    }

    /**
     * Displays all household objects stored in the storage.
     */
    public void displayItems()
    {
        for(final HouseholdObjects item : items)
        {
            System.out.println("Household Object Name: " + item.getHouseholdObjectName() + ", Household Object Type: " + item.getType());
        }
    }

    /**
     * Gets the number of household objects stored in the storage.
     * @return The number of household objects stored.
     */
    public int getNumberOfItems()
    {
        return items.size();
    }
}
     