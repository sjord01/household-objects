/**
 * Represents a furniture household item with specific attributes in addition to common household attributes.
 * This class extends HouseHoldObjects class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Furniture extends HouseholdObjects
{
    private final boolean isAssemblyRequired;
    private final String  frameMaterial;

    private static final String FRAME_WOOD  = "wood";
    private static final String FRAME_METAL = "metal";
    private static final String FRAME_OTHER = "other";

    /**
     * Constructs a new HouseholdObjects instance.
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param isAssemblyRequired   True if assembly is required, False otherwise
     * @param frameMaterial        The material of the furniture.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public Furniture(final String  householdObjectName,
                     final String  householdObjectBrand,
                     final double  priceCAD,
                     final String  householdObjectColor,
                     final boolean isElectric,
                     final boolean isAssemblyRequired,
                     final String  frameMaterial)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric);

        if(frameMaterial != null &&
                (
                        !frameMaterial.equalsIgnoreCase(FRAME_WOOD)
                        && !frameMaterial.equalsIgnoreCase(FRAME_METAL)
                )
        )
        {
            throw new IllegalArgumentException("Invalid frame material: " + frameMaterial);
        }

        this.isAssemblyRequired = isAssemblyRequired;
        this.frameMaterial      = frameMaterial;
    }

    /**
     * Checks if assembly is required for the furniture.
     * @return True if assembly is required, false otherwise.
     */
    public boolean isAssemblyRequired()
    {
        return isAssemblyRequired;
    }

    /**
     * Gets the material of the furniture frame.
     * @return The material of the furniture frame.
     */
    public String getFrameMaterial()
    {
        return frameMaterial;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Furniture" for this class.
     */
    @Override
    public String getType()
    {
        return "Furniture";
    }
}
