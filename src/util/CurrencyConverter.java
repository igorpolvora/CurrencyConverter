package util;

public class CurrencyConverter {
	
    public static double converter(double bought, double dollar) {
        double baseValue = dollar * bought;
        double iof = baseValue * 0.06;
        return baseValue + iof;
    }
}
