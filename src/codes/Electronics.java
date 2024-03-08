/**
 * Represents an electronic household item with specific attributes in addition to common household attributes.
 * This class extends HouseHoldObjects class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */
public class Electronics extends HouseholdObjects
{
    private final int    voltageV;
    private final String itemConnectivity;
    private final String powerSource;

    private static final int    MIN_VOLTAGE            = 0;
    private static final int    MAX_VOLTAGE            = 250;
    private static final String CONNECTIVITY_BLUETOOTH = "bluetooth";
    private static final String CONNECTIVITY_WIFI      = "wifi";
    private static final String CONNECTIVITY_NA        = "n/a";
    private static final String POWER_SOURCE_AC        = "ac";
    private static final String POWER_SOURCE_BATTERY   = "battery";
    private static final String POWER_SOURCE_OTHER     = "other";

    /**
     * Constructs a new HouseholdObjects instance.
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param voltageV             The voltage requirement of the electronics.
     * @param itemConnectivity     The type of connectivity of the electronics.
     * @param powerSource          The type of power source for the electronics.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public Electronics(final String   householdObjectName,
                       final String   householdObjectBrand,
                       final double   priceCAD,
                       final String   householdObjectColor,
                       final boolean  isElectric,
                       final int      voltageV,
                       final String   itemConnectivity,
                       final String   powerSource)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric);

        if(voltageV < MIN_VOLTAGE || voltageV > MAX_VOLTAGE)
        {
            throw new IllegalArgumentException("Invalid voltage: " + voltageV);
        }

        if(itemConnectivity != null &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_BLUETOOTH) &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_WIFI) &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_NA))
        {
            throw new IllegalArgumentException("Invalid electronic connectivity: " + itemConnectivity);
        }

        if(powerSource != null &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_AC) &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_BATTERY) &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_OTHER))
        {
            throw new IllegalArgumentException("Invalid power source" + powerSource);
        }

        this.voltageV           = voltageV;
        this.itemConnectivity   = itemConnectivity;
        this.powerSource        = powerSource;
    }

    /**
     * Gets the voltage requirement of the electronics.
     * @return The voltage requirement of the electronics.
     */
    public int getVoltageV()
    {
        return voltageV;
    }

    /**
     * Gets the type of connectivity of the electronics.
     * @return The type of connectivity of the electronics.
     */
    public String getItemConnectivity()
    {
        return itemConnectivity;
    }

    /**
     * Gets the type of power source for the electronics.
     * @return The type of power source for the electronics.
     */
    public String getPowerSource()
    {
        return powerSource;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Electronics" for this class.
     */
    @Override
    public String getType()
    {
        return "Electronics";
    }
}
