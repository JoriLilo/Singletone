package ushtrime;

public enum ConversionType {
    Meters_to_yards(1.99D),
    METERS_TO_YARDS(0.64D),
    YARDS_TO_METERS(0.76D),
    CENTIMETERS_TO_INCHES(0.976D),
    INCHES_TO_CENTIMETERS(0309D),
    KILOMETERS_TO_MILES(92838D),
    MILES_TO_KILOMETER(7266D);
    public final double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }
}
