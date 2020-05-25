import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;

public class UsCurrencyChecker {
    private static final String CURRENCY_PATTERN = "\\$\\s?\\d+(\\.\\d{1,2})?";
    private static final Pattern currenyPATTERN = Pattern.compile(CURRENCY_PATTERN);
    public static Matcher getMatcher(String usCurrencyString) {
        throw new NotImplementedException();
    }
}
