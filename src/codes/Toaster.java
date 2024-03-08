/**
 * Represents a toaster, an electronic household item, with specific attributes in addition to common household attributes.
 * This class extends Electronics class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Toaster extends Electronics
{
    private final int       toastBagelMinutes;
    private final boolean   hasDefrostFunction;

    private static final int MIN_TOASTING_MINUTES = 1;
    private static final int MAX_TOASTING_MINUTES = 10;

    /**
     * Constructs a new Toaster instance.
     *
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param voltageV             The voltage requirement of the electronics.
     * @param itemConnectivity     The type of connectivity of the electronics.
     * @param powerSource          The type of power source for the electronics.
     * @param toastBagelMinutes    The minutes required for toasting bagels.
     * @param hasDefrostFunction   Indicates if the toaster has a defrost function.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public Toaster(final String   householdObjectName,
                   final String   householdObjectBrand,
                   final double   priceCAD,
                   final String   householdObjectColor,
                   final boolean  isElectric,
                   final int      voltageV,
                   final String   itemConnectivity,
                   final String   powerSource,
                   final int      toastBagelMinutes,
                   final boolean  hasDefrostFunction)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric, voltageV, itemConnectivity, powerSource);

        if(toastBagelMinutes < MIN_TOASTING_MINUTES || toastBagelMinutes > MAX_TOASTING_MINUTES)
        {
            throw new IllegalArgumentException("Invalid minutes for toasting bagels: " + toastBagelMinutes);
        }

        this.toastBagelMinutes      = toastBagelMinutes;
        this.hasDefrostFunction     = hasDefrostFunction;
    }


    /**
     * Gets the minutes required for toasting bagels.
     * @return The minutes required for toasting bagels.
     */
    public int getToastBagelMinutes()
    {
        return toastBagelMinutes;
    }

    /**
     * Checks if the toaster has a defrost function.
     * @return True if the toaster has a defrost function, false otherwise.
     */
    public boolean isHasDefrostFunction()
    {
        return hasDefrostFunction;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Toaster" for this class.
     */
    @Override
    public String getType()
    {
        return "Toaster";
    }
}