/**
 * Represents a dishwasher, an electronic household item, with specific attributes in addition to common household attributes.
 * This class extends Electronics class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Dishwasher extends Electronics
{
    private final int dishwasherWidthInches;
    private final int numberOfRacks;
    private final String dishwasherType;

    private static final int MIN_DISHWASHER_WIDTH = 24;
    private static final int MAX_DISHWASHER_WIDTH = 42;
    private static final int MIN_NUMBER_OF_RACKS = 2;
    private static final int MAX_NUMBER_OF_RACKS = 3;
    private static final String TYPE_BUILTIN = "builtin";
    private static final String TYPE_PORTABLE = "portable";

    /**
     * Constructs a new Dishwasher instance.
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param voltageV             The voltage requirement of the dishwasher.
     * @param itemConnectivity     The type of connectivity of the dishwasher.
     * @param powerSource          The type of power source for the dishwasher.
     * @param dishwasherWidthInches The width of the dishwasher in inches.
     * @param numberOfRacks        The number of racks in the dishwasher.
     * @param dishwasherType       The type of dishwasher.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public Dishwasher(final String  householdObjectName,
                      final String  householdObjectBrand,
                      final double  priceCAD,
                      final String  householdObjectColor,
                      final boolean isElectric,
                      final int     voltageV,
                      final String  itemConnectivity,
                      final String  powerSource,
                      final int     dishwasherWidthInches,
                      final int     numberOfRacks,
                      final String  dishwasherType)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric, voltageV, itemConnectivity, powerSource);

        if(dishwasherWidthInches < MIN_DISHWASHER_WIDTH || dishwasherWidthInches > MAX_DISHWASHER_WIDTH)
        {
            throw new IllegalArgumentException("Invalid dishwasher width: " + dishwasherWidthInches + " inches");
        }

        if(numberOfRacks < MIN_NUMBER_OF_RACKS || numberOfRacks > MAX_NUMBER_OF_RACKS)
        {
            throw new IllegalArgumentException("Invalid number of racks: " + numberOfRacks);
        }

        if(!dishwasherType.equalsIgnoreCase(TYPE_BUILTIN) && !dishwasherType.equalsIgnoreCase(TYPE_PORTABLE))
        {
            throw new IllegalArgumentException("Invalid dishwasher type: " + dishwasherType);
        }

        this.dishwasherWidthInches  = dishwasherWidthInches;
        this.numberOfRacks          = numberOfRacks;
        this.dishwasherType         = dishwasherType;
    }

    /**
     * Gets the width of the dishwasher in inches.
     * @return The width of the dishwasher.
     */
    public int getDishwasherWidthInches()
    {
        return dishwasherWidthInches;
    }


    /**
     * Gets the number of racks in the dishwasher.
     * @return The number of racks.
     */
    public int getNumberOfRacks()
    {
        return numberOfRacks;
    }

    /**
     * Gets the type of dishwasher.
     * @return The type of dishwasher.
     */
    public String getDishwasherType()
    {
        return dishwasherType;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Dishwasher" for this class.
     */
    @Override
    public String getType()
    {
        return "Dishwasher";
    }
}
