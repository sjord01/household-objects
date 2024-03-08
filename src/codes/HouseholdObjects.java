/**
 * Represents a household object with common attributes such as item name, material, color, and price.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class HouseholdObjects
{
    private final String    householdObjectName;
    private final String    householdObjectBrand;
    private final double    priceCAD;
    private final String    householdObjectColor;
    private final boolean   isElectric;

    private static final int MIN_ITEM_NAME = 2;
    private static final int MAX_ITEM_NAME = 30;
    private static final int MIN_PRICE_CAD = 0;

    /**
     * Constructs a new HouseholdObjects instance.
     *
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public HouseholdObjects(final String  householdObjectName,
                            final String  householdObjectBrand,
                            final double  priceCAD,
                            final String  householdObjectColor,
                            final boolean isElectric)
    {
        if(householdObjectName == null)
        {
            throw new NullPointerException("Invalid item name: null");
        }

        if(householdObjectName.length() < MIN_ITEM_NAME || householdObjectName.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item name: " + householdObjectName);
        }

        if(householdObjectBrand == null)
        {
            throw new NullPointerException("Invalid item brand: null");
        }

        if(householdObjectBrand.length() < MIN_ITEM_NAME || householdObjectBrand.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item brand: " + householdObjectBrand);
        }

        if(priceCAD <= MIN_PRICE_CAD)
        {
            throw new IllegalArgumentException("Invalid price: " + priceCAD);
        }

        if(householdObjectColor == null)
        {
            throw new NullPointerException("Invalid item color: null");
        }

        if(householdObjectColor.length() < MIN_ITEM_NAME || householdObjectColor.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item color: " + householdObjectColor);
        }

        this.householdObjectName    = householdObjectName;
        this.householdObjectBrand   = householdObjectBrand;
        this.priceCAD               = priceCAD;
        this.householdObjectColor   = householdObjectColor;
        this.isElectric             = isElectric;
    }

    /**
     * Gets the name of the household object.
     * @return The name of the household object.
     */
    public String getHouseholdObjectName()
    {
        return householdObjectName;
    }

    /**
     * Gets the brand of the household object.
     * @return The brand of the household object.
     */
    public String getHomeObjectBrand()
    {
        return householdObjectBrand;
    }

    /**
     * Gets the price in CAD of the household object.
     * @return The price in CAD of the household object.
     */
    public double getPriceCAD()
    {
        return priceCAD;
    }

    /**
     * Gets the color of the household object.
     * @return The color of the household object.
     */
    public String getHouseholdObjectColor()
    {
        return householdObjectColor;
    }

    /**
     * Checks if the household object is electrically powered.
     * @return True if the household object is electrically powered, false otherwise.
     */
    public boolean isElectric()
    {
        return isElectric;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object.
     */
    public String getType()
    {
        return "Home Object";
    }
}