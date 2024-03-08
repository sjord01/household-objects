/**
 * Represents a television, an electronic household item, with specific attributes in addition to common household attributes.
 * This class extends Electronics class.
 *
 * @author Emma, Chris Helmhold, Vandna, Samson Ordonez
 * @version 1.0
 */

public class Television extends Electronics
{
    private final double  screenSizeInches;
    private final String  resolution;
    private final int     refreshRateHz;
    private final boolean isSmartTv;

    private static final int MIN_SCREEN_SIZE_INCHES = 19;
    private static final int MAX_SCREEN_SIZE_INCHES = 300;
    private static final int MIN_REFRESH_RATE_HZ = 30;
    private static final int MAX_REFRESH_RATE_HZ = 600;
    private static final String FULL_HD = "1080p";
    private static final String ULTRA_HD = "4k";

    /**
     * Constructs a new Television instance.
     * @param householdObjectName  The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param priceCAD             The price of the household object in CAD.
     * @param householdObjectColor The color of the household object.
     * @param isElectric           Indicates if the household object is electrically powered.
     * @param voltageV             The voltage requirement of the electronics.
     * @param itemConnectivity     The type of connectivity of the electronics.
     * @param powerSource          The type of power source for the electronics.
     * @param screenSizeInches     The size of the television screen in inches.
     * @param resolution           The resolution of the television.
     * @param refreshRateHz        The refresh rate of the television in Hertz.
     * @param isSmartTv            Indicates if the television is a smart TV.
     * @throws NullPointerException     If any of the parameters are null.
     * @throws IllegalArgumentException If any parameter fails validation.
     */
    public Television(final String  householdObjectName,
                      final String  householdObjectBrand,
                      final double  priceCAD,
                      final String  householdObjectColor,
                      final boolean isElectric,
                      final int     voltageV,
                      final String  itemConnectivity,
                      final String  powerSource,
                      final double  screenSizeInches,
                      final String  resolution,
                      final int     refreshRateHz,
                      final boolean isSmartTv)
    {
        super(householdObjectName, householdObjectBrand, priceCAD, householdObjectColor, isElectric, voltageV, itemConnectivity, powerSource);

        if(screenSizeInches < MIN_SCREEN_SIZE_INCHES || screenSizeInches > MAX_SCREEN_SIZE_INCHES)
        {
            throw new IllegalArgumentException("Invalid screen size: " + screenSizeInches);
        }

        if(!resolution.equalsIgnoreCase(FULL_HD) &&
                !resolution.equalsIgnoreCase(ULTRA_HD))
        {
            throw new IllegalArgumentException("Invalid resolution: " + resolution);
        }

        if(refreshRateHz < MIN_REFRESH_RATE_HZ || refreshRateHz > MAX_REFRESH_RATE_HZ)
        {
            throw new IllegalArgumentException("Invalid refresh rate: " + refreshRateHz);
        }

        this.screenSizeInches   = screenSizeInches;
        this.resolution         = resolution;
        this.refreshRateHz      = refreshRateHz;
        this.isSmartTv          = isSmartTv;
    }

    /**
     * Gets the size of the television screen in inches.
     * @return The size of the television screen.
     */
    public double getScreenSizeInches()
    {
        return screenSizeInches;
    }

    /**
     * Gets the resolution of the television screen in inches.
     * @return The resolution of the television screen.
     */
    public String getResolution()
    {
        return resolution;
    }

    /**
     * Gets the refresh rate of the television screen in inches.
     * @return The refresh rate of the television screen.
     */
    public int getRefreshRateHz()
    {
        return refreshRateHz;
    }

    /**
     * Checks if the television is a smart TV.
     * @return true if the television is a smart TV, false otherwise.
     */
    public boolean isSmartTv()
    {
        return isSmartTv;
    }

    /**
     * Gets the type of the household object.
     * @return The type of the household object, which is "Television" for this class.
     */
    @Override
    public String getType()
    {
        return "Television";
    }
}
