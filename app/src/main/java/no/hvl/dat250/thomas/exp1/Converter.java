package no.hvl.dat250.thomas.exp1;

public class Converter {

    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;

    /**
     * Convert method, takes in a value, the unit of that value, and the unit to return the value as.
     * Units are: "in" - inch, "ft" - feet, "mi" - miles, "m" - meter
     * @param value the value that will be converted
     * @param fromUnit string of the unit the value is in, can be "in" "ft" "mi" "m"
     * @param toUnit string of the unit the value will be, can be "in" "ft" "mi" "m"
     * @return returns the converted value
     */
    public static double convert(double value, String fromUnit, String toUnit) {

        double inMeters = switch (fromUnit) {
            case "in" -> value * IN_TO_METER;
            case "ft" -> value * FT_TO_METER;
            case "mi" -> value * MI_TO_METER;
            case "m" -> value;
            default -> Double.NaN;
        };

        return switch (toUnit) {
            case "in" -> inMeters / IN_TO_METER;
            case "ft" -> inMeters / FT_TO_METER;
            case "mi" -> inMeters / MI_TO_METER;
            case "m" -> inMeters;
            default -> Double.NaN;
        };
    }
}
