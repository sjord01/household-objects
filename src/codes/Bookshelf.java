/**
 * Represents a bookshelf, a furniture household item, with specific attributes in addition to common household attributes.
 * This class extends the HouseholdObjects class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Bookshelf extends Furniture
{
    private final int     shelfCount;
    private final String  shelfMaterial;

    private static final int MIN_SHELF_COUNT = 1;
    private static final int MAX_SHELF_COUNT = 8;
    private static final String MATERIAL_OAK = "oak";
    private static final String MATERIAL_CHESTNUT = "chestnut";
    private static final String MATERIAL_MAHOGANY = "mahogany";

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
    public Bookshelf(final String  householdObjectName,
                     final String  householdObjectBrand,
                     final double  priceCAD,
                     final String  householdObjectColor,
                     final boolean isElectric,
                     final boolean isAssemblyRequired,
                     final String  frameMaterial,
                     final int     shelfCount,
                     final String  shelfMaterial)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric, isAssemblyRequired, frameMaterial);

        if(shelfCount < MIN_SHELF_COUNT || shelfCount > MAX_SHELF_COUNT)
        {
            throw new IllegalArgumentException("Invalid shelf count: " + shelfCount);
        }

        if(shelfMaterial != null &&
                (
                        !shelfMaterial.equalsIgnoreCase(MATERIAL_CHESTNUT)
                        && !shelfMaterial.equalsIgnoreCase(MATERIAL_MAHOGANY)
                        && !shelfMaterial.equalsIgnoreCase(MATERIAL_OAK)
                )
        )
        {
            throw new IllegalArgumentException("Invalid shelf material: " + shelfMaterial);
        }

        this.shelfCount     = shelfCount;
        this.shelfMaterial  = shelfMaterial;
    }

    /**
     * Gets the number of shelves in the bookshelf.
     * @return The number of shelves.
     */
    public int getShelfCount()
    {
        return shelfCount;
    }

    /**
     * Gets the material of the shelves.
     * @return The material of the shelves.
     */
    public String getShelfMaterial()
    {
        return shelfMaterial;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Bookshelf" for this class.
     */
    @Override
    public String getType()
    {
        return "Bookshelf";
    }

}
