/**
 * This class serves as the driver program to demonstrate the functionality of the StorageHouseholdObjects class.
 * It creates instances of various household items and adds them to the storage inventory.
 * Finally, it displays the items stored in the inventory along with the total number of items.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Driver
{
    public static void main(final String[] args)
    {
        StorageHouseholdObjects houseInventory;
        houseInventory = new StorageHouseholdObjects();

        Bookshelf bookshelf = new Bookshelf("Bookshelf1", "Brand1", 100.0, "Brown", false, true, "Wood", 5, "Oak");
        CoffeeTable coffeeTable = new CoffeeTable("CoffeeTable1", "Brand2", 150.0, "Black", false, true, "Metal", true, "Rectangle", 4, false);
        Dishwasher dishwasher = new Dishwasher("Dishwasher1", "Brand3", 500.0, "White", true, 120, "WiFi", "AC", 30, 3, "builtin");
        Television television = new Television("Television1", "Brand4", 1000.0, "Black", true, 240, "WiFi", "AC", 50.0, "4k", 120, true);
        Toaster toaster = new Toaster("Toaster1", "Brand5", 50.0, "Silver", true, 120, "Bluetooth", "AC", 3, true);

        houseInventory.addItem(bookshelf);
        houseInventory.addItem(dishwasher);
        houseInventory.addItem(coffeeTable);
        houseInventory.addItem(television);
        houseInventory.addItem(toaster);

        houseInventory.displayItems();

        System.out.println("Number of household items in the inventory/storage: " + houseInventory.getNumberOfItems());
    }
}
