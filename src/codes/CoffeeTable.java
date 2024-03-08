/**
 * Represents a coffee table, a furniture household item, with specific attributes in addition to common household attributes.
 * This class extends the Furniture class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class CoffeeTable extends Furniture
{
    private final boolean   hasStorage;
    private final String    tableShape;
    private final int       legCount;
    private final boolean   isExtendable;

    private static final String SHAPE_CIRCLE = "circle";
    private static final String SHAPE_SQUARE = "square";
    private static final String SHAPE_RECTANGLE = "rectangle";
    private static final String SHAPE_OTHER = "other";
    private static final int MIN_LEGCOUNT = 1;
    private static final int MAX_LEGCOUNT = 4;

    /**
     * Constructs a new HouseholdObjects instance.
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param isAssemblyRequired   True if assembly is required, else False
     * @param frameMaterial        The material of the frame
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public CoffeeTable(final String   householdObjectName,
                       final String   householdObjectBrand,
                       final double   priceCAD,
                       final String   householdObjectColor,
                       final boolean  isElectric,
                       final boolean  isAssemblyRequired,
                       final String   frameMaterial,
                       final boolean  hasStorage,
                       final String   tableShape,
                       final int      legCount,
                       final boolean  isExtendable)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric, isAssemblyRequired, frameMaterial);

        if(tableShape != null &&
                (
                        !tableShape.equalsIgnoreCase(SHAPE_CIRCLE)
                                && !tableShape.equalsIgnoreCase(SHAPE_SQUARE)
                                && !tableShape.equalsIgnoreCase(SHAPE_RECTANGLE)
                                && !tableShape.equalsIgnoreCase(SHAPE_OTHER)
                )
        )
        {
            throw new IllegalArgumentException("Invalid coffee table shape: " + tableShape);
        }

        if(legCount < MIN_LEGCOUNT || legCount > MAX_LEGCOUNT)
        {
            throw new IllegalArgumentException("Invalid coffee table leg count: " + legCount);
        }

        this.hasStorage     = hasStorage;
        this.tableShape     = tableShape;
        this.legCount       = legCount;
        this.isExtendable   = isExtendable;
    }

    /**
     * Checks if the coffee table has storage.
     * @return True if the coffee table has storage, false otherwise.
     */
    public boolean hasStorage()
    {
        return hasStorage;
    }

    /**
     * Gets the shape of the coffee table.
     * @return The shape of the coffee table.
     */
    public String getTableShape()
    {
        return tableShape;
    }

    /**
     * Gets the number of legs of the coffee table.
     * @return The number of legs.
     */
    public int getLegCount()
    {
        return legCount;
    }

    /**
     * Checks if the coffee table is extendable.
     * @return True if the coffee table is extendable, false otherwise.
     */
    public boolean isExtendable()
    {
        return isExtendable;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Coffee Table" for this class.
     */
    @Override
    public String getType()
    {
        return "Coffee Table";
    }
}
